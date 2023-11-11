package micdoodle8.mods.galacticraft.core.client.model;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import micdoodle8.mods.galacticraft.core.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.util.*;

public class ModelEvolvedZombie extends ModelBiped
{
    ModelRenderer leftOxygenTank;
    ModelRenderer rightOxygenTank;
    ModelRenderer tubeRight2;
    ModelRenderer tubeLeft1;
    ModelRenderer tubeRight3;
    ModelRenderer tubeRight4;
    ModelRenderer tubeRight5;
    ModelRenderer tubeLeft6;
    ModelRenderer tubeRight7;
    ModelRenderer tubeRight1;
    ModelRenderer tubeLeft2;
    ModelRenderer tubeLeft3;
    ModelRenderer tubeLeft4;
    ModelRenderer tubeLeft5;
    ModelRenderer tubeLeft7;
    ModelRenderer tubeRight6;
    ModelRenderer tubeLeft8;
    ModelRenderer oxygenMask;
    private float saveGravity;
    private boolean renderGear;
    
    public ModelEvolvedZombie(final boolean renderGear) {
        this(0.0f, false, renderGear);
    }
    
    public ModelEvolvedZombie(final float par1, final boolean halfSizeTexture, final boolean renderGear) {
        this.textureWidth = (halfSizeTexture ? 64 : 128);
        this.textureHeight = (halfSizeTexture ? 32 : 64);
        this.renderGear = renderGear;
        final int par2 = 0;
        (this.leftOxygenTank = new ModelRenderer((ModelBase)this, 56, 20)).addBox(-1.5f, 0.0f, -1.5f, 3, 7, 3, par1);
        this.leftOxygenTank.setRotationPoint(2.0f, 2.0f, 3.8f);
        this.leftOxygenTank.mirror = true;
        this.setRotation(this.leftOxygenTank, 0.0f, 0.0f, 0.0f);
        (this.rightOxygenTank = new ModelRenderer((ModelBase)this, 56, 20)).addBox(-1.5f, 0.0f, -1.5f, 3, 7, 3, par1);
        this.rightOxygenTank.setRotationPoint(-2.0f, 2.0f, 3.8f);
        this.rightOxygenTank.mirror = true;
        this.setRotation(this.rightOxygenTank, 0.0f, 0.0f, 0.0f);
        (this.tubeRight2 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight2.setRotationPoint(-2.0f, 2.0f, 6.8f);
        this.tubeRight2.mirror = true;
        this.setRotation(this.tubeRight2, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft1 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft1.setRotationPoint(2.0f, 3.0f, 5.8f);
        this.tubeLeft1.mirror = true;
        this.setRotation(this.tubeLeft1, 0.0f, 0.0f, 0.0f);
        (this.tubeRight3 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight3.setRotationPoint(-2.0f, 1.0f, 6.8f);
        this.tubeRight3.mirror = true;
        this.setRotation(this.tubeRight3, 0.0f, 0.0f, 0.0f);
        (this.tubeRight4 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight4.setRotationPoint(-2.0f, 0.0f, 6.8f);
        this.tubeRight4.mirror = true;
        this.setRotation(this.tubeRight4, 0.0f, 0.0f, 0.0f);
        (this.tubeRight5 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight5.setRotationPoint(-2.0f, -1.0f, 6.8f);
        this.tubeRight5.mirror = true;
        this.setRotation(this.tubeRight5, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft6 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft6.setRotationPoint(2.0f, -2.0f, 5.8f);
        this.tubeLeft6.mirror = true;
        this.setRotation(this.tubeLeft6, 0.0f, 0.0f, 0.0f);
        (this.tubeRight7 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight7.setRotationPoint(-2.0f, -3.0f, 4.8f);
        this.tubeRight7.mirror = true;
        this.setRotation(this.tubeRight7, 0.0f, 0.0f, 0.0f);
        (this.tubeRight1 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight1.setRotationPoint(-2.0f, 3.0f, 5.8f);
        this.tubeRight1.mirror = true;
        this.setRotation(this.tubeRight1, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft2 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft2.setRotationPoint(2.0f, 2.0f, 6.8f);
        this.tubeLeft2.mirror = true;
        this.setRotation(this.tubeLeft2, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft3 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft3.setRotationPoint(2.0f, 1.0f, 6.8f);
        this.tubeLeft3.mirror = true;
        this.setRotation(this.tubeLeft3, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft4 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft4.setRotationPoint(2.0f, 0.0f, 6.8f);
        this.tubeLeft4.mirror = true;
        this.setRotation(this.tubeLeft4, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft5 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft5.setRotationPoint(2.0f, -1.0f, 6.8f);
        this.tubeLeft5.mirror = true;
        this.setRotation(this.tubeLeft5, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft7 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeLeft7.setRotationPoint(2.0f, -3.0f, 4.8f);
        this.tubeLeft7.mirror = true;
        this.setRotation(this.tubeLeft7, 0.0f, 0.0f, 0.0f);
        (this.tubeRight6 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, par1);
        this.tubeRight6.setRotationPoint(-2.0f, -2.0f, 5.8f);
        this.tubeRight6.mirror = true;
        this.setRotation(this.tubeRight6, 0.0f, 0.0f, 0.0f);
        (this.tubeLeft8 = new ModelRenderer((ModelBase)this, 56, 30)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, par1);
        this.tubeLeft8.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.tubeLeft8.mirror = true;
        this.setRotation(this.tubeLeft8, 0.0f, 0.0f, 0.0f);
        (this.oxygenMask = new ModelRenderer((ModelBase)this, 56, 0)).addBox(-5.0f, -9.0f, -5.0f, 10, 10, 10, par1);
        this.oxygenMask.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.oxygenMask.mirror = true;
        this.setRotation(this.oxygenMask, 0.0f, 0.0f, 0.0f);
        (this.bipedCloak = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-5.0f, 0.0f, -1.0f, 10, 16, 1, par1);
        (this.bipedEars = new ModelRenderer((ModelBase)this, 24, 0)).addBox(-3.0f, -6.0f, -1.0f, 6, 6, 1, par1);
        (this.bipedHead = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1);
        this.bipedHead.setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.bipedHeadwear = new ModelRenderer((ModelBase)this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1 + 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.bipedBody = new ModelRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, par1);
        this.bipedBody.setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.bipedRightArm = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.bipedLeftArm = new ModelRenderer((ModelBase)this, 40, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.bipedLeftLeg = new ModelRenderer((ModelBase)this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        this.saveGravity = WorldUtil.getGravityFactor(entity);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        if (this.isChild) {
            final float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef(1.5f / f6, 1.5f / f6, 1.5f / f6);
            GL11.glTranslatef(0.0f, 16.0f * f5, 0.0f);
            this.bipedHead.render(f5);
            if (this.renderGear) {
                this.oxygenMask.render(f5);
            }
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f6, 1.0f / f6, 1.0f / f6);
            GL11.glTranslatef(0.0f, 24.0f * f5, 0.0f);
            if (this.renderGear) {
                this.leftOxygenTank.render(f5);
                this.rightOxygenTank.render(f5);
                this.tubeRight2.render(f5);
                this.tubeLeft1.render(f5);
                this.tubeRight3.render(f5);
                this.tubeRight4.render(f5);
                this.tubeRight5.render(f5);
                this.tubeLeft6.render(f5);
                this.tubeRight7.render(f5);
                this.tubeRight1.render(f5);
                this.tubeLeft2.render(f5);
                this.tubeLeft3.render(f5);
                this.tubeLeft4.render(f5);
                this.tubeLeft5.render(f5);
                this.tubeLeft7.render(f5);
                this.tubeRight6.render(f5);
                this.tubeLeft8.render(f5);
            }
            this.bipedBody.render(f5);
            this.bipedRightArm.render(f5);
            this.bipedLeftArm.render(f5);
            this.bipedRightLeg.render(f5);
            this.bipedLeftLeg.render(f5);
            this.bipedHeadwear.render(f5);
            GL11.glPopMatrix();
        }
        else {
            if (this.renderGear) {
                this.leftOxygenTank.render(f5);
                this.rightOxygenTank.render(f5);
                this.tubeRight2.render(f5);
                this.tubeLeft1.render(f5);
                this.tubeRight3.render(f5);
                this.tubeRight4.render(f5);
                this.tubeRight5.render(f5);
                this.tubeLeft6.render(f5);
                this.tubeRight7.render(f5);
                this.tubeRight1.render(f5);
                this.tubeLeft2.render(f5);
                this.tubeLeft3.render(f5);
                this.tubeLeft4.render(f5);
                this.tubeLeft5.render(f5);
                this.tubeLeft7.render(f5);
                this.tubeRight6.render(f5);
                this.tubeLeft8.render(f5);
                this.oxygenMask.render(f5);
            }
            this.bipedHead.render(f5);
            this.bipedBody.render(f5);
            this.bipedRightArm.render(f5);
            this.bipedLeftArm.render(f5);
            this.bipedRightLeg.render(f5);
            this.bipedLeftLeg.render(f5);
            this.bipedHeadwear.render(f5);
        }
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6) {
        this.bipedHead.rotateAngleY = par4 / 57.295776f;
        this.bipedHead.rotateAngleX = par5 / 57.295776f;
        this.oxygenMask.rotateAngleY = par4 / 57.295776f;
        this.oxygenMask.rotateAngleX = par5 / 57.295776f;
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f / this.saveGravity) * (1.5f - this.saveGravity) * par2;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f / this.saveGravity + 3.1415927f) * (1.5f - this.saveGravity) * par2;
        this.bipedRightLeg.rotateAngleY = 0.0f;
        this.bipedLeftLeg.rotateAngleY = 0.0f;
        if (this.isRiding) {
            final ModelRenderer bipedRightArm = this.bipedRightArm;
            bipedRightArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer bipedLeftArm = this.bipedLeftArm;
            bipedLeftArm.rotateAngleX -= 0.62831855f;
            this.bipedRightLeg.rotateAngleX = -1.2566371f;
            this.bipedLeftLeg.rotateAngleX = -1.2566371f;
            this.bipedRightLeg.rotateAngleY = 0.31415927f;
            this.bipedLeftLeg.rotateAngleY = -0.31415927f;
        }
        this.bipedRightArm.rotateAngleY = 0.0f;
        this.bipedLeftArm.rotateAngleY = 0.0f;
        if (this.onGround > -9990.0f) {
            float var7 = this.onGround;
            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var7) * 3.1415927f * 2.0f) * 0.2f;
            this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            final ModelRenderer bipedRightArm2 = this.bipedRightArm;
            bipedRightArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
            bipedLeftArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
            bipedLeftArm3.rotateAngleX += this.bipedBody.rotateAngleY;
            var7 = 1.0f - this.onGround;
            var7 *= var7;
            var7 *= var7;
            var7 = 1.0f - var7;
            final float var8 = MathHelper.sin(var7 * 3.1415927f);
            final float var9 = MathHelper.sin(this.onGround * 3.1415927f) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
            this.bipedRightArm.rotateAngleX -= (float)(var8 * 1.2 + var9);
            final ModelRenderer bipedRightArm3 = this.bipedRightArm;
            bipedRightArm3.rotateAngleY += this.bipedBody.rotateAngleY * 2.0f;
            this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * 3.1415927f) * -0.4f;
        }
        this.bipedBody.rotateAngleX = 0.0f;
        this.bipedRightLeg.rotationPointZ = 0.0f;
        this.bipedLeftLeg.rotationPointZ = 0.0f;
        this.bipedRightLeg.rotationPointY = 12.0f;
        this.bipedLeftLeg.rotationPointY = 12.0f;
        this.bipedHead.rotationPointY = 0.0f;
        final ModelRenderer bipedRightArm4 = this.bipedRightArm;
        bipedRightArm4.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm4 = this.bipedLeftArm;
        bipedLeftArm4.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm5 = this.bipedRightArm;
        bipedRightArm5.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm5 = this.bipedLeftArm;
        bipedLeftArm5.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
        final float var7a = MathHelper.sin(this.onGround * 3.1415927f);
        final float var8a = MathHelper.sin((1.0f - (1.0f - this.onGround) * (1.0f - this.onGround)) * 3.1415927f);
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightArm.rotateAngleY = -(0.1f - var7a * 0.6f);
        this.bipedLeftArm.rotateAngleY = 0.1f - var7a * 0.6f;
        this.bipedRightArm.rotateAngleX = -1.5707964f;
        this.bipedLeftArm.rotateAngleX = -1.5707964f;
        final ModelRenderer bipedRightArm6 = this.bipedRightArm;
        bipedRightArm6.rotateAngleX -= var7a * 1.2f - var8a * 0.4f;
        final ModelRenderer bipedLeftArm6 = this.bipedLeftArm;
        bipedLeftArm6.rotateAngleX -= var7a * 1.2f - var8a * 0.4f;
        final ModelRenderer bipedRightArm7 = this.bipedRightArm;
        bipedRightArm7.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm7 = this.bipedLeftArm;
        bipedLeftArm7.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm8 = this.bipedRightArm;
        bipedRightArm8.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm8 = this.bipedLeftArm;
        bipedLeftArm8.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
    }
}
