package cn.m1racleur.miraclerpg.itemRegister;

import cn.m1racleur.miraclerpg.itemRegister.subSwordItems.SubSwordItem;
import cn.m1racleur.miraclerpg.itemRegister.subToolMaterial.ChiHongTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 03:46
 * <p>
 * 赤红系列武器装备
 */
public class ChiHongXiLieReg {
    public static final Item chiHongZhiRen = new SubSwordItem(new ChiHongTools(),
            8, -2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 1/4");
    public static final ToolItem chiHongZhiRen2 = new SubSwordItem(new ChiHongTools(),
            10, -2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 2/4");
    public static final ToolItem chiHongZhiRen3 = new SubSwordItem(new ChiHongTools(),
            12, -2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 3/4");
    public static final ToolItem ChiHongZhiRen4 = new SubSwordItem(new ChiHongTools(),
            14, -2.4F,
            new Item.Settings(),itemUsageContext -> true,"§b位阶 4/4");
    public static final Item chiHongBaoShi = new Item(new FabricItemSettings()
            .maxCount(64));
    public static final Item chiHongKuangShi = new Item(new FabricItemSettings()
            .maxCount(64));
    public static Item chiTieDing = new Item(new FabricItemSettings().maxCount(64));


    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongzhiren"), chiHongZhiRen);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongzhiren2"), chiHongZhiRen2);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongzhiren3"), chiHongZhiRen3);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongzhiren4"), ChiHongZhiRen4);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongbaoshi"), chiHongBaoShi);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongkuangshi"), chiHongKuangShi);

        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chitieding"), chiTieDing);
    }
}
