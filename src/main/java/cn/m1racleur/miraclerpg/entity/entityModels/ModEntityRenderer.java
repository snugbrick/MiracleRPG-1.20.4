package cn.m1racleur.miraclerpg.entity.entityModels;


import cn.m1racleur.miraclerpg.entity.ModEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 14:51
 */
public class ModEntityRenderer extends GeoEntityRenderer<ModEntity> {
    public ModEntityRenderer(EntityRendererFactory.Context renderManager, GeoModel<ModEntity> model) {
        super(renderManager, model);
    }
}
