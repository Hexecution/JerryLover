package com.CyberSpyder.JerryLover;

import com.CyberSpyder.JerryLover.AlertPlayer;

public class ConvertStatsToAlert {
	public static void RecieveStats(String json) {
		String uuid = "eeeeeeeee";
		String itemName = "Bozo Staff 2000";
		Integer itemPrice = 2999000;
		Integer secondItemPrice = 3100000;
		
		AlertPlayer.SendAh(uuid, itemName, itemPrice, secondItemPrice);
	}
}
