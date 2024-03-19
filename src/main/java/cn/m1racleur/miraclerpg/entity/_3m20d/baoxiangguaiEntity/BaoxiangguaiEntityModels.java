package cn.m1racleur.miraclerpg.entity._3m20d.baoxiangguaiEntity;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 14:35
 */
public class BaoxiangguaiEntityModels extends GeoModel<BaoxiangguaiEntity> {
    @Override
    public Identifier getModelResource(BaoxiangguaiEntity animatable) {
        return new Identifier("miraclerpg", "geo/baoxiangguai1.geo.json");
    }

    @Override
    public Identifier getTextureResource(BaoxiangguaiEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/baoxiangguai1.png");
    }

    @Override
    public Identifier getAnimationResource(BaoxiangguaiEntity animatable) {
        return new Identifier("miraclerpg", "animations/baoxiangguai1.animation.json");
    }
}
