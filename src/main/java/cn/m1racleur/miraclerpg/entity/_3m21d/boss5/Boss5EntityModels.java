package cn.m1racleur.miraclerpg.entity._3m21d.boss5;

import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Boss5EntityModels extends GeoModel<Boss5Entity> {
    @Override
    public Identifier getModelResource(Boss5Entity animatable) {
        return new Identifier("miraclerpg", "geo/boss5.geo.json");
    }

    @Override
    public Identifier getTextureResource(Boss5Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/boss5.png");
    }

    @Override
    public Identifier getAnimationResource(Boss5Entity animatable) {
        return new Identifier("miraclerpg", "animations/boss5.animation.json");
    }
}
