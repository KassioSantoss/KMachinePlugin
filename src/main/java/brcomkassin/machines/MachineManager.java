package brcomkassin.machines;

import brcomkassin.KMachinePlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MachineManager {

    public static String getMachineData(ItemStack item) {
        if (item.getItemMeta() == null) return null;

        return Arrays.stream(MachineType.values())
                .map(machineType -> new NamespacedKey(KMachinePlugin.getInstance(), machineType.getData()))
                .filter(key -> item.getItemMeta().getPersistentDataContainer().has(key))
                .findFirst()
                .map(NamespacedKey::getKey)
                .orElse(null);

    }

    public static boolean hasMachine(String string) {


    }


}
