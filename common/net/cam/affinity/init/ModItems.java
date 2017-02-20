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
	public static ItemCheese cheeseItem;

	public static void init() {
		cheeseItem = new ItemCheese();
		cheeseItem.setRegistryName(new ResourceLocation(Affinity.MOD_ID, Names.CHEESE_ITEM));
		GameRegistry.register(cheeseItem);
	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		ModelResourceLocation model = new ModelResourceLocation(Affinity.RESOURCE_PREFIX + Names.CHEESE_ITEM, "inventory");
		ModelLoader.registerItemVariants(cheeseItem, model);
		mesher.register(cheeseItem, 0, model);
	}
}
