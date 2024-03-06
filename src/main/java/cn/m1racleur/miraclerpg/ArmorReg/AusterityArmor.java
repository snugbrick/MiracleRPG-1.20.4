package cn.m1racleur.miraclerpg.ArmorReg;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static cn.m1racleur.miraclerpg.itemRegister.SimpleItem.buRongBing;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.08 02:07
 * <p>
 * 冰霜甲
 */
public class AusterityArmor implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{100, 120, 120, 100};
    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * 10;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return 4;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(buRongBing);
    }

    @Override
    public String getName() {
        return "austerity";
    }

    @Override
    public float getToughness() {
        return 10;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
