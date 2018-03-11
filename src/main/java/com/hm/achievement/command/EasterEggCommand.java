package com.hm.achievement.command;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.apache.commons.lang3.StringEscapeUtils;
import org.bukkit.command.CommandSender;

import com.hm.mcshared.file.CommentedYamlConfiguration;

/**
 * Class in charge of handling the /aach hcaa command, which displays a small easter egg in the in-game chat. Run it and
 * you'll see what all this mess is about
 * 
 * @author Pyves
 */
@Singleton
public class EasterEggCommand extends AbstractCommand {

	@Inject
	public EasterEggCommand(@Named("main") CommentedYamlConfiguration mainConfig,
			@Named("lang") CommentedYamlConfiguration langConfig, StringBuilder pluginHeader, ReloadCommand reloadCommand) {
		super(mainConfig, langConfig, pluginHeader, reloadCommand);
	}

	@Override
	void executeCommand(CommandSender sender, String[] args) {
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§4\u2592§4\u2592§c\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§4\u2592§4\u2592§4\u2592§c\u2592§c\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§c\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§7\u2592§0\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§8\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§4\u2592§4\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§8\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§4\u2592§4\u2592§6\u2592§6\u2592§8\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§8\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§0\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§4\u2592§6\u2592§6\u2592§6\u2592§6\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§8\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§8\u2592§8\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§6\u2592§6\u2592§6\u2592§6\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§0\u2592§8\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§7\u2592§6\u2592§6\u2592§4\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§0\u2592§0\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§0\u2592§8\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§8\u2592§8\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§4\u2592§4\u2592§4\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§0\u2592§8\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§8\u2592§8\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§4\u2592§4\u2592§4\u2592§7\u2592§7\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§8\u2592§8\u2592§f\u2592§7\u2592§f\u2592§7\u2592§f\u2592§f\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§4\u2592§4\u2592§4\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§4\u2592§4\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§f\u2592§f\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§4\u2592§4\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§0\u2592§0\u2592§0\u2592§4\u2592§4\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§f\u2592§f\u2592§7\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§4\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§8\u2592§8\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§0\u2592§0\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§0\u2592§0\u2592§0\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
		sender.sendMessage(StringEscapeUtils.unescapeJava(
				"§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§7\u2592§5\u2592§5\u2592§5\u2592§5\u2592§7\u2592§r"));
	}
}
