package init;

import blocks.BlockBasic;
import blocks.BlockGenericPillar;
import blocks.BlockGenericStairs;
import blocks.BlockMud;
import de.jonaskohl.plentyoblocks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {

	public static Block flintBlock;
	public static Block flintBricks;
	public static Block charredPlanks;
	public static Block blazedGlowstone;
	public static Block soulStone;
	public static Block roofTiles;
	public static Block roofTilesStairs;
	public static Block sandstonePillar;
	public static Block mud;
	
	public static void init() {
		flintBlock = new BlockBasic("flint_block", Material.ROCK).setHardness(5);
		flintBlock.setHarvestLevel("pickaxe", 0);
		
		flintBricks = new BlockBasic("flint_bricks", Material.ROCK).setHardness(2);
		flintBricks.setHarvestLevel("pickaxe", 0);
		
		charredPlanks = new BlockBasic("charred_planks", Material.WOOD, SoundType.WOOD).setHardness(1.5f);
		charredPlanks.setHarvestLevel("axe", 0);
		
		blazedGlowstone = new BlockBasic("blazed_glowstone", Material.GLASS, SoundType.GLASS).setHardness(0.3f).setLightLevel(1f);

		soulStone = new BlockBasic("soul_stone", Material.ROCK).setHardness(1.5f);
		soulStone.setHarvestLevel("pickaxe", 0);

		roofTiles = new BlockBasic("roof_tiles", Material.ROCK).setHardness(2f);
		roofTiles.setHarvestLevel("pickaxe", 0);

		roofTilesStairs = new BlockGenericStairs("roof_tiles_stairs", roofTiles).setHardness(2f);
		roofTilesStairs.setHarvestLevel("pickaxe", 0);
		
		sandstonePillar = new BlockGenericPillar("sandstone_pillar", Material.ROCK).setHardness(2f);
		sandstonePillar.setHarvestLevel("pickaxe", 0);
		
		mud = new BlockMud("mud", Material.SAND, SoundType.SLIME).setHardness(0.5f);
		mud.setHarvestLevel("shovel", 0);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(flintBlock);
		event.getRegistry().registerAll(flintBricks);
		event.getRegistry().registerAll(charredPlanks);
		event.getRegistry().registerAll(blazedGlowstone);
		event.getRegistry().registerAll(soulStone);
		event.getRegistry().registerAll(roofTiles);
		event.getRegistry().registerAll(roofTilesStairs);
		event.getRegistry().registerAll(sandstonePillar);
		event.getRegistry().registerAll(mud);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(flintBlock).setRegistryName(flintBlock.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(flintBricks).setRegistryName(flintBricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(charredPlanks).setRegistryName(charredPlanks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(blazedGlowstone).setRegistryName(blazedGlowstone.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(soulStone).setRegistryName(soulStone.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(roofTiles).setRegistryName(roofTiles.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(roofTilesStairs).setRegistryName(roofTilesStairs.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(sandstonePillar).setRegistryName(sandstonePillar.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(mud).setRegistryName(mud.getRegistryName()));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(flintBlock));
		registerRender(Item.getItemFromBlock(flintBricks));
		registerRender(Item.getItemFromBlock(charredPlanks));
		registerRender(Item.getItemFromBlock(blazedGlowstone));
		registerRender(Item.getItemFromBlock(soulStone));
		registerRender(Item.getItemFromBlock(roofTiles));
		registerRender(Item.getItemFromBlock(roofTilesStairs));
		registerRender(Item.getItemFromBlock(sandstonePillar));
		registerRender(Item.getItemFromBlock(mud));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}