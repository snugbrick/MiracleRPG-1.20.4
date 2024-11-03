package cn.m1racleur.miraclerpg.entity._3m21d.creeper1;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Creeper1EntityRenderer extends GeoEntityRenderer<Creeper1Entity> {
    public Creeper1EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Creeper1EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Creeper1Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/creeper1.png");
    }

    @Override
    public void render(Creeper1Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
