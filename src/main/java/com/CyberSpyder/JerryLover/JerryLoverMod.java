package com.CyberSpyder.JerryLover;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = JerryLoverMod.MODID, version = JerryLoverMod.VERSION)
public class JerryLoverMod
{
    public static final String MODID = "JerryLover";
    public static final String VERSION = "1.1";
    public static String configDirectory;
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new JerryLoverMod());
    }
    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        //ClientCommandHandler.instance.registerCommand(new Command());

        //configDirectory = event.getModConfigurationDirectory().toString();
    }
    @SubscribeEvent
    public void onWorldLoad(BlockEvent.BreakEvent event) {
        ConvertStatsToAlert.RecieveStats("i am person");
    }
    
    public static String format(double num) {
    	if(num<1000)return Double.toString(num);
    	if(num<1000000) {
    		if(num>=1000)return Double.toString(num/1000) + "k";
    	}
    	if(num<1000000000) {
    		if(num>=1000000)return Double.toString(num/1000000) + "m";
    	}
		return Double.toString(num);
    }

}