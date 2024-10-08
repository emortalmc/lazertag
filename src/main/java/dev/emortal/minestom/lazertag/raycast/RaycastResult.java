package dev.emortal.minestom.lazertag.raycast;

import net.minestom.server.coordinate.Point;
import net.minestom.server.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * If hit position is null, nothing was hit
 * If hit entity is null but hit position isn't, a block was hit
 * If neither are null, an entity was hit
 */
public record RaycastResult(@Nullable Entity hitEntity, @Nullable Point hitPosition) {
    public static final @NotNull RaycastResult HIT_NOTHING = new RaycastResult(null, null);
}
