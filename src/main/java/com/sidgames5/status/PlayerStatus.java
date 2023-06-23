package com.sidgames5.status;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sidgames5.status.SharedConstants.NAME;
import static com.sidgames5.status.SharedConstants.VERSION;

public final class PlayerStatus extends JavaPlugin {
    private static final Logger logger = LoggerFactory.getLogger(NAME);


    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("Starting " + NAME + " " + VERSION);

        logger.info("Registering commands");
        getCommand("setstatus").setExecutor(new CommandHandler());
        logger.info("Commands registered");

        logger.info("Started " + NAME);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("Stopping PlayerStatus");
    }
}
