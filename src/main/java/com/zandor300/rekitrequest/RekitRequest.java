package com.zandor300.rekitrequest;

import com.zandor300.rekitrequest.commands.RekitRequestCommand;
import com.zandor300.zsutilities.commandsystem.CommandManager;
import com.zandor300.zsutilities.utilities.Chat;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;

import java.io.IOException;

/**
 * Created by Zandor on 3/23/15.
 */
public class RekitRequest extends JavaPlugin {

	private static Chat chat = new Chat("RekitRequest");
	private static RekitRequest plugin;

	public static Chat getChat() {
		return chat;
	}

	public static RekitRequest getPlugin() {
		return plugin;
	}

	@Override
	public void onEnable() {
		chat.sendConsoleMessage("Setting things up...");

		plugin = this;

		chat.sendConsoleMessage("Sending metrics...");
		try {
			new Metrics(this).start();
			chat.sendConsoleMessage("Submitted stats to MCStats.org.");
		} catch (IOException e) {
			chat.sendConsoleMessage("Couldn't submit stats to MCStats.org...");
		}

		chat.sendConsoleMessage("Registering commands...");
		CommandManager cm = new CommandManager();
		cm.registerCommand(new RekitRequestCommand(), this);
		chat.sendConsoleMessage("Registered commands.");

		chat.sendConsoleMessage("Things are setup!");
		chat.sendConsoleMessage("Enabled.");

	}
}
