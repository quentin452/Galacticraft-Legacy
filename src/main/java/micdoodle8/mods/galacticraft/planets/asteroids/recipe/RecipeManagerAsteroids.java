package micdoodle8.mods.galacticraft.planets.asteroids.recipe;

import micdoodle8.mods.galacticraft.planets.asteroids.items.*;
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.*;
import micdoodle8.mods.galacticraft.core.items.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import micdoodle8.mods.galacticraft.planets.mars.items.*;
import micdoodle8.mods.galacticraft.core.blocks.*;
import net.minecraft.item.crafting.*;
import net.minecraft.block.*;
import micdoodle8.mods.galacticraft.api.recipe.*;
import micdoodle8.mods.galacticraft.core.util.*;
import net.minecraftforge.oredict.*;
import java.util.*;

public class RecipeManagerAsteroids
{
    public static void loadRecipes() {
        addUniversalRecipes();
    }
    
    private static void addUniversalRecipes() {
        final Object titaniumIngot = ConfigManagerCore.recipesRequireGCAdvancedMetals ? new ItemStack(AsteroidsItems.basicItem, 1, 5) : "ingotTitanium";
        final Object titaniumPlate = ConfigManagerCore.recipesRequireGCAdvancedMetals ? new ItemStack(AsteroidsItems.basicItem, 1, 6) : "compressedTitanium";
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(AsteroidBlocks.blockBasic, 1, 3), new ItemStack(GCItems.basicItem, 1, 5), 0.0f);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(AsteroidBlocks.blockBasic, 1, 4), new ItemStack(AsteroidsItems.basicItem, 1, 5), 0.0f);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(AsteroidBlocks.blockBasic, 1, 5), new ItemStack(Items.iron_ingot), 0.0f);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(AsteroidsItems.basicItem, 1, 3), new ItemStack(Items.iron_ingot), 0.5f);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(AsteroidsItems.basicItem, 1, 4), new ItemStack(AsteroidsItems.basicItem, 1, 5), 0.5f);
        RecipeUtil.addRecipe(new ItemStack((Item)AsteroidsItems.heavyNoseCone, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'Y', Blocks.redstone_torch });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 7), new Object[] { " X ", "XYX", " X ", 'X', Blocks.wool, 'Y', Items.redstone });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.thermalPadding, 1, 0), new Object[] { "XXX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.thermalPadding, 1, 1), new Object[] { "X X", "XXX", "XXX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.thermalPadding, 1, 2), new Object[] { "XXX", "X X", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.thermalPadding, 1, 3), new Object[] { "X X", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumHelmet, 1), new Object[] { "XXX", "X X", 'X', titaniumPlate });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', titaniumPlate });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', titaniumPlate });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumBoots, 1), new Object[] { "X X", "X X", 'X', titaniumPlate });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumPickaxe, 1), new Object[] { "YYY", " X ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumAxe, 1), new Object[] { "YY ", "YX ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumAxe, 1), new Object[] { " YY", " XY", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumHoe, 1), new Object[] { " YY", " X ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumHoe, 1), new Object[] { "YY ", " X ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumSpade, 1), new Object[] { " Y ", " X ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.titaniumSword, 1), new Object[] { " Y ", " Y ", " X ", 'Y', titaniumPlate, 'X', Items.stick });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 1), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 1), new Object[] { "VY ", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 3) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.grapple, 1), new Object[] { "  Z", "XZ ", "XX ", 'X', Items.iron_ingot, 'Z', Items.string });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.atmosphericValve, 1, 0), new Object[] { "   ", "XYX", " X ", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y', GCItems.oxygenVent });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem), 'Y', "compressedTitanium" });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.blockWalkway, 5), new Object[] { "XXX", " X ", 'X', titaniumPlate });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.blockWalkwayWire, 5), new Object[] { "XXX", "YXY", "YYY", 'X', titaniumPlate, 'Y', new ItemStack(GCBlocks.aluminumWire, 1, 1) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.blockWalkwayOxygenPipe, 5), new Object[] { "XXX", "YXY", "YYY", 'X', titaniumPlate, 'Y', new ItemStack(GCBlocks.oxygenPipe) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(AsteroidBlocks.blockWalkwayWire, 1), new Object[] { new ItemStack(AsteroidBlocks.blockWalkway, 1), new ItemStack(GCBlocks.aluminumWire, 1, 1) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(AsteroidBlocks.blockWalkwayOxygenPipe, 1), new Object[] { new ItemStack(AsteroidBlocks.blockWalkway, 1), new ItemStack(GCBlocks.oxygenPipe, 1) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.shortRangeTelepad), new Object[] { "XWX", "ZYZ", "XXX", 'W', new ItemStack(AsteroidsItems.basicItem, 1, 8), 'X', titaniumPlate, 'Y', Items.redstone, 'Z', Items.ender_pearl });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 8), new Object[] { "XYX", "YZY", "XYX", 'X', Items.redstone, 'Y', "compressedIron", 'Z', Blocks.glass_pane });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.beamReceiver), new Object[] { " X ", "XYX", " X ", 'X', titaniumPlate, 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 8) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.beamReflector), new Object[] { " Y ", "ZX ", "XXX", 'X', titaniumPlate, 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 8), 'Z', Blocks.lever });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.beamReflector), new Object[] { " Y ", " XZ", "XXX", 'X', titaniumPlate, 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 8), 'Z', Blocks.lever });
        RecipeUtil.addRecipe(new ItemStack(AsteroidBlocks.blockMinerBase, 4, 0), new Object[] { "XCX", "W W", "XBX", 'X', "compressedDesh", 'W', new ItemStack(AsteroidsItems.basicItem, 1, 8), 'C', new ItemStack((Block)Blocks.chest), 'B', new ItemStack(GCBlocks.machineTiered, 1, 0) });
        RecipeUtil.addRecipe(new ItemStack(AsteroidsItems.orionDrive, 1, 0), new Object[] { "ABC", "DOE", "FGH", 'A', "oreDiamond", 'B', "oreLapis", 'C', "oreGold", 'D', "oreRedstone", 'E', "oreCoal", 'F', "oreCheese", 'G', "oreDesh", 'H', "oreIlmenite", 'O', new ItemStack(AsteroidsItems.basicItem, 1, 8) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new Object[] { new ItemStack(AsteroidBlocks.blockBasic, 1, 0), new ItemStack(AsteroidBlocks.blockBasic, 1, 1) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new Object[] { new ItemStack(AsteroidBlocks.blockBasic, 1, 0), new ItemStack(AsteroidBlocks.blockBasic, 1, 2) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new Object[] { new ItemStack(AsteroidBlocks.blockBasic, 1, 1), new ItemStack(AsteroidBlocks.blockBasic, 1, 2) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 2), new Object[] { new ItemStack(Items.dye, 1, 11), new ItemStack(Items.dye, 1, 4) });
        CompressorRecipes.addRecipeAdventure(new ItemStack(Blocks.gravel, 9, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.cobblestone, 1) });
        CompressorRecipes.addRecipeAdventure(new ItemStack(VersionUtil.sand, 9, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.gravel, 1) });
        CompressorRecipes.addRecipeAdventure(new ItemStack(Blocks.clay, 8, 0), new Object[] { "XXX", "XBX", "XXX", 'X', new ItemStack(VersionUtil.sand), 'B', new ItemStack(Items.water_bucket) });
        CompressorRecipes.addRecipeAdventure(new ItemStack(Blocks.soul_sand, 4, 0), new Object[] { "XFX", "FEF", "XFX", 'X', new ItemStack(VersionUtil.sand), 'F', new ItemStack(Items.rotten_flesh), 'E', new ItemStack(Items.fermented_spider_eye) });
        CompressorRecipes.addRecipeAdventure(new ItemStack(Blocks.obsidian, 1, 0), new Object[] { "XXX", "XBX", "XXX", 'X', new ItemStack(Blocks.stone), 'B', new ItemStack(Items.blaze_powder) });
        CompressorRecipes.addShapelessAdventure(new ItemStack(Items.coal, 2, 0), new Object[] { new ItemStack(Items.coal, 1, 1), new ItemStack(AsteroidBlocks.blockBasic, 1, 0), new ItemStack(Items.coal, 1, 1) });
        CompressorRecipes.addShapelessAdventure(new ItemStack(Items.coal, 2, 0), new Object[] { new ItemStack(Items.coal, 1, 1), new ItemStack(AsteroidBlocks.blockBasic, 1, 1), new ItemStack(Items.coal, 1, 1) });
        CompressorRecipes.addShapelessAdventure(new ItemStack(Items.coal, 2, 0), new Object[] { new ItemStack(Items.coal, 1, 1), new ItemStack(AsteroidBlocks.blockBasic, 1, 2), new ItemStack(Items.coal, 1, 1) });
        CompressorRecipes.addShapelessRecipe(new ItemStack(Blocks.ice), new Object[] { new ItemStack(AsteroidBlocks.blockDenseIce), new ItemStack(AsteroidBlocks.blockDenseIce) });
        RecipeUtil.addRecipe(new ItemStack(Items.slime_ball), new Object[] { "XFX", "FEF", "XFX", 'X', new ItemStack(Items.dye, 1, 2), 'E', new ItemStack(GCItems.cheeseCurd), 'F', new ItemStack(Items.sugar) });
        if (ConfigManagerCore.recipesRequireGCAdvancedMetals) {
            CompressorRecipes.addShapelessRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), new Object[] { titaniumIngot, titaniumIngot });
        }
        else if (OreDictionary.getOres("ingotTitanium").size() > 0) {
            for (final ItemStack stack : OreDictionary.getOres("ingotTitanium")) {
                CompressorRecipes.addShapelessRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), new Object[] { stack, stack });
            }
        }
        CompressorRecipes.addShapelessRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 0), new Object[] { new ItemStack(MarsItems.marsItemBasic, 1, 3), new ItemStack(MarsItems.marsItemBasic, 1, 5) });
        final List<ItemStack> list1 = new ArrayList<ItemStack>();
        final List<ItemStack> list2 = new ArrayList<ItemStack>();
        final List<ItemStack> list3 = new ArrayList<ItemStack>();
        list1.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 751));
        list2.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 834));
        list3.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 918));
        list1.add(new ItemStack(GCItems.oxTankHeavy, 1, 2700));
        list2.add(new ItemStack(GCItems.oxTankMedium, 1, 1800));
        list3.add(new ItemStack(GCItems.oxTankLight, 1, 900));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankHeavy, 1, 0), (List)list1));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankMedium, 1, 0), (List)list2));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankLight, 1, 0), (List)list3));
    }
}
