package net.gai.ibh.event;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.ModEntityTypes;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InsectsBeforeHomosapiens.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SLIM.get(), SlimEntity.setAttributes());
    }
}
