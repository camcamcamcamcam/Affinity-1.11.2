package net.cam.affinity.block;

import net.cam.affinity.Affinity;
import net.cam.affinity.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.SPONGE);
		setHardness(1.0f);
		setResistance(3.0f);
		setSoundType(SoundType.CLOTH);
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Affinity.RESOURCE_PREFIX + Names.CHEESE_BLOCK; //tile.affinity:cheese_block
	}
}
