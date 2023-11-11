package micdoodle8.mods.galacticraft.core.tile;

import net.minecraft.tileentity.*;
import net.minecraft.init.*;
import micdoodle8.mods.galacticraft.core.blocks.*;
import micdoodle8.mods.galacticraft.api.vector.*;
import java.util.*;

public class TileEntityLandingPadSingle extends TileEntity
{
    public void updateEntity() {
        if (!this.worldObj.isRemote) {
            final ArrayList<TileEntity> attachedLaunchPads = new ArrayList<TileEntity>();
            for (int x = this.xCoord - 1; x < this.xCoord + 2; ++x) {
                for (int z = this.zCoord - 1; z < this.zCoord + 2; ++z) {
                    final TileEntity tile = this.worldObj.getTileEntity(x, this.yCoord, z);
                    if (tile instanceof TileEntityLandingPadSingle) {
                        attachedLaunchPads.add(tile);
                    }
                }
            }
            if (attachedLaunchPads.size() == 9) {
                for (final TileEntity tile2 : attachedLaunchPads) {
                    tile2.invalidate();
                    tile2.getWorldObj().setBlock(tile2.xCoord, tile2.yCoord, tile2.zCoord, Blocks.air, 0, 3);
                }
                this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, GCBlocks.landingPadFull, 0, 3);
                final TileEntityLandingPad tilePadFull = (TileEntityLandingPad)this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord);
                if (tilePadFull != null) {
                    tilePadFull.onCreate(new BlockVec3(this.xCoord, this.yCoord, this.zCoord));
                }
            }
        }
    }
}
