package blocks;

import javax.annotation.Nullable;

import de.jonaskohl.plentyoblocks.CreativeTab;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMud extends BlockFalling {

	final static double MOVEMENT_SPEED = 0.2D;
	final static double BLOCK_HEIGHT = 0.75D;

	public BlockMud(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}
	
	public BlockMud(String name, Material material, SoundType sound) {
		super(material);
		super.setSoundType(sound);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.tabPlentyOBlocks);
	}

	protected static final AxisAlignedBB MUD_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, BLOCK_HEIGHT, 1.0D);

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return MUD_AABB;
    }

    /**
     * Called When an Entity Collided with the Block
     */
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= MOVEMENT_SPEED;
    	entityIn.motionZ *= MOVEMENT_SPEED;
    }
}
