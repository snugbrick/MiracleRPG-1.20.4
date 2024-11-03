package cn.m1racleur.miraclerpg.entity._3m21d.guai1;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Guai1EntityRenderer extends GeoEntityRenderer<Guai1Entity> {
    public Guai1EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Guai1EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Guai1Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/guai1.png");
    }

    @Override
    public void render(Guai1Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}