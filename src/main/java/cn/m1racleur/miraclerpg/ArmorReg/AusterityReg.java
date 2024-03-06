package cn.m1racleur.miraclerpg.ArmorReg;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.08 02:28
 */
public class AusterityReg {
    public static final ArmorMaterial austerityarmor = new AusterityArmor();

    public static final Item AUSTERITY_MATERIAL_HELMET = new ArmorItem(austerityarmor, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item AUSTERITY_MATERIAL_CHESTPLATE = new ArmorItem(austerityarmor, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item AUSTERITY_MATERIAL_LEGGINGS = new ArmorItem(austerityarmor, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item AUSTERITY_MATERIAL_BOOTS = new ArmorItem(austerityarmor, ArmorItem.Type.BOOTS, new Item.Settings());

    public static void ArmorRegister() {
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "austerity_helmet"), AUSTERITY_MATERIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "austerity_chestplate"), AUSTERITY_MATERIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "austerity_leggings"), AUSTERITY_MATERIAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "austerity_boots"), AUSTERITY_MATERIAL_BOOTS);
    }
}
