package cn.m1racleur.miraclerpg.entity._3m20d.baoxiangguaiEntity;


import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 14:51
 */
public class BaoxiangguaiEntityRenderer extends GeoEntityRenderer<BaoxiangguaiEntity> {
    public BaoxiangguaiEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BaoxiangguaiEntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(BaoxiangguaiEntity chomperEntity) {
        return  new Identifier("miraclerpg","textures/entity/baoxiangguai1.png");
    }

    @Override
    public void render(BaoxiangguaiEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(1.2f,1.2f,1.2f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
