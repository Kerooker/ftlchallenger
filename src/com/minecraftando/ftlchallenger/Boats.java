package com.minecraftando.ftlchallenger;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum Boats {

	KESTREL_A("Kestrel:A", true, true, true, true, false, true, true, true, true, false, false, false, false, false,
			false, false, false, "Resources/Ships/kestrel_A.png"), KESTREL_B("Red-Tail:B", true, true, true, true,
					false, true, true, true, true, false, false, false, false, false, false, false, false,
					"Resources/Ships/kestrel_B.png"), KESTREL_C("The Swallow:C", true, true, true, true, false, false,
							true, true, true, false, false, false, false, false, true, false, false,
							"Resources/Ships/kestrel_C.png"), ENGI_CRUISER_A("The Torus:A", true, true, true, true,
									true, true, true, true, true, false, false, false, false, false, false, false,
									false, "Resources/Ships/engi_A.png"), ENGI_CRUISER_B("The Vortex:B", true, true,
											true, true, true, true, true, false, true, false, false, false, false,
											false, false, false, false, "Resources/Ships/engi_B.png"), ENGI_CRUISER_C(
													"Tetragon:C", true, true, true, true, true, false, true, true, true,
													false, false, false, false, false, true, false, true,
													"Resources/Ships/engi_C.png"), FEDERATION_CRUISER_A("The Osprey:A",
															true, true, true, true, false, true, true, true, true,
															false, false, false, true, false, false, false, false,
															"Resources/Ships/fed_A.png"), FEDERATION_CRUISER_B(
																	"Nisos:B", true, true, true, true, false, true,
																	true, true, true, false, false, false, true, false,
																	false, false, false,
																	"Resources/Ships/fed_B.png"), FEDERATION_CRUISER_C(
																			"The Fregatidae:C", true, true, true, true,
																			false, false, true, true, true, false, true,
																			false, false, true, true, false, false,
																			"Resources/Ships/fed_C.png"), ZOLTAN_CRUISER_A(
																					"The Adjudicator:A", true, true,
																					true, true, false, true, true, true,
																					true, false, false, false, false,
																					false, false, false, false,
																					"Resources/Ships/zoltan_A.png"), ZOLTAN_CRUISER_B(
																							"Noether:B", true, true,
																							true, true, false, true,
																							true, true, true, false,
																							false, false, false, false,
																							false, false, false,
																							"Resources/Ships/zoltan_B.png"), ZOLTAN_CRUISER_C(
																									"Cerenkov:C", true,
																									true, true, true,
																									true, false, true,
																									true, true, true,
																									false, false, false,
																									false, true, false,
																									false,
																									"Resources/Ships/zoltan_C.png"), MANTIS_CRUISER_A(
																											"The Gila Monster:A",
																											true, true,
																											true, true,
																											false, true,
																											true, false,
																											true, false,
																											true, false,
																											false,
																											false,
																											false,
																											false,
																											false,
																											"Resources/Ships/mantis_A.png"), MANTIS_CRUISER_B(
																													"The Basilisk:B",
																													true,
																													true,
																													true,
																													true,
																													true,
																													true,
																													true,
																													true,
																													true,
																													false,
																													true,
																													false,
																													false,
																													false,
																													false,
																													false,
																													false,
																													"Resources/Ships/mantis_B.png"), MANTIS_CRUISER_C(
																															"The Theseus:C",
																															true,
																															true,
																															true,
																															true,
																															false,
																															false,
																															true,
																															true,
																															true,
																															false,
																															true,
																															false,
																															false,
																															false,
																															true,
																															false,
																															false,
																															"Resources/Ships/mantis_C.png"), SLUG_CRUISER_A(
																																	"Man of War:A",
																																	true,
																																	true,
																																	true,
																																	true,
																																	false,
																																	true,
																																	true,
																																	true,
																																	false,
																																	false,
																																	false,
																																	false,
																																	false,
																																	false,
																																	false,
																																	false,
																																	false,
																																	"Resources/Ships/slug_A.png"), SLUG_CRUISER_B(
																																			"The Stormwalker:B",
																																			true,
																																			true,
																																			true,
																																			true,
																																			false,
																																			false,
																																			true,
																																			false,
																																			true,
																																			false,
																																			true,
																																			false,
																																			false,
																																			false,
																																			false,
																																			false,
																																			false,
																																			"Resources/Ships/slug_B.png"), SLUG_CRUISER_C(
																																					"Ariolimax:C",
																																					true,
																																					true,
																																					true,
																																					true,
																																					false,
																																					false,
																																					true,
																																					false,
																																					true,
																																					false,
																																					false,
																																					false,
																																					false,
																																					false,
																																					true,
																																					true,
																																					true,
																																					"Resources/Ships/slug_C.png"), ROCK_CRUISER_A(
																																							"Bulwark:A",
																																							true,
																																							true,
																																							true,
																																							true,
																																							false,
																																							true,
																																							true,
																																							true,
																																							true,
																																							false,
																																							false,
																																							false,
																																							false,
																																							false,
																																							false,
																																							false,
																																							false,
																																							"Resources/Ships/rock_A.png"), ROCK_CRUISER_B(
																																									"Shivan:B",
																																									true,
																																									true,
																																									true,
																																									true,
																																									false,
																																									true,
																																									true,
																																									true,
																																									false,
																																									false,
																																									false,
																																									false,
																																									false,
																																									false,
																																									false,
																																									false,
																																									false,
																																									"Resources/Ships/rock_B.png"), ROCK_CRUISER_C(
																																											"Tektite:C",
																																											true,
																																											true,
																																											true,
																																											true,
																																											false,
																																											false,
																																											true,
																																											true,
																																											true,
																																											false,
																																											false,
																																											false,
																																											false,
																																											false,
																																											true,
																																											false,
																																											false,
																																											"Resources/Ships/rock_C.png"), STEALTH_CRUISER_A(
																																													"The Nesasio:A",
																																													false,
																																													true,
																																													true,
																																													true,
																																													false,
																																													true,
																																													true,
																																													true,
																																													true,
																																													false,
																																													false,
																																													true,
																																													false,
																																													false,
																																													false,
																																													false,
																																													false,
																																													"Resources/Ships/stealth_A.png"), STEALTH_CRUISER_B(
																																															"DA_SR 12:B",
																																															false,
																																															true,
																																															true,
																																															true,
																																															false,
																																															true,
																																															true,
																																															true,
																																															true,
																																															false,
																																															false,
																																															true,
																																															false,
																																															false,
																																															false,
																																															false,
																																															false,
																																															"Resources/Ships/stealth_B.png"), STEALTH_CRUISER_C(
																																																	"Simo-H:C",
																																																	false,
																																																	true,
																																																	true,
																																																	true,
																																																	true,
																																																	false,
																																																	true,
																																																	false,
																																																	true,
																																																	false,
																																																	false,
																																																	false,
																																																	false,
																																																	false,
																																																	true,
																																																	false,
																																																	false,
																																																	"Resources/Ships/stealth_C.png"), LANIUS_CRUISER_A(
																																																			"Kruos:A",
																																																			true,
																																																			true,
																																																			true,
																																																			true,
																																																			false,
																																																			false,
																																																			true,
																																																			true,
																																																			true,
																																																			false,
																																																			false,
																																																			false,
																																																			false,
																																																			false,
																																																			true,
																																																			false,
																																																			true,
																																																			"Resources/Ships/lanius_A.png"), LANIUS_CRUISER_B(
																																																					"The Shrike:B",
																																																					true,
																																																					true,
																																																					false,
																																																					true,
																																																					false,
																																																					false,
																																																					true,
																																																					true,
																																																					true,
																																																					false,
																																																					true,
																																																					false,
																																																					false,
																																																					false,
																																																					true,
																																																					true,
																																																					false,
																																																					"Resources/Ships/lanius_B.png"), CRYSTAL_CRUISER_A(
																																																							"Bravais:A",
																																																							true,
																																																							true,
																																																							true,
																																																							true,
																																																							false,
																																																							true,
																																																							true,
																																																							true,
																																																							true,
																																																							false,
																																																							false,
																																																							false,
																																																							false,
																																																							false,
																																																							false,
																																																							false,
																																																							false,
																																																							"Resources/Ships/crystal_A.png"), CRYSTAL_CRUISER_B(
																																																									"Carnelian:B",
																																																									true,
																																																									true,
																																																									true,
																																																									true,
																																																									false,
																																																									true,
																																																									true,
																																																									true,
																																																									true,
																																																									false,
																																																									true,
																																																									true,
																																																									false,
																																																									false,
																																																									false,
																																																									false,
																																																									false,
																																																									"Resources/Ships/crystal_B.png");

	private final boolean shields;
	private final boolean engines;
	private final boolean oxygen;
	private final boolean weapon_Control;
	private final boolean drone_Control;
	private final boolean medbay;
	private final boolean piloting;
	private final boolean sensors;
	private final boolean door_System;
	private final boolean backup_Battery;
	private final boolean crew_Teleporter;
	private final boolean cloaking;
	private final boolean artillery_Beam;
	private final boolean flak_Artillery;
	private final boolean clone_Bay;
	private final boolean mind_Control;
	private final boolean hacking;
	private final String nome;
	private final String imageUrl;

	Boats(String nome, boolean shields, boolean engines, boolean oxygen, boolean weapon_Control, boolean drone_Control,
			boolean medbay, boolean piloting, boolean sensors, boolean door_System, boolean backup_Battery,
			boolean crew_Teleporter, boolean cloaking, boolean artillery_Beam, boolean flak_Artillery,
			boolean clone_Bay, boolean mind_Control, boolean hacking, String imageUrl) {

		this.nome = nome;
		this.shields = shields;
		this.engines = engines;
		this.oxygen = oxygen;
		this.weapon_Control = weapon_Control;
		this.drone_Control = drone_Control;
		this.medbay = medbay;
		this.piloting = piloting;
		this.sensors = sensors;
		this.door_System = door_System;
		this.backup_Battery = backup_Battery;
		this.clone_Bay = clone_Bay;
		this.mind_Control = mind_Control;
		this.hacking = hacking;
		this.crew_Teleporter = crew_Teleporter;
		this.cloaking = cloaking;
		this.artillery_Beam = artillery_Beam;
		this.flak_Artillery = flak_Artillery;
		this.imageUrl = imageUrl;

	}

	public boolean hasShields() {
		return shields;
	}

	public ImageIcon getImage() {
		//Resources/Ships/kestrel_B.png
		
		String imageUrl = this.imageUrl.replaceAll("Resources", "");
		System.out.println(imageUrl);
		BufferedImage imagem = null;
		
		try {
			imagem = ImageIO.read(getClass().getResource(imageUrl));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ImageIcon(imagem);
	}

	public boolean hasEngines() {
		return engines;
	}

	public boolean hasOxygen() {
		return oxygen;
	}

	public boolean hasWeapon_Control() {
		return weapon_Control;
	}

	public boolean hasDrone_Control() {
		return drone_Control;
	}

	public boolean hasMedbay() {
		return medbay;
	}

	public boolean hasPiloting() {
		return piloting;
	}

	public boolean hasSensors() {
		return sensors;
	}

	public boolean hasDoor_System() {
		return door_System;
	}

	public boolean hasBackup_Battery() {
		return backup_Battery;
	}

	public boolean hasCrew_Teleporter() {
		return crew_Teleporter;
	}

	public boolean hasCloaking() {
		return cloaking;
	}

	public boolean hasArtillery_Beam() {
		return artillery_Beam;
	}

	public boolean hasFlak_Artillery() {
		return flak_Artillery;
	}

	public boolean hasClone_Bay() {
		return clone_Bay;
	}

	public boolean hasMind_Control() {
		return mind_Control;
	}

	public boolean hasHacking() {
		return hacking;
	}

	public String getNome() {
		return nome.split(":")[0];
	}

	public String getType() {
		return nome.split(":")[1];
	}

	public List<Systems> getSystems() {
		ArrayList<Systems> systems = new ArrayList<Systems>();
		if (shields)
			systems.add(Systems.SHIELDS);
		if (engines)
			systems.add(Systems.ENGINES);
		if (oxygen)
			systems.add(Systems.OXYGEN);
		if (weapon_Control)
			systems.add(Systems.WEAPONS);
		if (drone_Control)
			systems.add(Systems.DRONES);
		if (medbay)
			systems.add(Systems.MEDBAY);
		if (piloting)
			systems.add(Systems.PILOTING);
		if (sensors)
			systems.add(Systems.SENSORS);
		if (door_System)
			systems.add(Systems.DOORS);
		if (backup_Battery)
			systems.add(Systems.BATTERY);
		if (crew_Teleporter)
			systems.add(Systems.TELEPORTER);
		if (cloaking)
			systems.add(Systems.CLOAKING);
		if (artillery_Beam)
			systems.add(Systems.BEAM);
		if (flak_Artillery)
			systems.add(Systems.FLAK);
		if (clone_Bay)
			systems.add(Systems.CLONE);
		if (mind_Control)
			systems.add(Systems.MIND);
		if (hacking)
			systems.add(Systems.HACKING);

		return systems;

	}

}
