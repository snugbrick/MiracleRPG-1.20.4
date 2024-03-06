package cn.m1racleur.miraclerpg.gen;

import cn.m1racleur.miraclerpg.BlocksReg.OreBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.01 22:44
 */
public class ModBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(OreBlock.BiYuKuangShi)
                .add(OreBlock.chiHongKuang)
                .add(OreBlock.chiXueTong)
                .add(OreBlock.chiTieKuang)
                .add(OreBlock.dianlankuang)
                .add(OreBlock.guangzikuang)
                .add(OreBlock.haijingshikuang)
                .add(OreBlock.hongbaoshikuang)
                .add(OreBlock.jinqingkuang)
                .add(OreBlock.keertesikuang)
                .add(OreBlock.liujinkuang)
                .add(OreBlock.qiangweikuang)
                .add(OreBlock.qingshifenkuang)
                .add(OreBlock.shantong)
                .add(OreBlock.shuijingsuipiankuang)
                .add(OreBlock.wutiekuang)
                .add(OreBlock.xuancaishikuang)
                .add(OreBlock.yueguangshikuang)
                .add(OreBlock.yunmeikuang)
                .add(OreBlock.yunmoshuijingkuang)
                .add(OreBlock.zijingshikuang)
                .add(OreBlock.zirankuang);
    }
}
