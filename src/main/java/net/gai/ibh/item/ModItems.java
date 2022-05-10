package net.gai.ibh.item;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InsectsBeforeHomosapiens.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IBH_TAB).stacksTo(16)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
