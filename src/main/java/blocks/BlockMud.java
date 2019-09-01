package blocks;

import java.io.File;

import javax.annotation.Nullable;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMud extends BlockFalling {

	final static double MOVEMENT_SPEED = 0.2D;
	final static double BLOCK_HEIGHT = 0.75D;
	final static float BLOCK_SLIPPERINESS = 0.99F;

	public BlockMud(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
        setDefaultSlipperiness(BLOCK_SLIPPERINESS);
	}
	
	public BlockMud(String name, Material material, SoundType sound) {
		super(material);
		super.setSoundType(sound);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
        setDefaultSlipperiness(BLOCK_SLIPPERINESS);
	}

	protected static final AxisAlignedBB MUD_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, BLOCK_HEIGHT, 1.0D);

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return MUD_AABB;
    }
    
    public boolean isFullBlock(IBlockState state) {
    	return true;
    }
    
    public boolean isFullCube() {
    	return true;
    }
    
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.motionX *= MOVEMENT_SPEED;
    	entityIn.motionZ *= MOVEMENT_SPEED;
    }
    
    public int getDustColor(IBlockState state) {
        return 3811360;
    }
}
