package init;

import de.jonaskohl.plentyoblocks.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	
	public static void init() {
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
	}
	
	/* private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	} */
}
