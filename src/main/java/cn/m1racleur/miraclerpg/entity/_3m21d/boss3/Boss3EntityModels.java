package cn.m1racleur.miraclerpg.entity._3m21d.boss3;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 01:02
 */
public class Boss3EntityModels extends GeoModel<Boss3Entity> {
    @Override
    public Identifier getModelResource(Boss3Entity animatable) {
        return new Identifier("miraclerpg", "geo/boss3.geo.json");
    }

    @Override
    public Identifier getTextureResource(Boss3Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/boss3.png");
    }

    @Override
    public Identifier getAnimationResource(Boss3Entity animatable) {
        return new Identifier("miraclerpg", "animations/boss3.animation.json");
    }
}
