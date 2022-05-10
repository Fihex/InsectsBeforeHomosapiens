package net.gai.ibh.item;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InsectsBeforeHomosapiens.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IBH_TAB).stacksTo(16)));

    public static final RegistryObject<Item> SLIM_SPAWN_EGG = ITEMS.register("slim_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SLIM,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.IBH_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
