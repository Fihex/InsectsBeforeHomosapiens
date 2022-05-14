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
            () -> new ForgeSpawnEggItem(ModEntityTypes.SLIM,0xCC50C2, 0x4DCC7E,
                    new Item.Properties().tab(ModCreativeModeTab.IBH_TAB)));

    public static final RegistryObject<Item> FLY_SPAWN_EGG = ITEMS.register("fly_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FLY,0x31291e, 0xcc397b,
                    new Item.Properties().tab(ModCreativeModeTab.IBH_TAB)));

    public static final RegistryObject<Item> TEST_SPAWN_EGG = ITEMS.register("test_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TEST,0x43291e, 0xa4397b,
                    new Item.Properties().tab(ModCreativeModeTab.IBH_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
