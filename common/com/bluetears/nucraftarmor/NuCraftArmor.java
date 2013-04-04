package com.bluetears.nucraftarmor;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="NuCraftArmor", name="NuCraftArmor", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class NuCraftArmor {

        // The instance of your mod that Forge uses.
        @Instance("NuCraftArmor")
        public static NuCraftArmor instance;
        
        //Below is the code for generating all of the blocks
        
        
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.bluetears.nucraftarmor.client.ClientProxy", serverSide="com.bluetears.nucraftarmor.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
               
        	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

            config.load();

            startBlockId = config.getBlock("Starting Block Id", 500).getInt();

            startItemId = config.getItem("Starting Item Id", 20000).getInt();

            // Config file setup!
            

            config.save();
        	
        }
        
        @Init
        
        public void load(FMLInitializationEvent event) {
        	
        	createBlocks();
        	createItems();
        	registerBlocks();
        	setHarvestLevel();
        	addNames();
            
            
            
                proxy.registerRenderers();
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        public static void registerBlocks(){
        }
        
        public static void setHarvestLevel(){
        	
        }
        
        public static void createBlocks(){
        }
        
        public static void createItems(){
        	
        	
        }
        
        public static void addNames(){
        	
        	//Adding of names for the Blocks
        	
        	
        	//Adding of Names for the Items
        }
   
        //The following is the creation for the item reservations
        
        //The following is for the creation for the block reservations
        
        //Extra Variables that "Drive" the mod
        public static int startItemId = 20000;
        public static int startBlockId = 500;
   
        
}


