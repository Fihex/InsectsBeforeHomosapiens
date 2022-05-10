package net.gai.ibh.sound;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, InsectsBeforeHomosapiens.MOD_ID);

    public static final RegistryObject<SoundEvent> LIE =
            registerSoundEvent("lie");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus){
        SOUND_EVENT.register(eventBus);
    }
}
