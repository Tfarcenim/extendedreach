package tfar.extendedreach.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.extendedreach.ExampleMod;

@Mixin(ClientPlayerInteractionManager.class)
public class ClientPlayerInteractionManagerMixin {
	@Inject(method = "getReachDistance",at = @At("RETURN"),cancellable = true)
	private void wee(CallbackInfoReturnable<Float> cir){
		cir.setReturnValue((float) ExampleMod.reach);
	}
}
