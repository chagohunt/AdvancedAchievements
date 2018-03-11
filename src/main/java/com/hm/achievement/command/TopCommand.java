package com.hm.achievement.command;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.hm.achievement.db.AbstractSQLDatabaseManager;
import com.hm.achievement.lang.command.CmdLang;
import com.hm.mcshared.file.CommentedYamlConfiguration;

/**
 * Class in charge of handling the /aach top command, which displays global rankings.
 *
 * @author Pyves
 */
@Singleton
public class TopCommand extends AbstractRankingCommand {

	@Inject
	public TopCommand(@Named("main") CommentedYamlConfiguration mainConfig,
			@Named("lang") CommentedYamlConfiguration langConfig, StringBuilder pluginHeader, ReloadCommand reloadCommand,
			Logger logger, int serverVersion, AbstractSQLDatabaseManager sqlDatabaseManager) {
		super(mainConfig, langConfig, pluginHeader, reloadCommand, logger, serverVersion, CmdLang.TOP_ACHIEVEMENT,
				sqlDatabaseManager);
	}

	@Override
	long getRankingStartTime() {
		// All time ranking, no time start.
		return 0L;
	}
}
