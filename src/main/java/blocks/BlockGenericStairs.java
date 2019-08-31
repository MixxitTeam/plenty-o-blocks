package blocks;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockGenericStairs extends BlockStairs {

	public BlockGenericStairs(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}
	public BlockGenericStairs(String name, Block parentBlock) {
		super(parentBlock.getDefaultState());
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}
	
}
