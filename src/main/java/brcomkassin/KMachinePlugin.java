package brcomkassin;

import org.bukkit.plugin.java.JavaPlugin;

public final class KMachinePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static KMachinePlugin getInstance() {
        return KMachinePlugin.getPlugin(KMachinePlugin.class);
    }
}
