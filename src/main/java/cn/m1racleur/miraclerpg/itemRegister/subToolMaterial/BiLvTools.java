package cn.m1racleur.miraclerpg.itemRegister.subToolMaterial;

import cn.m1racleur.miraclerpg.itemRegister.BiLvItemReg;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 21:44
 */
public class BiLvTools implements ToolMaterial {
/*
    extend Item

    public BiLvTools(Settings settings) {
        super(settings);
    }
    @Override
    public boolean isFireproof(){
        return true;
    }
    @Override
    public Rarity getRarity(ItemStack stack){
        return Rarity.RARE;
    }
 */

    //上面是Item的重写，下面是ToolMaterial的实现

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
        return 0;
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
        return Ingredient.ofItems(BiLvItemReg.biLvZhiZheng);
    }
}
