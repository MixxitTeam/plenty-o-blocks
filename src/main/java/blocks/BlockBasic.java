package blocks;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

	public BlockBasic(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}
	
	public BlockBasic(String name, Material material, SoundType sound) {
		super(material);
		super.setSoundType(sound);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}
}
