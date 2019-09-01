package de.jonaskohl.plentyoblocks;

import init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab {
	public static final CreativeTabs tabPlentyOBlocks = (new CreativeTabs("tabPlentyOBlocks") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.roofTiles);
		}
			
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("item_search.png"));
}
