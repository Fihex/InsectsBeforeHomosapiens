package net.gai.ibh.world;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.world.gen.ModEntityGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InsectsBeforeHomosapiens.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModEntityGeneration.onEntitySpawn(event);
    }
}
