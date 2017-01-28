package com.minecraftando.ftlchallenger;

import java.awt.Font;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class FTLChallenger {

	public static Font ftlFont;


	public static String choose(String fa, Random r) {
		
		InputStream inputter = MainFrame.class.getResourceAsStream(fa);
		
		try {
			String result = null;
			int n = 0;
			for (Scanner sc = new Scanner(inputter); sc.hasNext();) {
				++n;
				String line = sc.nextLine();
				if (r.nextInt(n) == 0)
					result = line;
			}

			return result;
		} catch (Exception e) {
			return "Kerooker";
		}
	}

}
