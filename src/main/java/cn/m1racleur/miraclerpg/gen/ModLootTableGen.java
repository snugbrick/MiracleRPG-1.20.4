package cn.m1racleur.miraclerpg.gen;

import cn.m1racleur.miraclerpg.BlocksReg.OreBlock;
import cn.m1racleur.miraclerpg.itemRegister.BiLvItemReg;
import cn.m1racleur.miraclerpg.itemRegister.ChiHongXiLieReg;
import cn.m1racleur.miraclerpg.itemRegister.DianLanItemReg;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.01 22:22
 */
public class ModLootTableGen extends FabricBlockLootTableProvider {


    public ModLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(OreBlock.BiYuKuangShi, (Block block) -> this.oreDrops(block, BiLvItemReg.biLvZhiZheng));
        addDrop(OreBlock.chiHongKuang, (Block block) -> this.oreDrops(block, ChiHongXiLieReg.chiHongKuangShi));
        addDrop(OreBlock.chiXueTong, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.chiTieKuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.guangzikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.dianlankuang, (Block block) -> this.oreDrops(block, DianLanItemReg.dianLanDing));
        addDrop(OreBlock.haijingshikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.hongbaoshikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.jinqingkuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.keertesikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.liujinkuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.qiangweikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.qingshifenkuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.shantong, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.shuijingsuipiankuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.wutiekuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.xuancaishikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.yueguangshikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.yunmeikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.yunmoshuijingkuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.zijingshikuang, (Block block) -> this.oreDrops(block, block.asItem()));
        addDrop(OreBlock.zirankuang, (Block block) -> this.oreDrops(block, block.asItem()));

    }
}
