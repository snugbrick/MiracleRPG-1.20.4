package cn.m1racleur.miraclerpg.entity._3m21d.dazhizhu;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.20 02:09
 */
public class DazhizhuEntityModels extends GeoModel<DazhizhuEntity> {
    @Override
    public Identifier getModelResource(DazhizhuEntity animatable) {
        return new Identifier("miraclerpg", "geo/dazhizhu.geo.json");
    }

    @Override
    public Identifier getTextureResource(DazhizhuEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/dazhizhu.png");
    }

    @Override
    public Identifier getAnimationResource(DazhizhuEntity animatable) {
        return new Identifier("miraclerpg", "animations/dazhizhu.animation.json");
    }
}
