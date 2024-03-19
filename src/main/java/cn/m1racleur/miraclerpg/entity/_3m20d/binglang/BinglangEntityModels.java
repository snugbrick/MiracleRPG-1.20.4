package cn.m1racleur.miraclerpg.entity._3m20d.binglang;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.17 14:07
 */
public class BinglangEntityModels extends GeoModel<BinglangEntity> {
    @Override
    public Identifier getModelResource(BinglangEntity animatable) {
        return new Identifier("miraclerpg", "geo/binglang.geo.json");
    }

    @Override
    public Identifier getTextureResource(BinglangEntity animatable) {
        return new Identifier("miraclerpg", "textures/entity/binglang.png");
    }

    @Override
    public Identifier getAnimationResource(BinglangEntity animatable) {
        return new Identifier("miraclerpg", "animations/binglang.animation.json");
    }
}
