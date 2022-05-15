package net.gai.ibh.entity.client;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.FlyEntity;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FlyModel extends AnimatedGeoModel<FlyEntity> {
    @Override
    public ResourceLocation getModelLocation(FlyEntity object) {
        if(object.isBaby())
        {
            return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/flyb.geo.json");
        }
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/fly.geo.json");

    }

    @Override
    public ResourceLocation getTextureLocation(FlyEntity object) {
        if(object.isBaby())
        {
            return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/flyb.png");
        }
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FlyEntity animatable) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "animations/fly.animation.json");
    }
}
