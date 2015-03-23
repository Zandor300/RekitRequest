package com.zandor300.rekitrequest.commands;

import com.zandor300.rekitrequest.RekitRequest;
import com.zandor300.zsutilities.commandsystem.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Zandor on 3/23/15.
 */
public class RekitRequestCommand extends Command {

	public RekitRequestCommand() {
		super("rekitrequest", "Request to be rekitted.");
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length == 0) {
			RekitRequest.getChat().sendMessage(sender, "Your kit will be given shortly.");
			RekitRequest.getChat().sendConsoleMessage(sender.getName() + " needs to be rekitted!");
		} else if(args[0].equalsIgnoreCase("info")) {
			RekitRequest.getChat().sendMessage(sender, "RekitRequest 1.0.0 by Zandor300");
		}
	}
}
