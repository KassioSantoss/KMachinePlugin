package brcomkassin.machines;

import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineCache {

    private final static Map<Location, Machine> MACHINES_PLACED = new HashMap<>();

    public static boolean hasMachine(Location location) {
        return MACHINES_PLACED.containsKey(location);
    }

    public static Machine getMachine(Location location) {
        return MACHINES_PLACED.get(location);
    }

    public static void registerMachine(Location location, Machine machine) {
        MACHINES_PLACED.put(location, machine);
    }

    public static void removeMachine(Location location, Machine machine) {
        MACHINES_PLACED.remove(location);
    }

}
