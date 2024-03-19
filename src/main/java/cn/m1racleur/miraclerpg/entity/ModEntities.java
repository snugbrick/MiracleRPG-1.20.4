package cn.m1racleur.miraclerpg.entity;

import cn.m1racleur.miraclerpg.entity._3m20d.baoxiangguaiEntity.BaoxiangguaiEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.bianfu.BianfuEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.binglang.BinglangEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.boss1.Boss1Entity;
import cn.m1racleur.miraclerpg.entity._3m20d.boss2.Boss2Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4Entity;
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
                    .dimensions(EntityDimensions.fixed(1.2f, 1.2f)).build());
    public static final EntityType<BianfuEntity> bianfu = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "bianfu"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BianfuEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.3f)).build());
    public static final EntityType<BinglangEntity> binglang = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "binglang"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BinglangEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build());
    public static final EntityType<Boss1Entity> boss1 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "boss1"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Boss1Entity::new)
                    .dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build());
    public static final EntityType<Boss2Entity> boss2 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "boss2"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Boss2Entity::new)
                    .dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build());
    public static final EntityType<Boss3Entity> boss3 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "boss3"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Boss3Entity::new)
                    .dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build());
    public static final EntityType<Boss4Entity> boss4 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("miraclerpg", "boss4"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Boss4Entity::new)
                    .dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build());
}
