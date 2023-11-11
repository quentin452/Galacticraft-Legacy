package micdoodle8.mods.galacticraft.core.world.gen.dungeon;

import net.minecraftforge.common.util.*;
import java.util.*;
import net.minecraft.block.*;
import net.minecraft.init.*;

public class RoomEmptyMoon extends DungeonRoom
{
    int sizeX;
    int sizeY;
    int sizeZ;
    
    public RoomEmptyMoon(final MapGenDungeon dungeon, final int posX, final int posY, final int posZ, final ForgeDirection entranceDir) {
        super(dungeon, posX, posY, posZ, entranceDir);
        if (this.worldObj != null) {
            final Random rand = new Random(this.worldObj.getSeed() * posX * posY * 57L * posZ);
            this.sizeX = rand.nextInt(4) + 5;
            this.sizeY = rand.nextInt(2) + 4;
            this.sizeZ = rand.nextInt(4) + 5;
        }
    }
    
    public void generate(final Block[] chunk, final byte[] meta, final int cx, final int cz) {
        for (int i = this.posX - 1; i <= this.posX + this.sizeX; ++i) {
            for (int j = this.posY - 1; j <= this.posY + this.sizeY; ++j) {
                for (int k = this.posZ - 1; k <= this.posZ + this.sizeZ; ++k) {
                    if (i == this.posX - 1 || i == this.posX + this.sizeX || j == this.posY - 1 || j == this.posY + this.sizeY || k == this.posZ - 1 || k == this.posZ + this.sizeZ) {
                        this.placeBlock(chunk, meta, i, j, k, cx, cz, this.dungeonInstance.DUNGEON_WALL_ID, this.dungeonInstance.DUNGEON_WALL_META);
                    }
                    else {
                        this.placeBlock(chunk, meta, i, j, k, cx, cz, Blocks.air, 0);
                    }
                }
            }
        }
    }
    
    public DungeonBoundingBox getBoundingBox() {
        return new DungeonBoundingBox(this.posX, this.posZ, this.posX + this.sizeX, this.posZ + this.sizeZ);
    }
    
    protected DungeonRoom makeRoom(final MapGenDungeon dungeon, final int x, final int y, final int z, final ForgeDirection dir) {
        return new RoomEmptyMoon(dungeon, x, y, z, dir);
    }
    
    protected void handleTileEntities(final Random rand) {
    }
}
