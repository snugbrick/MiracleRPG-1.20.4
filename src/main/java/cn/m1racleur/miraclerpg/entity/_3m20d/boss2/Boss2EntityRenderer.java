package cn.m1racleur.miraclerpg.entity._3m20d.boss2;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 00:57
 */
public class Boss2EntityRenderer extends GeoEntityRenderer<Boss2Entity> {
    public Boss2EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Boss2EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Boss2Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/boss2.png");
    }

    @Override
    public void render(Boss2Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
