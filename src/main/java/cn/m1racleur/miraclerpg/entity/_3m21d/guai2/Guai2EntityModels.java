package cn.m1racleur.miraclerpg.entity._3m21d.guai2;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Guai2EntityModels extends GeoModel<Guai2Entity> {
    @Override
    public Identifier getModelResource(Guai2Entity animatable) {
        return new Identifier("miraclerpg", "geo/guai2.geo.json");
    }

    @Override
    public Identifier getTextureResource(Guai2Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/guai2.png");
    }

    @Override
    public Identifier getAnimationResource(Guai2Entity animatable) {
        return new Identifier("miraclerpg", "animations/guai2.animation.json");
    }
}
