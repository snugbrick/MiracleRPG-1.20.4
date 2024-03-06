package cn.m1racleur.miraclerpg.itemRegister.subToolMaterial;

import cn.m1racleur.miraclerpg.itemRegister.DianLanItemReg;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 02:12
 */
public class DianLanTools implements ToolMaterial {
    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(DianLanItemReg.dianLanDing);
    }
}
