package com.hm.achievement.listener;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockPlaceEvent;

import com.hm.achievement.category.MultipleAchievements;
import com.hm.achievement.command.ReloadCommand;
import com.hm.achievement.db.DatabaseCacheManager;
import com.hm.achievement.utils.RewardParser;
import com.hm.mcshared.file.CommentedYamlConfiguration;

/**
 * Listener class to deal with Places achievements.
 * 
 * @author Pyves
 *
 */
@Singleton
public class AchieveBlockPlaceListener extends AbstractListener {

	@Inject
	public AchieveBlockPlaceListener(@Named("main") CommentedYamlConfiguration mainConfig, int serverVersion,
			Map<String, List<Long>> sortedThresholds, DatabaseCacheManager databaseCacheManager, RewardParser rewardParser,
			ReloadCommand reloadCommand) {
		super(mainConfig, serverVersion, sortedThresholds, databaseCacheManager, rewardParser, reloadCommand);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onBlockPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		if (!shouldIncreaseBeTakenIntoAccountNoPermissions(player)) {
			return;
		}

		Block block = event.getBlock();

		MultipleAchievements category = MultipleAchievements.PLACES;

		String blockName = block.getType().name().toLowerCase();
		if (!player.hasPermission(category.toPermName() + '.' + blockName)) {
			return;
		}
		if (mainConfig.isConfigurationSection(
				category + "." + blockName + ':' + block.getState().getData().toItemStack(0).getDurability())) {
			blockName += ":" + block.getState().getData().toItemStack(0).getDurability();
		} else if (!mainConfig.isConfigurationSection(category + "." + blockName)) {
			return;
		}

		updateStatisticAndAwardAchievementsIfAvailable(player, category, blockName, 1);
	}
}
