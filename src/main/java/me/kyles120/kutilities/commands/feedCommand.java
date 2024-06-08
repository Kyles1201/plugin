package me.kyles120.kutilities.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class feedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            player.setFoodLevel(player.getFoodLevel() + 3);

        }else if (sender instanceof ConsoleCommandSender) {
            System.out.println("You can not run this command via console");
        }
        return true;
    }

}
