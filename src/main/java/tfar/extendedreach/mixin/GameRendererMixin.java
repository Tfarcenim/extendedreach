package tfar.extendedreach.mixin;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import tfar.extendedreach.ExampleMod;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

	@ModifyVariable(method = "updateTargetedEntity",at = @At(value = "INVOKE",
					target = "Lnet/minecraft/util/math/Vec3d;squaredDistanceTo(Lnet/minecraft/util/math/Vec3d;)D"),ordinal = 0)
	private double wee(double old,float tickDelta){
		return ExampleMod.reach;
	}

	@ModifyVariable(method = "updateTargetedEntity",at = @At(value = "INVOKE",
									target = "Lnet/minecraft/util/math/Vec3d;squaredDistanceTo(Lnet/minecraft/util/math/Vec3d;)D"),ordinal = 1)
	private double weee(double old,float tickDelta){
		return ExampleMod.reach * ExampleMod.reach;
	}
}
