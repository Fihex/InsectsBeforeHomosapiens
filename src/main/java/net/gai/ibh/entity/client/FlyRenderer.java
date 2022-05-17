package net.gai.ibh.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.FlyEntity;
import net.gai.ibh.entity.custom.SlimEntity;
import net.gai.ibh.entity.variant.FlyVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class FlyRenderer extends GeoEntityRenderer<FlyEntity> {
    public static final Map<FlyVariant, ResourceLocation> LOCATION_BY_MODEL_VARIANT =
            Util.make(Maps.newEnumMap(FlyVariant.class), (p_114874_) -> {
                p_114874_.put(FlyVariant.DEFAULT,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/fly.geo.json"));
                p_114874_.put(FlyVariant.BLUE,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/fly2.geo.json"));
            });
    public static final Map<FlyVariant, ResourceLocation> LOCATION_BY_BABY_MODEL_VARIANT =
            Util.make(Maps.newEnumMap(FlyVariant.class), (p_114874_) -> {
                p_114874_.put(FlyVariant.DEFAULT,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/flyb.geo.json"));
                p_114874_.put(FlyVariant.BLUE,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "geo/fly2b.geo.json"));
            });
    public static final Map<FlyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(FlyVariant.class), (p_114874_) -> {
                p_114874_.put(FlyVariant.DEFAULT,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly.png"));
                p_114874_.put(FlyVariant.BLUE,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly2.png"));
            });
    public static final Map<FlyVariant, ResourceLocation> LOCATION_BY_BABY_VARIANT =
            Util.make(Maps.newEnumMap(FlyVariant.class), (p_114874_) -> {
                p_114874_.put(FlyVariant.DEFAULT,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/flyb.png"));
                p_114874_.put(FlyVariant.BLUE,
                        new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly2b.png"));
            });

    public FlyRenderer(EntityRendererProvider.Context renderManager){
        super(renderManager, new FlyModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(FlyEntity instance) {
        if(instance.isBaby())
        {
            return LOCATION_BY_BABY_VARIANT.get(instance.getVariant());
        }
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(FlyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby())
        {
            stack.scale(1.9F, 1.9F, 1.9F);
        } else {
            stack.scale(3.8F, 3.8F, 3.8F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
