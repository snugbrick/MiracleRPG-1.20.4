package cn.m1racleur.miraclerpg;

import cn.m1racleur.miraclerpg.ArmorReg.AusterityReg;
import cn.m1racleur.miraclerpg.BlocksReg.OreBlock;
import cn.m1racleur.miraclerpg.entity.ModEntities;
import cn.m1racleur.miraclerpg.entity._3m20d.baoxiangguaiEntity.BaoxiangguaiEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.bianfu.BianfuEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.binglang.BinglangEntity;
import cn.m1racleur.miraclerpg.entity._3m20d.boss1.Boss1Entity;
import cn.m1racleur.miraclerpg.entity._3m20d.boss2.Boss2Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4Entity;
import cn.m1racleur.miraclerpg.entity._3m21d.creeper.CreeperEntity;
import cn.m1racleur.miraclerpg.entity._3m21d.creeper1.Creeper1Entity;
import cn.m1racleur.miraclerpg.gen.WorldGenReg;
import cn.m1racleur.miraclerpg.itemGroupReg.RPGitemGroup;
import cn.m1racleur.miraclerpg.itemGroupReg.SimpleItemsGroupReg;
import cn.m1racleur.miraclerpg.itemRegister.*;
import cn.m1racleur.miraclerpg.listener.RegisterLis;
import cn.m1racleur.miraclerpg.miracleEnchant.MiracleSharp;
import cn.m1racleur.miraclerpg.world.feature.OreFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 19:44
 */
public class MiracleRPG implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");

    @Override
    public void onInitialize() {
        boolean initRet = init();
        GeckoLib.initialize();

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
        LOGGER.info("items & swords loading completed");

        AusterityReg.ArmorRegister();//盔甲注册
        LOGGER.info("armor loading completed");

        OreBlock.BlocksRegister();//方块注册
        LOGGER.info("blocks loading completed");

        RPGitemGroup.GroupRegister();//物品组注册
        LOGGER.info("itemGroup loading completed");

        MiracleSharp MS = new MiracleSharp();
        MS.EnchantRegister();//附魔注册
        LOGGER.info("enchant loading completed");

        new RegisterLis();//监听器注册
        LOGGER.info("listener loading completed");
        SimpleItemsGroupReg.pullFieldInItem(); //批量将物品压入数组
        SimpleItemsGroupReg.pullFieldInSword();
        SimpleItemsGroupReg.pullFieldInBlocks();

        //矿脉
        OreFeatures biYuConfigFeatures = new OreFeatures();
        biYuConfigFeatures.oreReg();
        LOGGER.info("OreFeatures loading completed");

        Item item = EntityEggsItem.CHOMPER_SPAWN_EGG;

        entityReg();
        LOGGER.info("entities loading completed");

        WorldGenReg.addWorldGen();//实体世界生成

        return true;
    }

    private void entityReg() {
        FabricDefaultAttributeRegistry.register(ModEntities.baoxiangguai, BaoxiangguaiEntity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.bianfu, BianfuEntity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.binglang, BinglangEntity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.boss1, Boss1Entity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.boss2, Boss2Entity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.boss3, Boss3Entity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.boss4, Boss4Entity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.creeper, CreeperEntity.setAttribute());
        FabricDefaultAttributeRegistry.register(ModEntities.creeper1, Creeper1Entity.setAttribute());
    }
}
