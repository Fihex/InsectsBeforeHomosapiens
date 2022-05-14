package net.gai.ibh.entity.client;

import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.FlyEntity;
import net.gai.ibh.entity.custom.TestEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TestModel extends AnimatedGeoModel<TestEntity> {
    @Override
    public ResourceLocation getModelLocation(TestEntity object) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/fly.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity object) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TestEntity animatable) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "animations/fly.animation.json");
    }
}
