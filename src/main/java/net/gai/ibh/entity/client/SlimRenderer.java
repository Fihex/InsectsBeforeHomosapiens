package net.gai.ibh.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gai.ibh.InsectsBeforeHomosapiens;
import net.gai.ibh.entity.custom.SlimEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SlimRenderer extends GeoEntityRenderer<SlimEntity> {
    public SlimRenderer(EntityRendererProvider.Context renderManager){
        super(renderManager, new SlimModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SlimEntity instance) {
        return new ResourceLocation(InsectsBeforeHomosapiens.MOD_ID, "textures/entity/slim/slim.png");
    }

    @Override
    public RenderType getRenderType(SlimEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
