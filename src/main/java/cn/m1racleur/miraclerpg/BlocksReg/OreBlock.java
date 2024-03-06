package cn.m1racleur.miraclerpg.BlocksReg;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 09:03
 */
public class OreBlock {
    public static final Block BiYuKuangShi = new ExperienceDroppingBlock(UniformIntProvider.create(4, 5), FabricBlockSettings.create().strength(4.0f));
    public static final Block chiHongKuang = new ExperienceDroppingBlock(UniformIntProvider.create(4, 5), FabricBlockSettings.create().strength(4.0f));
    public static final Block chiTieKuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block chiXueTong = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block dianlankuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block guangzikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block haijingshikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block hongbaoshikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block jinqingkuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block keertesikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block liujinkuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block qiangweikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block qingshifenkuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block shantong = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block shuijingsuipiankuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block wutiekuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block xuancaishikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block yueguangshikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block yunmeikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block yunmoshuijingkuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block zijingshikuang = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block zirankuang = new Block(FabricBlockSettings.create().strength(4.0f));

    public static void BlocksRegister() {
        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "biyukuang"), BiYuKuangShi);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "biyukuang"),
                new BlockItem(BiYuKuangShi, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "chihongkuang"), chiHongKuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongkuang"),
                new BlockItem(chiHongKuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "chitiekuang"), chiTieKuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chitiekuang"),
                new BlockItem(chiTieKuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "chixuetong"), chiXueTong);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chixuetong"),
                new BlockItem(chiXueTong, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "dianlankuang"), dianlankuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "dianlankuang"),
                new BlockItem(dianlankuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "guangzikuang"), guangzikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "guangzikuang"),
                new BlockItem(guangzikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "haijingshikuang"), haijingshikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "haijingshikuang"),
                new BlockItem(haijingshikuang, new FabricItemSettings()));


        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "hongbaoshikuang"), hongbaoshikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "hongbaoshikuang"),
                new BlockItem(hongbaoshikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "jinqingkuang"), jinqingkuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "jinqingkuang"),
                new BlockItem(jinqingkuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "keertesikuang"), keertesikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "keertesikuang"),
                new BlockItem(keertesikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "liujinkuang"), liujinkuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "liujinkuang"),
                new BlockItem(liujinkuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "qiangweikuang"), qiangweikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "qiangweikuang"),
                new BlockItem(qiangweikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "qingshifenkuang"), qingshifenkuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "qingshifenkuang"),
                new BlockItem(qingshifenkuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "shantong"), shantong);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "shantong"),
                new BlockItem(shantong, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "shuijingsuipiankuang"), shuijingsuipiankuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "shuijingsuipiankuang"),
                new BlockItem(shuijingsuipiankuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "wutiekuang"), wutiekuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "wutiekuang"),
                new BlockItem(wutiekuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "xuancaishikuang"), xuancaishikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "xuancaishikuang"),
                new BlockItem(xuancaishikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "yueguangshikuang"), yueguangshikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "yueguangshikuang"),
                new BlockItem(yueguangshikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "yunmeikuang"), yunmeikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "yunmeikuang"),
                new BlockItem(yunmeikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "yunmoshuijingkuang"), yunmoshuijingkuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "yunmoshuijingkuang"),
                new BlockItem(yunmoshuijingkuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "zijingshikuang"), zijingshikuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "zijingshikuang"),
                new BlockItem(zijingshikuang, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "zirankuang"), zirankuang);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "zirankuang"),
                new BlockItem(zirankuang, new FabricItemSettings()));
    }
}