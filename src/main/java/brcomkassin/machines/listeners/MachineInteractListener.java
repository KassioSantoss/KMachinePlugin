package brcomkassin.machines.listeners;

import brcomkassin.machines.Machine;
import brcomkassin.machines.MachineCache;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class MachineInteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        Block block = event.getClickedBlock();
        assert block != null;
        Location machineLocation = block.getLocation();

        if (itemInHand.getType() == Material.AIR) return;

        if (MachineCache.hasMachine(machineLocation)) {
            Machine machine = MachineCache.getMachine(machineLocation);

            player.sendMessage("Voce acabou de interagir com uma máquina!");
            player.sendMessage("nome: " + machine.getName());
            player.sendMessage("id: " + machine.getId());
            player.sendMessage("type: " + machine.getType());
        }
    }

}
