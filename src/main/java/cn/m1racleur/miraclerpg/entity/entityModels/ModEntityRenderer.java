package cn.m1racleur.miraclerpg.entity.entityModels;


import cn.m1racleur.miraclerpg.entity.ModEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 14:51
 */
public class ModEntityRenderer extends GeoEntityRenderer<ModEntity> {
    public ModEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ModEntityModels());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(ModEntity chomperEntity) {
        return  new Identifier("miraclerpg","textures/entity/baoxiangguai1.png");
    }

    @Override
    public void render(ModEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f,0.8f,0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
