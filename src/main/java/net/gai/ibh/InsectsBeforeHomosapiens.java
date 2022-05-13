package net.gai.ibh;

import com.mojang.logging.LogUtils;
import net.gai.ibh.entity.ModEntityTypes;
import net.gai.ibh.entity.client.FlyRenderer;
import net.gai.ibh.entity.client.SlimRenderer;
import net.gai.ibh.item.ModItems;
import net.gai.ibh.sound.ModSounds;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InsectsBeforeHomosapiens.MOD_ID)
public class InsectsBeforeHomosapiens
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "ibh";
    // Looger Adds
    private static final Logger LOGGER = LogUtils.getLogger();


    public InsectsBeforeHomosapiens()
    {
        // Register the setup method for modloading just
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        ModSounds.register(eventBus);

        ModEntityTypes.register(eventBus);;

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        GeckoLib.initialize();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        EntityRenderers.register(ModEntityTypes.SLIM.get(), SlimRenderer::new);
        EntityRenderers.register(ModEntityTypes.FLY.get(), FlyRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        SpawnPlacements.register(ModEntityTypes.SLIM.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules);

        SpawnPlacements.register(ModEntityTypes.FLY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules);

        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
