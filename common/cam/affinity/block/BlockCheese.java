package cam.affinity.block;

import cam.affinity.Affinity;
import cam.affinity.init.ModItems;
import cam.affinity.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.SPONGE);
		setHardness(1.0f);
		setResistance(3.0f);
		setSoundType(SoundType.CLOTH);
		setCreativeTab(Affinity.tabAffinity);
	}

	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), "ccc", "ccc", "ccc", 'c', ModItems.cheeseItem);
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Affinity.RESOURCE_PREFIX + Names.CHEESE_BLOCK; // tile.affinity:cheese_block
	}
}
