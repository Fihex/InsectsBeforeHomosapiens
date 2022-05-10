package net.gai.ibh.entity.client;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SlimModel extends AnimatedGeoModel<SlimEntity> {
    @Override
    public ResourceLocation getModelLocation(SlimEntity object) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SlimEntity object) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/slim/slim.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SlimEntity animatable) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "animations/slim.animation.json");
    }
}
