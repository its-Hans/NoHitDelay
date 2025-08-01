package make.nohitdelay;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ClientPlayerInteractionManager.class)
public class MixinClientPlayerInteractionManager {
    /**
     * @author MakeCat
     * @reason simple
     */
    @Overwrite
    public boolean hasLimitedAttackSpeed() {
        return false;
    }
}
