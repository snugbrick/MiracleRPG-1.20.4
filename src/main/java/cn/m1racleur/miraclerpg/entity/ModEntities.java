package cn.m1racleur.miraclerpg.entity;

import cn.m1racleur.miraclerpg.entity.baoxiangguaiEntity.BaoxiangguaiEntity;
import cn.m1racleur.miraclerpg.entity.bianfu.BianfuEntity;
import cn.m1racleur.miraclerpg.entity.binglang.BinglangEntity;
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
    public static final EntityType<BaoxiangguaiEntity> baoxiangguai = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "baoxiangguai1"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BaoxiangguaiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
    public static final EntityType<BianfuEntity> bianfu = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "bianfu"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BianfuEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
    public static final EntityType<BinglangEntity> binglang = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "binglang"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BinglangEntity::new)
                    .dimensions(EntityDimensions.fixed(5.0F, 10.0F)).build());
}
