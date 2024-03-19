package cn.m1racleur.miraclerpg.entity._3m20d.boss1;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.19 21:59
 */
public class Boss1EntityModels  extends GeoModel<Boss1Entity> {
    @Override
    public Identifier getModelResource(Boss1Entity animatable) {
        return new Identifier("miraclerpg", "geo/boss1.geo.json");
    }

    @Override
    public Identifier getTextureResource(Boss1Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/boss1.png");
    }

    @Override
    public Identifier getAnimationResource(Boss1Entity animatable) {
        return new Identifier("miraclerpg", "animations/boss1.animation.json");
    }
}
