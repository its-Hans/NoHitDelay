package make.nohitdelay;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
	@Redirect(method = "doAttack",
			at = @At(value = "FIELD",
					target = "Lnet/minecraft/client/MinecraftClient;attackCooldown:I",
					ordinal = 0
			)
	)
	private int hookAttack(MinecraftClient instance) {
		return 0;
	}
}