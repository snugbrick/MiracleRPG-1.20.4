package cn.m1racleur.miraclerpg;

import cn.m1racleur.miraclerpg.entity.ModEntities;
import cn.m1racleur.miraclerpg.entity._3m20d.baoxiangguaiEntity.BaoxiangguaiEntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m20d.bianfu.BianfuEntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m20d.binglang.BinglangEntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m20d.boss1.Boss1EntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m20d.boss2.Boss2EntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m21d.boss3.Boss3EntityRenderer;
import cn.m1racleur.miraclerpg.entity._3m21d.boss4.Boss4EntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.06 19:44
 */
public class MiracleRPGClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");

    @Override
    public void onInitializeClient() {
        boolean initRet = init();

        if (initRet) {
            LOGGER.info("MiracleRPG has been initialized!");
        }
    }

    private <E> boolean init() {
        EntityRendererRegistry.register(ModEntities.baoxiangguai, BaoxiangguaiEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.bianfu, BianfuEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.binglang, BinglangEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.boss1, Boss1EntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.boss2, Boss2EntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.boss3, Boss3EntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.boss4, Boss4EntityRenderer::new);
        LOGGER.info("entities loading completed");

        return true;
    }
}
