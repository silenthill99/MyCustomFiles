package fr.silenthill99.mycustomfiles;

import fr.silenthill99.mycustomfiles.commands.SetHomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance()
    {
        return instance;
    }

    @Override
    public void onEnable()
    {
        instance = this;
        getLogger().info("Le plugin est opérationnel !");
        commands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void commands()
    {
        getCommand("sethome").setExecutor(new SetHomeCommand());
    }
}
