package cn.m1racleur.miraclerpg.entity._3m20d.boss2;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 00:56
 */
public class Boss2EntityModels extends GeoModel<Boss2Entity> {
    @Override
    public Identifier getModelResource(Boss2Entity animatable) {
        return new Identifier("miraclerpg", "geo/boss2.geo.json");
    }

    @Override
    public Identifier getTextureResource(Boss2Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/boss2.png");
    }

    @Override
    public Identifier getAnimationResource(Boss2Entity animatable) {
        return new Identifier("miraclerpg", "animations/boss2.animation.json");
    }
}
