package ca.demetryromanowski.tdb;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;
import java.util.List;

public final class TowerDefense extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("onEnable Invokation");
    }

    @Override
    public void onDisable(){
        getLogger().info("onDisable Invokation");
    }

    @EventHandler
    public void onPlayerInteractBlock(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Block b = player.getLocation().getBlock();

        if(player.getItemInHand().getType() == Material.FISHING_ROD){

        }
    }
}
