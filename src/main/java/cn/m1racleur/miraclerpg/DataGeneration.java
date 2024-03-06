package cn.m1racleur.miraclerpg;

import cn.m1racleur.miraclerpg.gen.ItemModelReg;
import cn.m1racleur.miraclerpg.gen.ModBlockTagGen;
import cn.m1racleur.miraclerpg.gen.ModLootTableGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 19:52
 */
public class DataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ItemModelReg::new);

        pack.addProvider(ModBlockTagGen::new);
        pack.addProvider(ModLootTableGen::new);

    }
}
