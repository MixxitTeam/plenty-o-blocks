package blocks;

import java.io.File;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockDebug extends BlockBasic {

	public BlockDebug(String name, Material material) {
		super(name, material);
		setCreativeTab(null);
	}
	
	public BlockDebug(String name, Material material, SoundType sound) {
		super(name, material, sound);
		setCreativeTab(null);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			File dir = Minecraft.getMinecraft().mcDataDir;
			playerIn.sendMessage(new TextComponentString("§e[POB:Debug] §a" + dir.getAbsolutePath()));
			System.out.println(dir.getAbsolutePath());
		}
		return true;
	}
}
