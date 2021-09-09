package com.CyberSpyder.JerryLover;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class AlertPlayer {
	
	static EntityPlayer player = Minecraft.getMinecraft().thePlayer;
	
	public static void SendAh(String uuid, String itemName, Integer itemPrice, Integer secondItemPrice) {
		if(player == null) return;
		double ditemPrice = itemPrice;
		double dsecondItemPrice = secondItemPrice;
		String sitemPrice = JerryLoverMod.format(ditemPrice);
		String ssecondItemPrice = JerryLoverMod.format(dsecondItemPrice);
		int profit = secondItemPrice - itemPrice;
		double dprofit = profit;
		String sprofit = JerryLoverMod.format(dprofit);
    	player.addChatMessage(new ChatComponentText(
    			EnumChatFormatting.LIGHT_PURPLE + "[Jerry Lover:] " + "\n" + EnumChatFormatting.DARK_PURPLE + itemName + "\n" + EnumChatFormatting.AQUA + "(" + sitemPrice + " -> " + ssecondItemPrice + ")" + "\n" + EnumChatFormatting.GREEN + "Profit: " + sprofit + "\n" + EnumChatFormatting.GOLD + "BUY ITEM"));
	}
}
