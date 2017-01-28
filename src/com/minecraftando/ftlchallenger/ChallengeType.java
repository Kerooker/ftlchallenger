package com.minecraftando.ftlchallenger;

import java.util.Random;

public enum ChallengeType {

	UPGRADE, STORE, ENEMY, SURRENDER, DISTRESS,BATTLE,EVENTS,CREW,SYSTEMS,WEAPONS;

	public static ChallengeType random(Random r) {
		int tamanho = ChallengeType.values().length;
		int rand = r.nextInt(tamanho);

		return ChallengeType.values()[rand];
	}

}
