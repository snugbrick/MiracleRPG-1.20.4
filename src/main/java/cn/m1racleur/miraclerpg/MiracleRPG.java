package cn.m1racleur.miraclerpg;

import cn.m1racleur.miraclerpg.ArmorReg.AusterityReg;
import cn.m1racleur.miraclerpg.BlocksReg.OreBlock;
import cn.m1racleur.miraclerpg.itemGroupReg.RPGitemGroup;
import cn.m1racleur.miraclerpg.itemGroupReg.SimpleItemsGroupReg;
import cn.m1racleur.miraclerpg.itemRegister.*;
import cn.m1racleur.miraclerpg.listener.RegisterLis;
import cn.m1racleur.miraclerpg.miracleEnchant.MiracleSharp;
import cn.m1racleur.miraclerpg.world.feature.OreFeatures;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 19:44
 */
public class MiracleRPG implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");


    @Override
    public void onInitialize() {
        boolean initRet = init();

        if (initRet) {
            LOGGER.info("MiracleRPG has been initialized!");
        }

    }

    private boolean init() {
        BiLvItemReg.registerItem();
        ChiHongXiLieReg.registerItem();
        DianLanItemReg.registerItem();//物品注册
        SimpleItem.ItemsRegister();
        OtherSwords.reg();

        AusterityReg.ArmorRegister();//盔甲注册

        OreBlock.BlocksRegister();//方块注册

        RPGitemGroup.GroupRegister();//物品组注册

        MiracleSharp MS = new MiracleSharp();
        MS.EnchantRegister();//附魔注册

        new RegisterLis();//监听器注册
        SimpleItemsGroupReg.pullFieldInItem(); //批量将物品压入数组
        SimpleItemsGroupReg.pullFieldInSword();
        SimpleItemsGroupReg.pullFieldInBlocks();

        //ZombieEntity.entityReg();//注册实体

        //矿脉
        OreFeatures biYuConfigFeatures = new OreFeatures();
        biYuConfigFeatures.oreReg();
        return true;
    }
}
