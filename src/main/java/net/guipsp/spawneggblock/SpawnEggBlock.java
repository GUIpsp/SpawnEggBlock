package net.guipsp.spawneggblock;

import org.bukkit.plugin.java.JavaPlugin;

public class SpawnEggBlock extends JavaPlugin {
	private Eventificator Eventificator;

	@Override
	public void onDisable() {
		System.out.println("Beep Bop Boop disabling SpawnEggBlock");
	}

	@Override
	public void onEnable() {
		System.out.println("Beep Bop Boop enabling SpawnEggBlock");
		Eventificator = new Eventificator();
		getServer().getPluginManager().registerEvents(Eventificator, this);
	}
}
