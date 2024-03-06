package cn.m1racleur.miraclerpg.entity.entityModels;

import cn.m1racleur.miraclerpg.entity.ModEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 14:35
 */
public class ModEntityModels extends GeoModel<ModEntity> {
    @Override
    public Identifier getModelResource(ModEntity animatable) {
        return new Identifier("miraclerpg", "models/entity/baoxiangguai1.geo.json");
    }

    @Override
    public Identifier getTextureResource(ModEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/baoxiangguai1.png");
    }

    @Override
    public Identifier getAnimationResource(ModEntity animatable) {
        return new Identifier("miraclerpg", "animations/baoxiangguai1.animation.json");
    }
}
