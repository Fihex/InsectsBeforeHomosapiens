package net.gai.ibh.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.FlyEntity;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FlyRenderer extends GeoEntityRenderer<FlyEntity> {
    public FlyRenderer(EntityRendererProvider.Context renderManager){
        super(renderManager, new FlyModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(FlyEntity instance) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/fly/fly.png");
    }

    @Override
    public RenderType getRenderType(FlyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(3.8F, 3.8F, 3.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
