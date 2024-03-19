package cn.m1racleur.miraclerpg.entity._3m21d.boss3;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 01:02
 */
public class Boss3EntityRenderer extends GeoEntityRenderer<Boss3Entity> {
    public Boss3EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Boss3EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Boss3Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/boss3.png");
    }

    @Override
    public void render(Boss3Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
