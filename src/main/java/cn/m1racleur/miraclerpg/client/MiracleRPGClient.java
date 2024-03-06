package cn.m1racleur.miraclerpg.client;

import net.fabricmc.api.ClientModInitializer;
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
    private boolean init(){
        return true;
    }
}
