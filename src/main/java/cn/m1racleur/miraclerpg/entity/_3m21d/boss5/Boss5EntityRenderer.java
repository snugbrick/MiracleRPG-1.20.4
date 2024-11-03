package cn.m1racleur.miraclerpg.entity._3m21d.boss5;

import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4EntityModels;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Boss5EntityRenderer extends GeoEntityRenderer<Boss5Entity> {
    public Boss5EntityRenderer(EntityRendererFactory.Context context) {
        super(context, new Boss5EntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(Boss5Entity chomperEntity) {
        return new Identifier("miraclerpg", "textures/entity/boss5.png");
    }

    @Override
    public void render(Boss5Entity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 1.0f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
