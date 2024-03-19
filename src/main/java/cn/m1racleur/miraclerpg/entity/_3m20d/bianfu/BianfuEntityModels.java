package cn.m1racleur.miraclerpg.entity._3m20d.bianfu;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.17 13:32
 */
public class BianfuEntityModels extends GeoModel<BianfuEntity> {
    @Override
    public Identifier getModelResource(BianfuEntity animatable) {
        return new Identifier("miraclerpg", "geo/bianfu.geo.json");
    }

    @Override
    public Identifier getTextureResource(BianfuEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/bianfu.png");
    }

    @Override
    public Identifier getAnimationResource(BianfuEntity animatable) {
        return new Identifier("miraclerpg", "animations/bianfu.animation.json");
    }
}
