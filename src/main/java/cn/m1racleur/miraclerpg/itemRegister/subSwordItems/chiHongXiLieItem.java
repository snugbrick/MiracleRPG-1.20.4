package cn.m1racleur.miraclerpg.itemRegister.subSwordItems;

import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 03:44
 */
@Deprecated
public class chiHongXiLieItem extends Item {
    public chiHongXiLieItem(Settings settings) {
        super(settings);
    }
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot){
        return super.getAttributeModifiers(slot);
    }
    @Override
    public boolean isFireproof(){
        return true;
    }
    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return false;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        player.sendMessage(Text.of("你已成功制作出: " + stack.getItem().getName()));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
    @Override
    public Rarity getRarity(ItemStack stack){
        return Rarity.RARE;
    }
    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient){
        return true;
    }
}
