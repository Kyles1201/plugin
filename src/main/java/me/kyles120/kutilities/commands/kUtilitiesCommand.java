package me.kyles120.kutilities.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class kUtilitiesCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "" + ChatColor.UNDERLINE + "kUtilities");
            player.sendMessage(ChatColor.DARK_RED + "Ver: 0.0.1");


        }else if (sender instanceof ConsoleCommandSender) {
            System.out.println(ChatColor.RED + "" + ChatColor.UNDERLINE + "kUtilities");
            System.out.println(ChatColor.DARK_RED + "Ver: 0.0.1");
        }
        return true;
    }

}
