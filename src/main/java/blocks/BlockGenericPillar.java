package blocks;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockGenericPillar extends BlockRotatedPillar {

	public BlockGenericPillar(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}

}
