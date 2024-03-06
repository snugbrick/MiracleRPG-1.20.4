package cn.m1racleur.miraclerpg.itemRegister;

import cn.m1racleur.miraclerpg.itemRegister.subSwordItems.SubSwordItem;
import cn.m1racleur.miraclerpg.itemRegister.subToolMaterial.DianLanTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 02:13
 */
public class DianLanItemReg {
    public static final ToolItem dianlanzhiren
            =new SubSwordItem(new DianLanTools(),8,-2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 1/4");
    public static final ToolItem dianlanzhiren2
            =new SubSwordItem(new DianLanTools(),10,-2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 2/4");
    public static final ToolItem dianlanzhiren3
            =new SubSwordItem(new DianLanTools(),12,-2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 3/4");
    public static final ToolItem dianlanzhiren4
            =new SubSwordItem(new DianLanTools(),14,-2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 4/4");
    public static final Item dianLanBaoShi = new Item(new FabricItemSettings()
            .maxCount(64));
    public static final Item dianLanDing = new Item(new FabricItemSettings()
            .maxCount(64));
    public static void registerItem(){
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren"), dianlanzhiren);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren2"), dianlanzhiren2);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren3"), dianlanzhiren3);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren4"), dianlanzhiren4);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanbaoshi"), dianLanBaoShi);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanding"), dianLanDing);
    }
}
