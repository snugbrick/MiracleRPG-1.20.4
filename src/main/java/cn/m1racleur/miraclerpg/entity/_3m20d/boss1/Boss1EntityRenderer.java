package cn.m1racleur.miraclerpg.entity._3m20d.boss1;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.19 23:47
 */
public class Boss1EntityRenderer extends GeoEntityRenderer<Boss1Entity> {
    public Boss1EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Boss1EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Boss1Entity chomperEntity) {
        return new Identifier("miraclerpg","textures/entity/boss1.png");
    }

    @Override
    public void render(Boss1Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
