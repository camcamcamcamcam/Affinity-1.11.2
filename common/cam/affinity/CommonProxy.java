package cam.affinity;

import cam.affinity.init.ModBlocks;
import cam.affinity.init.ModItems;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModBlocks.initRecipes();
		ModItems.initRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
