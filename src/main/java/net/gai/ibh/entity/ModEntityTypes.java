package net.gai.ibh.entity;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.FlyEntity;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes  {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, InsectsBeforeHomosapiens.MOD_ID);

    public static final RegistryObject<EntityType<SlimEntity>> SLIM =
            ENTITY_TYPES.register("slim",
                    () -> EntityType.Builder.of(SlimEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "slim").toString()));
    public static final RegistryObject<EntityType<FlyEntity>> FLY =
            ENTITY_TYPES.register("fly",
                    () -> EntityType.Builder.of(FlyEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "fly").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
