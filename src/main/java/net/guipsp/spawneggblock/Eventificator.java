package net.guipsp.spawneggblock;

import org.bukkit.event.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class Eventificator implements Listener {
	public Eventificator() {
	}

	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		if (event.getSpawnReason() == SpawnReason.SPAWNER_EGG) {
			event.setCancelled(true);
		}

	}

}
