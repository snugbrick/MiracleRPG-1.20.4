package cn.m1racleur.miraclerpg.entity.bianfu;

import cn.m1racleur.miraclerpg.entity.baoxiangguaiEntity.BaoxiangguaiEntity;
import cn.m1racleur.miraclerpg.entity.baoxiangguaiEntity.BaoxiangguaiEntityModels;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.17 13:32
 */
public class BianfuEntityRenderer extends GeoEntityRenderer<BianfuEntity> {
    public BianfuEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BianfuEntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(BianfuEntity chomperEntity) {
        return  new Identifier("miraclerpg","textures/entity/bianfu.png");
    }

    @Override
    public void render(BianfuEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f,0.8f,0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
