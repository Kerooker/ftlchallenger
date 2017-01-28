package com.minecraftando.ftlchallenger;

import java.util.List;
import java.util.Random;

public class Challenge {

	private ChallengeType type;

	public ChallengeType getType() {
		return type;
	}

	private Boats boat;
	private Random random;

	public Challenge(ChallengeType type, Boats boat, Random random) {
		this.type = type;
		this.boat = boat;
		this.random = random;
	}

	public String[] getChallenge() {

		switch (type) {
		case UPGRADE:

			String[] title = {"That needs an upgrade!",
					"Upgrade that thing","Maybe I should upgrade?",
					"Reactor getting strong!",
					"This will be amazing!"};
			String description = "You must upgrade your ";
			List<Systems> sis = boat.getSystems();
			int sizeSis = sis.size();
			boolean bool = random.nextBoolean();
			if (bool) {
				description = "You cannot upgrade your ";
			}
			Systems randSystem = sis.get(random.nextInt(sizeSis));
			description = description + randSystem.toString();
			if (!bool) {
				description = description + (random.nextInt(3) + 1) + " times first";
			}
			return new String[] { title[random.nextInt(title.length)], description };

		case STORE:
			String[][] description1 = {
					{"I'm just looking, thanks", "You cannot buy from the store"},
					{"That's mine!", "You cannot sell to the store"},
					{"Ugh... A store", "You cannot jump to any store beacon<br>(if you have a choice)"},
					{"I love trading", "You must make a trade with every store you visit.<br>Fuel, Missiles, Drones and Hull Repair count!"},
					{"Getting there", "You must visit every store beacon you see"},
					{"I won't touch that gun", "You cannot buy weapons from the store"},
					{"You won't touch my gun", "You cannot sell weapons from the store"},
					{"I'm afraid of missiles", "You cannot trade missiles with the store"},
					{"These aren't the drones  I'm looking for", "You cannot trade drones with the store"},
					{"I have no fuel tank! Halp", "You cannot buy fuel from the store"},
					{"I don't want you.", "You cannot hire anyone from the store"},
					{"Gunpoint trading", "You may only buy something from the store if <br> you sell something before"}
			};
			int sizeDesc = description1.length;
			int pegar = random.nextInt(sizeDesc);
			String title1 = description1[pegar][0];
			String desc1 = description1[pegar][1];
			return new String[] { title1, desc1 };
		case ENEMY:
			String[][] description2 = {
					{"Crystalised", "You cannot attack Crystal ships"},
					{"They must be fixing something", "You cannot attack Engi ships"},
					{"I won't asfixiate", "You cannot attack Lanius ship"},
					{"These little bugs...", "You cannot attack mantis ships"},
					{"These rebels... Always rebelling", "You cannot attack Rebel ships<br>Final boss allowed"},
					{"Beep boop... Can't comunicate", "You cannot attack Auto ships"},
					{"Long live rock'n'rock", "You cannot attack Rock ships"},
					{"Disgusting!", "You cannot attack Slug ships"},
					{"UUhh, shining!! Pretty!!", "You cannot attack Zoltan shields"},
					{"You must be a friend.", "You cannot attack Federation ships"},
					{"I'm peaceful", "You cannot attack anyone at sector " + (random.nextInt(7)+1)}
			};
			int sizeDesc2 = description2.length;
			int pegar2 = random.nextInt(sizeDesc2);
			String title2 = description2[pegar2][0];
			String desc2 = description2[pegar2][1];
			return new String[] { title2, desc2 };
		case SURRENDER:
			String[][] description3 = { { "Is surrender an option?", "You must accept all surrenders" },
					{ "One shouldn't surrender", "You cannot accept any surrender" },
					{ "Why would I fight them?", "You must surrender crew member to slavers" }
			};
			int sizeDesc3 = description3.length;
			int pegar3 = random.nextInt(sizeDesc3);
			String title3 = description3[pegar3][0];
			String desc3 = description3[pegar3][1];
			return new String[] { title3, desc3 };
		case DISTRESS:
			String[][] description4 = {
					{"I ain't helping you", "You cannot jump to any distress beacon<br>(unless you have no option)"},
					{"Helping hand", "You must jump to all distress beacons you find"},
					{"Unhelping hand", "You must try to fight at all distress beacons you go"},
					{"Is this working?", "You must turn your distress signal on at least once<br>(by getting out of fuel)"},
					{"Lost in blue", "You cannot buy fuel or turn your distress signal on"}
			};
			int sizeDesc4 = description4.length;
			int pegar4 = random.nextInt(sizeDesc4);
			String title4 = description4[pegar4][0];
			String desc4 = description4[pegar4][1];
			return new String[] { title4, desc4 };
		case BATTLE:
			String[][] description5 = {
					{"Timebomb","You must disable your oxygen system while fighting"},
					{"Moral High Ground","No cloaking, hacking or mind controlling allowed"},
					{"Greedo", "In battle, you may only power your weapons when the enemy ship fires their first volley"},
					{"Sportsmanship", "If your enemy attacks cannot pierce your shield, you must lower your defences or jump away"},
					{"Killer Queensbury", "You may only attack undamaged systems or systemless rooms"},
					{"Above Orion's Belt", "You may never target enemy engines"},
					{"Time to think?", "You may not pause the game"},
					{"Runaway Train", "If your FTL charges while in battle, you must jump right away"},
					{"I is dying", "You must disable your medibay/clone bay systems during battle"},
					{"I can help you out of here", "Your pilot can't be piloting during a battle"},
					{"I'm all in", "You must defeat an enemy ship with all of your crew inside it"},
					{"No room to breath", "You must defeat an enemy ship by starving its crew of oxygen (no auto ships)"},
					{"Abductor", "You must mind control an enemy, bring him to your ship, then kill  for experiments"}
			};
			int sizeDesc5 = description5.length;
			int pegar5 = random.nextInt(sizeDesc5);
			String title5 = description5[pegar5][0];
			String desc5 = description5[pegar5][1];
			return new String[] { title5, desc5 };

		case EVENTS:
			String[][] description6 = {
					{"Ignorant Fool", "You cannot use any blue options"},
					{"Oven Checker", "If you find a star, you must go back to it before leaving the sector"},
					{"The holiday rush", "You may only use the exit beacon if the rebel fleet is currently occupying it"},
					{"RNGesus be praised", "You must sacrifice a crew member to the RNGesus at every exit beacon (if 2+ crew members)"},
					{"Weak spirit", "If the rebel fleet catch you, you must surrender"},
					{"I don't trust slavers", "Never buy from slavers"},
					{"High risk high reward", "You must always try to endanger your crew in events"}
			};
			int sizeDesc6 = description6.length;
			int pegar6 = random.nextInt(sizeDesc6);
			String title6 = description6[pegar6][0];
			String desc6 = description6[pegar6][1];
			return new String[] {title6,desc6};
		
		case CREW:
			String[][] description7 = {
					{"Isolation", "Never more than one crew member in a room"},
					{"No room for specialists", "Your crew can't master skills further before<br>having at least another skill learned"},
					{"Trust building", "New crew can't man rooms or teleport before<br>putting fire out, killing boarders or fixing breaches"},
					{"Panic room", "You must keep a systemless room manned"},
					{"Jump buddies", "If a crew member is alone during a jump, he<br> must be dismissed on arrival (if 2+ crew members)"},
					{"Trade at gunpoint", "Must dismiss a crew member if you visit a store and don't make a trade"},
					{"Tactless insertion", "Crew may only teleport into/out of systemless rooms"},
					{"I run this solo", "You cannot jump to a new sector if you have more than 1 crew member"},
					{"Team limits", "You must have at most " + (random.nextInt(7)+1) + " crew members"},
					{"You are no use to me", "You can only hire crew members from the store. Ones obtained via event must be dismissed"},
					{"It's better together", "You cannot have any crew member dead until sector " + (random.nextInt(6)+2)}
			};
			int sizeDesc7 = description7.length;
			int pegar7 = random.nextInt(sizeDesc7);
			String title7 = description7[pegar7][0];
			String desc7 = description7[pegar7][1];
			return new String[] {title7,desc7};
		case SYSTEMS:
			String[][] description8 = {
					{"Poor circulation", "You cannot use doors to vent a room"},
					{"Sometimes things break", "If a system gets fully destroyed, you can't repair it while in battle"},
					{"Ditto", "In battle, you're only allowed to use systems also present on the enemy ship"},
					{"Faux Pas", "You may not use a weapon if the enemy ship is equipped with the same one"},
					{"Archaic Aiming", "You must disable your engines to fire weapons, teleport, or launch combat drones"},
					{"Ain't there a fix?", "You may never repair your hull"},
					{"I don't need that", "You may not buy systems from the store"},
					{"Fully augmentation", "You must end the game with 3 augments"},
					{"Too much smoke", "You must turn oxygen off while in a nebula"}
					
			};
			int sizeDesc8 = description8.length;
			int pegar8 = random.nextInt(sizeDesc8);
			String title8 = description8[pegar8][0];
			String desc8 = description8[pegar8][1];
			return new String[] {title8,desc8};
			
		case WEAPONS:
			String[][] description9 = {
					{"There are many like it, but this one is mine", "You must use mainly Beam guns. Find one if needed"},
					{"There are many like it, but this one is mine", "You must use mainly Laser guns. Find one if needed"},
					{"There are many like it, but this one is mine", "You must use mainly Missile guns. Find one if needed"},
					{"There are many like it, but this one is mine", "You must use mainly Flak guns. Find one if needed"},
					{"There are many like it, but this one is mine", "You must use mainly Bomb guns. Find one if needed"},
			};
			
			int sizeDesc9 = description9.length;
			int pegar9 = random.nextInt(sizeDesc9);
			String title9 = description9[pegar9][0];
			String desc9 = description9[pegar9][1];
			return new String[]{title9,desc9};
		}
			
			
		return null;

	}

}
