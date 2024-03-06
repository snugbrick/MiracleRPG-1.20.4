package cn.m1racleur.miraclerpg.itemRegister;

import cn.m1racleur.miraclerpg.itemRegister.subSwordItems.SubSwordItem;
import cn.m1racleur.miraclerpg.itemRegister.subToolMaterial.BiLvTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.05 17:17
 * <p>
 * 碧绿系列武器装备
 */
public class BiLvItemReg {
    public static final ToolItem biLvZhiRen = new SubSwordItem(new BiLvTools(),
            8, -2.4F,
            new Item.Settings(), playerEntity -> {
        if (playerEntity != null && playerEntity.getHealth() <= 15.0F) {
            playerEntity.setHealth(playerEntity.getHealth() + 5.0F);
            playerEntity.sendMessage(Text.of("§a碧绿之力使你感到振奋"));
        } else if (playerEntity != null && playerEntity.getHealth() <= 20.0F && playerEntity.getHealth() > 15.0F) {
            playerEntity.setHealth(20.0F);
            playerEntity.sendMessage(Text.of("§a碧绿之力使你感到振奋"));
        }
        return true;
    }, "§b位阶 1/4", "§6\"生命的流光在此乍现\"");
    public static final ToolItem biLvZhiRen2 = new SubSwordItem(new BiLvTools(),
            10, -2.4F,
            new Item.Settings(), itemUsageContext -> true, "§b位阶 2/4");
    public static final ToolItem biLvZhiRen3 = new SubSwordItem(new BiLvTools(),
            12, -2.4F,
            new Item.Settings(), itemUsageContext -> true, "§b位阶 3/4");
    public static final ToolItem biLvZhiRen4 = new SubSwordItem(new BiLvTools(),
            14, -2.4F,
            new Item.Settings(), itemUsageContext -> true, "§b位阶 1/4");
    public static final Item biLvZhiZheng = new Item(new FabricItemSettings()
            .maxCount(64));

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren"), biLvZhiRen);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren2"), biLvZhiRen2);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren3"), biLvZhiRen3);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren4"), biLvZhiRen4);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "bilvzhizheng"), biLvZhiZheng);
    }
}
