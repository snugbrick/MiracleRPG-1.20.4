package cn.m1racleur.miraclerpg.entity;

import cn.m1racleur.miraclerpg.entity.baoxiangguaiEntity.BaoxiangguaiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.07 00:46
 */
public class ModEntities {
    public static final EntityType<BaoxiangguaiEntity> modEntity = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "baoxiangguai1"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BaoxiangguaiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
}
