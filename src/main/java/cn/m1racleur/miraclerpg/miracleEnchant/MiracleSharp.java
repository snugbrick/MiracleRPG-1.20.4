package cn.m1racleur.miraclerpg.miracleEnchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 23:31
 * <p>
 * 奇迹RPG新附魔：奇迹锋利
 */
public class MiracleSharp extends Enchantment {

    public MiracleSharp() {
        super(Rarity.COMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND,});
    }

    @Override
    public int getMinPower(int level) {//附魔权重
        return 1;
    }

    @Override
    public int getMaxLevel() {//最高等级
        return 5;
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {

        return 3.0f + (float) Math.max(0, level - 1) * 0.5f;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity livingTarget) {

            livingTarget.damage(((LivingEntity) target).getRecentDamageSource(), 2.0F);

        }

        super.onTargetDamaged(user, target, level);
    }

    public void EnchantRegister() {
        Registry.register(Registries.ENCHANTMENT, new Identifier("miraclerpg", "miracle_sharp"), this);
    }
}
