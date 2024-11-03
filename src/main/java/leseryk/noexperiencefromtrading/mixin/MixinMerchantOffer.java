package leseryk.noexperiencefromtrading.mixin;

import net.minecraft.item.MerchantOffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MerchantOffer.class)
public class MixinMerchantOffer {

    @Shadow
    private boolean rewardExp;

    @Inject(method = "<init>(Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("RETURN"))
    private void onConstructed1(CallbackInfo ci) {
        this.rewardExp = false;
    }

    @Inject(method = "<init>(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;IIIFI)V", at = @At("RETURN"))
    private void onConstructed2(CallbackInfo ci) {
        this.rewardExp = false;
    }
}
