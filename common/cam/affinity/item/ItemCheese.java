package cam.affinity.item;

import cam.affinity.Affinity;
import cam.affinity.init.ModBlocks;
import cam.affinity.init.ModItems;
import cam.affinity.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCheese extends Item {

	public ItemCheese() {
		setCreativeTab(Affinity.tabAffinity);
	}

	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this, 9), ModBlocks.cheeseBlock);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		// Stuff that it does goes here. This is overriding the item's normal
		// uses. TODO might get rid of this
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Affinity.RESOURCE_PREFIX + Names.CHEESE_ITEM; // item.affinity:cheese
	}
}
