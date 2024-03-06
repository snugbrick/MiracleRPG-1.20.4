package cn.m1racleur.miraclerpg.gen;

import cn.m1racleur.miraclerpg.itemGroupReg.SimpleItemsGroupReg;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.02.29 00:18
 */
public class ItemModelReg extends FabricModelProvider {
    public ItemModelReg(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (Block block : SimpleItemsGroupReg.Blocks) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : SimpleItemsGroupReg.simpleItems) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}
