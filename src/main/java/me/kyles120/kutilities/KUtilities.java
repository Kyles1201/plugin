package me.kyles120.kutilities;

import me.kyles120.kutilities.commands.command1;
import me.kyles120.kutilities.commands.kUtilitiesCommand;
import me.kyles120.kutilities.listeners.Listeners1;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class KUtilities extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("kUtilities Enabled");

        getServer().getPluginManager().registerEvents(new Listeners1(), this);
        getCommand("kname").setExecutor(new command1());
        getCommand("kUtilities").setExecutor(new kUtilitiesCommand());
    }


    @Override
    public void onDisable() {

        System.out.println("kUtilities Disabled");
    }

}
