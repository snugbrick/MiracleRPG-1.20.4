package cn.m1racleur.miraclerpg.gen.feature;

import cn.m1racleur.miraclerpg.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.09 15:39
 */
public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                SpawnGroup.MONSTER, ModEntities.baoxiangguai, 50, 1, 1);

        SpawnRestriction.register(ModEntities.baoxiangguai,SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
    }
}
