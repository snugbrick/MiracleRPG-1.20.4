package cn.m1racleur.miraclerpg;

import cn.m1racleur.miraclerpg.entity.ModEntities;
import cn.m1racleur.miraclerpg.entity.baoxiangguaiEntity.BaoxiangguaiEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private boolean init() {
        EntityRendererRegistry.register(ModEntities.baoxiangguai, BaoxiangguaiEntityRenderer::new);
        LOGGER.info("entities loading completed");

        return true;
    }
}
