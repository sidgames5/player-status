package com.sidgames5.status;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class StatusManager {
    private static final Map<Player, String> list = new HashMap<>();

    public static String getStatus(Player player) {
        return list.get(player);
    }

    public static void setStatus(Player player, String status) {
        if (list.get(player) != null) {
            list.replace(player, status);
            player.setPlayerListName(Statuses.getDisplayName(status) + " " + player.getName());
            return;
        }
        list.put(player, status);
    }
}
