package init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		System.out.println("SMELTING RECIPES INIT");
		GameRegistry.addSmelting(Blocks.PLANKS, new ItemStack(ModBlocks.charredPlanks, 1), 0.2f);
	}
}
