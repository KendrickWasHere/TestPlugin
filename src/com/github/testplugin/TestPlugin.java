package com.github.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {


    public void onEnable() {

        System.out.println("w");
        Bukkit.broadcastMessage("Matt da goat");
    }

    public void onDisable(){
        System.out.println("");
    }


}
