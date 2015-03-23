package com.zandor300.rekitrequest;

import com.zandor300.zsutilities.utilities.Chat;
import org.bukkit.plugin.java.JavaPlugin;

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

	}
}
