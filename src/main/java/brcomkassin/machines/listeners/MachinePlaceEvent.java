package brcomkassin.machines.listeners;

import brcomkassin.machines.MachineManager;
import brcomkassin.machines.MachineType;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class MachinePlaceEvent implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = event.getItemInHand();

        if (itemInHand.getType() == Material.AIR) return;

        String data = MachineManager.getMachineData(itemInHand);

        if (MachineType.))

    }


}
