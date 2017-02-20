package cam.affinity;

import java.util.Random;

import cam.affinity.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Affinity.MOD_ID, name = Affinity.MOD_NAME, version = Affinity.VERSION)
public class Affinity {

	public static final String MOD_ID = "affinity";
	public static final String MOD_NAME = "Affinity";
	public static final String VERSION = "1.0.0";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	public static Random random = new Random();

	@Instance(MOD_ID)
	public static Affinity instance;

	@SidedProxy(clientSide = "cam.affinity.ClientProxy", serverSide = "cam.affinity.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	public static CreativeTabs tabAffinity = new CreativeTabs(Affinity.RESOURCE_PREFIX + "affinity") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.cheeseItem);
		}
	};
}