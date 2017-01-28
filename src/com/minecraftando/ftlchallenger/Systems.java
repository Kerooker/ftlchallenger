package com.minecraftando.ftlchallenger;

public enum Systems {

	SHIELDS, ENGINES, OXYGEN, WEAPONS, DRONES, MEDBAY, PILOTING, SENSORS, DOORS, BATTERY, TELEPORTER, CLOAKING, BEAM, FLAK, CLONE, MIND, HACKING;

	@Override
	public String toString() {
		return capitalize(this.name().toLowerCase());
	}

	private String capitalize(final String line) {
		return Character.toUpperCase(line.charAt(0)) + line.substring(1);
	}

}
