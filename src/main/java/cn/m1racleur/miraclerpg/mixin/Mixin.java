package cn.m1racleur.miraclerpg.mixin;

import net.minecraft.util.PngMetadata;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@org.spongepowered.asm.mixin.Mixin(PngMetadata.class)
public class Mixin {
    @Inject(at = @At("HEAD"), method = "validate",cancellable = true)
    private static void init(CallbackInfo info) {
        info.cancel();
    }
}