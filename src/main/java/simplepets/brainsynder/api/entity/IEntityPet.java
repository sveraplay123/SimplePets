package simplepets.brainsynder.api.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import simple.brainsynder.nbt.StorageTagCompound;
import simplepets.brainsynder.api.pet.IPet;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public interface IEntityPet extends IImpossaPet {
    Player getOwner();

    IPet getPet();

    default UUID getUniqueId() {
        return getEntity().getUniqueId();
    }

    Entity getEntity();

    default List<Entity> getEntities() {
        return Arrays.asList(getEntity());
    }

    StorageTagCompound asCompound();

    void applyCompound(StorageTagCompound object);

    default boolean isBig() {
        return false;
    }
}
