package cn.m1racleur.miraclerpg.itemRegister.subSwordItems;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.02 18:22
 */
public class SubSwordItem extends SwordItem {
    private final String[] tooltip = new String[5];
    private Function<PlayerEntity, Boolean> function;

    public SubSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, Function<PlayerEntity, Boolean> task, String... tooltip) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        if (tooltip != null) {
            for (int i = 0; i < tooltip.length && i < this.tooltip.length; i++) {
                this.tooltip[i] = tooltip[i];
            }
        }
        if (task != null) this.function = task;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        for (int index = 0; index < 5; index++) {
            if (this.tooltip[index] != null) tooltip.add(Text.literal(this.tooltip[index]));
        }
        //tooltip.add(Text.literal("Press \"shift\" for more"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.getWorld().isClient) function.apply(user);
        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient) {

            return ActionResult.SUCCESS;
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
