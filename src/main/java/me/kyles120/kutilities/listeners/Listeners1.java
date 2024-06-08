package me.kyles120.kutilities.listeners;

import net.md_5.bungee.api.chat.hover.content.Item;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.SculkCatalyst;
import org.bukkit.block.Block;
import org.bukkit.block.TileState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.block.SculkBloomEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.tags.ItemTagType;
import org.bukkit.material.types.*;

public class Listeners1 implements Listener
{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent JoinE){

        Player player = JoinE.getPlayer();
        String name = player.getDisplayName();

        if (player.hasPlayedBefore()){

        player.sendMessage(ChatColor.AQUA + "Welcome back to the server " + name + "!");
        System.out.println(name + " has joined the server.");

        }else{
            player.sendMessage(ChatColor.BLUE + name + " Welcome to the server for the first time!");
        }

    }


    @EventHandler
    public void onDiamondMine(BlockBreakEvent e){
        Player player = e.getPlayer();
        Block block = e.getBlock();
        String name2 = player.getDisplayName();

        if (e.getBlock().getType() == Material.DIAMOND_BLOCK)
        {
            e.setCancelled(true);
            player.setHealth(0.5);
        }else{
            player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + name2 + " Mined a block!");
        }
    }

    //@EventHandler
    //public void onSculkSpread(PotionSplashEvent e) {
    //Block block = e.getHitBlock();
    //int charges = 50;
    //SculkCatalyst.bloom(block, charges);

    public interface SculkCatalyst extends TileState{};

    @EventHandler
    public void onSculkSpread(PotionSplashEvent e){
        Block block1 = e.getHitBlock();




    }
}
