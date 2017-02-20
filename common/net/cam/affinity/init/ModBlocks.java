package net.cam.affinity.init;

import net.cam.affinity.Affinity;
import net.cam.affinity.block.BlockCheese;
import net.cam.affinity.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	public static BlockCheese cheeseBlock;

	public static void init() {
		ResourceLocation location = new ResourceLocation(Affinity.MOD_ID, Names.CHEESE_BLOCK);
		cheeseBlock = new BlockCheese();
		cheeseBlock.setRegistryName(location);
		GameRegistry.register(cheeseBlock);
		GameRegistry.register(new ItemBlock(cheeseBlock), location);
	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		Item item = Item.getItemFromBlock(cheeseBlock);
		ModelResourceLocation model = new ModelResourceLocation(Affinity.RESOURCE_PREFIX + Names.CHEESE_BLOCK,
				"inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);

	}
}
