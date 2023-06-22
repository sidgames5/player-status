package com.sidgames5.status;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PlayerStatus extends JavaPlugin {
    private static final Logger logger = LoggerFactory.getLogger("PlayerStatus");
    public static final String VERSION = "1.0.0";

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("Starting PlayerStatus " + VERSION);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("Stopping PlayerStatus");
    }
}
