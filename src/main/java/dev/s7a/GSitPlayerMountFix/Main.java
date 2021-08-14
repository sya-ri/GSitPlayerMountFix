package dev.s7a.GSitPlayerMountFix;

import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void on(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Entity areaEffectCloud = player.getVehicle();
        if (areaEffectCloud instanceof AreaEffectCloud) {
            Entity vehicle = areaEffectCloud.getVehicle();
            if (vehicle instanceof Player) {
                areaEffectCloud.remove();
            }
        }
    }
}
