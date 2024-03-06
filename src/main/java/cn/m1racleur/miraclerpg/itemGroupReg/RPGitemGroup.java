package cn.m1racleur.miraclerpg.itemGroupReg;

import cn.m1racleur.miraclerpg.ArmorReg.AusterityReg;
import cn.m1racleur.miraclerpg.itemRegister.BiLvItemReg;
import cn.m1racleur.miraclerpg.itemRegister.ChiHongXiLieReg;
import cn.m1racleur.miraclerpg.itemRegister.DianLanItemReg;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.m1racleur.miraclerpg.itemRegister.BiLvItemReg.biLvZhiZheng;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 04:48
 */
public class RPGitemGroup {
    public static void GroupRegister() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("miraclerpg", "combat_group"), rgpItemGroup);
    }

    private static final ItemGroup rgpItemGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(biLvZhiZheng))
            .displayName(Text.translatable("奇迹RPG物品"))
            .entries((context, entries) -> {
                entries.add(BiLvItemReg.biLvZhiRen);
                entries.add(BiLvItemReg.biLvZhiRen2);
                entries.add(BiLvItemReg.biLvZhiRen3);
                entries.add(BiLvItemReg.biLvZhiRen4);

                entries.add(ChiHongXiLieReg.chiHongZhiRen);
                entries.add(ChiHongXiLieReg.chiHongZhiRen2);
                entries.add(ChiHongXiLieReg.chiHongZhiRen3);
                entries.add(ChiHongXiLieReg.ChiHongZhiRen4);

                entries.add(DianLanItemReg.dianlanzhiren);
                entries.add(DianLanItemReg.dianlanzhiren2);
                entries.add(DianLanItemReg.dianlanzhiren3);
                entries.add(DianLanItemReg.dianlanzhiren4);

                entries.add(AusterityReg.AUSTERITY_MATERIAL_HELMET);
                entries.add(AusterityReg.AUSTERITY_MATERIAL_CHESTPLATE);
                entries.add(AusterityReg.AUSTERITY_MATERIAL_LEGGINGS);
                entries.add(AusterityReg.AUSTERITY_MATERIAL_BOOTS);


                entries.add(DianLanItemReg.dianLanDing);
                entries.add(DianLanItemReg.dianLanBaoShi);
                entries.add(ChiHongXiLieReg.chiTieDing);

                entries.add(BiLvItemReg.biLvZhiZheng);
                entries.add(ChiHongXiLieReg.chiHongBaoShi);
                entries.add(ChiHongXiLieReg.chiHongKuangShi);


                for (Item item : SimpleItemsGroupReg.simpleItems) {
                    entries.add(item);
                }

                for (Item item : SimpleItemsGroupReg.swords) {
                    entries.add(item);
                }
                for (Block block : SimpleItemsGroupReg.Blocks) {
                    entries.add(block.asItem());
                }
            })
            .build();

}
