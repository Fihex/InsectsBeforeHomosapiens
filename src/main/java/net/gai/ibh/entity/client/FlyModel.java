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
            return FlyRenderer.LOCATION_BY_BABY_MODEL_VARIANT.get(object.getVariant());
        }
        return FlyRenderer.LOCATION_BY_MODEL_VARIANT.get(object.getVariant());

    }

    @Override
    public ResourceLocation getTextureLocation(FlyEntity object) {
        if(object.isBaby())
        {
            return FlyRenderer.LOCATION_BY_BABY_VARIANT.get(object.getVariant());
        }
        return FlyRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FlyEntity animatable) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "animations/fly.animation.json");
    }
}
