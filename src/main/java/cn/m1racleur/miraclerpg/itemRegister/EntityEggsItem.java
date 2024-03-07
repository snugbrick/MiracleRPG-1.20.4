package cn.m1racleur.miraclerpg.itemRegister;

import cn.m1racleur.miraclerpg.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.07 00:56
 */
public class EntityEggsItem {
    public static final Item CHOMPER_SPAWN_EGG = registerItem("baoxiangguai_spawn_egg",
            new SpawnEggItem(ModEntities.modEntity,0x22b341,0x19732e,
                    new FabricItemSettings()));

    private static Item registerItem(String name,Item item){
        //Registry.register(Registries.ITEM, new Identifier("miraclerpg", "hanshuangjian"), hanshuangjian);

        return Registry.register(Registries.ITEM,new Identifier("miraclerpg",name),item);
    }

}
