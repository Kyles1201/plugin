package me.kyles120.kutilities.commands;

import com.sun.tools.jconsole.JConsoleContext;
import org.bukkit.command.Command;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Bukkit.getServer;

public class command1 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if(args.length == 0){
                player.sendMessage(ChatColor.BLUE + "No arguments provided");
            }else if(args.length <= 5){
                StringBuilder builder = new StringBuilder();
                for(int i = 0; i < args.length; i++){

                builder.append(args[i]);
                builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();

                player.sendMessage(ChatColor.AQUA + finalMessage);


                if(finalMessage.length() <= 19){
                    player.sendMessage(ChatColor.GREEN + "Successfully changed name to " + ChatColor.GRAY + finalMessage);
                    getServer().dispatchCommand(getServer().getConsoleSender(), "night");

                }else{
                    player.sendMessage(ChatColor.DARK_RED + "To many Charcters. Max is 19");
                }

            }else if(args.length >= 6){
                player.sendMessage(ChatColor.RED + "To many arguments");
            }

        }else if (sender instanceof ConsoleCommandSender) {
            System.out.println("You can not run this command via console");
        }
        return true;
    }

}
