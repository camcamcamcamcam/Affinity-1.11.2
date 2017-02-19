package net.cam.affinity.init;

import net.cam.affinity.Affinity;
import net.cam.affinity.item.ItemCheese;
import net.cam.affinity.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	public static ItemCheese cheese;

	public static void init() {
		cheese = new ItemCheese();
		cheese.setRegistryName(new ResourceLocation(Affinity.MOD_ID, Names.CHEESE));
		GameRegistry.register(cheese);
	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		ModelResourceLocation model = new ModelResourceLocation(Affinity.RESOURCE_PREFIX + Names.CHEESE, "inventory");
		ModelLoader.registerItemVariants(cheese, model);
		mesher.register(cheese, 0, model);
	}
}
