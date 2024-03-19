package cn.m1racleur.miraclerpg.entity._3m21d.boss4;

import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3EntityModels;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 01:08
 */
public class Boss4EntityRenderer extends GeoEntityRenderer<Boss4Entity> {
    public Boss4EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Boss4EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Boss4Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/boss4.png");
    }

    @Override
    public void render(Boss4Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
