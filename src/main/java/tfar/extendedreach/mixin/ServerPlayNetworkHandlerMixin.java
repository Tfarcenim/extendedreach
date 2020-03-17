package tfar.extendedreach.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.packet.PlayerInteractEntityC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import tfar.extendedreach.ExampleMod;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandlerMixin {
	@ModifyVariable(method = "onPlayerInteractEntity",
					at = @At(value = "INVOKE",target = "Lnet/minecraft/server/network/ServerPlayerEntity;squaredDistanceTo(Lnet/minecraft/entity/Entity;)D"))
	public double d(double old,PlayerInteractEntityC2SPacket rpacket) {
		return ExampleMod.reach * ExampleMod.reach;
	}
}
