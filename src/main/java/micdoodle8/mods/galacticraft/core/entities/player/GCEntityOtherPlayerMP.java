package micdoodle8.mods.galacticraft.core.entities.player;

import com.mojang.authlib.GameProfile;

import micdoodle8.mods.galacticraft.api.entity.ICameraZoomEntity;
import micdoodle8.mods.galacticraft.api.item.IHoldableItem;
import micdoodle8.mods.galacticraft.api.prefab.entity.EntitySpaceshipBase;
import micdoodle8.mods.galacticraft.api.world.IZeroGDimension;
import micdoodle8.mods.galacticraft.core.Constants;
import micdoodle8.mods.galacticraft.core.client.EventHandlerClient;
import micdoodle8.mods.galacticraft.core.util.CapeUtil;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;

import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GCEntityOtherPlayerMP extends EntityOtherPlayerMP
{

    private boolean checkedCape = false;
    private ResourceLocation galacticraftCape = null;

    public GCEntityOtherPlayerMP(World par1World, GameProfile profile)
    {
        super(par1World, profile);
    }

    @Override
    public ResourceLocation getLocationCape()
    {
        if (this.getRidingEntity() instanceof EntitySpaceshipBase)
        {
            // Don't draw any cape if riding a rocket (the cape renders outside
            // the rocket model!)
            return null;
        }

        ResourceLocation vanillaCape = super.getLocationCape();

        if (!this.checkedCape)
        {
            NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
            String cape = CapeUtil.instance().getCape(networkplayerinfo.getGameProfile().getId().toString().replace("-", ""));
            if (!cape.equalsIgnoreCase("none"))
            {
                this.galacticraftCape = new ResourceLocation(Constants.MOD_ID_CORE, "textures/misc/capes/cape_" + cape + ".png");
            }
            this.checkedCape = true;
        }

        if ((ConfigManagerCore.overrideCapes || vanillaCape == null) && galacticraftCape != null)
        {
            return galacticraftCape;
        }

        return vanillaCape;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender()
    {
        double height = this.posY + (double) this.getEyeHeight();
        if (height > 255D)
            height = 255D;
        BlockPos blockpos = new BlockPos(this.posX, height, this.posZ);
        return this.world.isBlockLoaded(blockpos) ? this.world.getCombinedLight(blockpos, 0) : 0;
    }

    @Override
    public boolean isSneaking()
    {
        if (EventHandlerClient.sneakRenderOverride && !(this.world.provider instanceof IZeroGDimension))
        {
            if (this.onGround && this.inventory.getCurrentItem() != null && this.inventory.getCurrentItem().getItem() instanceof IHoldableItem
                && !(this.getRidingEntity() instanceof ICameraZoomEntity))
            {
                IHoldableItem holdableItem = (IHoldableItem) this.inventory.getCurrentItem().getItem();

                if (holdableItem.shouldCrouch(this))
                {
                    return true;
                }
            }
        }
        return super.isSneaking();
    }
}
