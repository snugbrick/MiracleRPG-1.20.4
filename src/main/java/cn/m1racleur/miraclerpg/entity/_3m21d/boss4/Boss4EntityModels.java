package cn.m1racleur.miraclerpg.entity._3m21d.boss4;

import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 01:07
 */
public class Boss4EntityModels extends GeoModel<Boss4Entity> {
    @Override
    public Identifier getModelResource(Boss4Entity animatable) {
        return new Identifier("miraclerpg", "geo/boss4.geo.json");
    }

    @Override
    public Identifier getTextureResource(Boss4Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/boss4.png");
    }

    @Override
    public Identifier getAnimationResource(Boss4Entity animatable) {
        return new Identifier("miraclerpg", "animations/boss4.animation.json");
    }
}
