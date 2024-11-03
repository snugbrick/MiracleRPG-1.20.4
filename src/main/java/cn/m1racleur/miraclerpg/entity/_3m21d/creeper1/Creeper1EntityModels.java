package cn.m1racleur.miraclerpg.entity._3m21d.creeper1;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class Creeper1EntityModels extends GeoModel<Creeper1Entity> {
    @Override
    public Identifier getModelResource(Creeper1Entity animatable) {
        return new Identifier("miraclerpg", "geo/creeper1.geo.json");
    }

    @Override
    public Identifier getTextureResource(Creeper1Entity animatable) {
        return new Identifier("miraclerpg", "textures/entity/creeper1.png");
    }

    @Override
    public Identifier getAnimationResource(Creeper1Entity animatable) {
        return new Identifier("miraclerpg", "animations/creeper1.animation.json");
    }
}
