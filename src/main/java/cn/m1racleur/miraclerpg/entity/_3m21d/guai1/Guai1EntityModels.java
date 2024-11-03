package cn.m1racleur.miraclerpg.entity._3m21d.guai1;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Guai1EntityModels extends GeoModel<Guai1Entity> {
    @Override
    public Identifier getModelResource(Guai1Entity animatable) {
        return new Identifier("miraclerpg", "geo/guai1.geo.json");
    }

    @Override
    public Identifier getTextureResource(Guai1Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/guai1.png");
    }

    @Override
    public Identifier getAnimationResource(Guai1Entity animatable) {
        return new Identifier("miraclerpg", "animations/guai1.animation.json");
    }
}
