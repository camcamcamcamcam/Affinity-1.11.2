package net.cam.affinity.item;

import net.cam.affinity.Affinity;
import net.cam.affinity.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCheese extends Item {

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		// Stuff that it does goes here. This is overriding the item's normal uses.
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Affinity.RESOURCE_PREFIX + Names.CHEESE; // item.affinity:cheese
	}
}
