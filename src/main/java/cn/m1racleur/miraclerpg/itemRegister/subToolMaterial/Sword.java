package cn.m1racleur.miraclerpg.itemRegister.subToolMaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.02.25 12:48
 */
public class Sword implements ToolMaterial {
    private final int Durability;
    private final float MiningSpeedMultiplier;
    private final float AttackDamage;
    private final int MiningLevel;
    private final int Enchantability;
    private final Ingredient RepairIngredient;

    public Sword(int Durability, float MiningSpeedMultiplier, float AttackDamage, int MiningLevel, int Enchantability, Ingredient RepairIngredient) {
        this.Durability = Durability;//耐久
        this.MiningSpeedMultiplier = MiningSpeedMultiplier;//挖掘效率
        this.AttackDamage = AttackDamage;//攻击伤害
        this.Enchantability = Enchantability;//附魔等级
        this.MiningLevel = MiningLevel;//挖掘等级
        this.RepairIngredient = RepairIngredient;//修复物品
    }

    @Override
    public int getDurability() {
        return Durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return MiningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return AttackDamage;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevel;
    }

    @Override
    public int getEnchantability() {
        return Enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return RepairIngredient;
    }
}
