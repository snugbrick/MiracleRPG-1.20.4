package cn.m1racleur.miraclerpg.entity._3m21d.creeper;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class CreeperEntityModels extends GeoModel<CreeperEntity> {
    @Override
    public Identifier getModelResource(CreeperEntity animatable) {
        return new Identifier("miraclerpg", "geo/creeper.geo.json");
    }

    @Override
    public Identifier getTextureResource(CreeperEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/creeper.png");
    }

    @Override
    public Identifier getAnimationResource(CreeperEntity animatable) {
        return new Identifier("miraclerpg", "animations/creeper.animation.json");
    }
}
