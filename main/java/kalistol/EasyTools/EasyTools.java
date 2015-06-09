//package name declaration
package kalistol.EasyTools;

//resources for the rest of the class
import kalistol.EasyTools.item.ItemDiamondpAxe;
import kalistol.EasyTools.item.ItemDiamondpPickaxe;
import kalistol.EasyTools.item.ItemDiamondpSpade;
import kalistol.EasyTools.item.ItemDiamondpSword;
import kalistol.EasyTools.item.ItemEmeraldArmor;
import kalistol.EasyTools.item.ItemEmeraldAxe;
import kalistol.EasyTools.item.ItemEmeraldHoe;
import kalistol.EasyTools.item.ItemEmeraldPickaxe;
import kalistol.EasyTools.item.ItemEmeraldSpade;
import kalistol.EasyTools.item.ItemEmeraldSword;
import kalistol.EasyTools.item.ItemEmeraldpAxe;
import kalistol.EasyTools.item.ItemEmeraldpPickaxe;
import kalistol.EasyTools.item.ItemEmeraldpSpade;
import kalistol.EasyTools.item.ItemEmeraldpSword;
import kalistol.EasyTools.item.ItemGoldpAxe;
import kalistol.EasyTools.item.ItemGoldpPickaxe;
import kalistol.EasyTools.item.ItemGoldpSpade;
import kalistol.EasyTools.item.ItemGoldpSword;
import kalistol.EasyTools.item.ItemIronpAxe;
import kalistol.EasyTools.item.ItemIronpPickaxe;
import kalistol.EasyTools.item.ItemIronpSpade;
import kalistol.EasyTools.item.ItemIronpSword;
import kalistol.EasyTools.item.ItemObbyAxe;
import kalistol.EasyTools.item.ItemObbyHoe;
import kalistol.EasyTools.item.ItemObbyPickaxe;
import kalistol.EasyTools.item.ItemObbySpade;
import kalistol.EasyTools.item.ItemObbySword;
import kalistol.EasyTools.item.ItemObbypAxe;
import kalistol.EasyTools.item.ItemObbypPickaxe;
import kalistol.EasyTools.item.ItemObbypSpade;
import kalistol.EasyTools.item.ItemObbypSword;
import kalistol.EasyTools.item.ItemRuby;
import kalistol.EasyTools.item.ItemRubyArmor;
import kalistol.EasyTools.item.ItemRubyAxe;
import kalistol.EasyTools.item.ItemRubyHoe;
import kalistol.EasyTools.item.ItemRubyPickaxe;
import kalistol.EasyTools.item.ItemRubySpade;
import kalistol.EasyTools.item.ItemRubySword;
import kalistol.EasyTools.item.ItemRubypAxe;
import kalistol.EasyTools.item.ItemRubypPickaxe;
import kalistol.EasyTools.item.ItemRubypSpade;
import kalistol.EasyTools.item.ItemRubypSword;
import kalistol.EasyTools.item.ItemStonepAxe;
import kalistol.EasyTools.item.ItemStonepPickaxe;
import kalistol.EasyTools.item.ItemStonepSpade;
import kalistol.EasyTools.item.ItemStonepSword;
import kalistol.EasyTools.item.ItemWoodpAxe;
import kalistol.EasyTools.item.ItemWoodpPickaxe;
import kalistol.EasyTools.item.ItemWoodpSpade;
import kalistol.EasyTools.item.ItemWoodpSword;
import kalistol.EasyTools.worldGen.rubyOreGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "et", name = "Long Travels", version = "1.1")
public class EasyTools {
	// new features declared here
	public static Item woodpPickaxe;
	public static Item woodpSpade;
	public static Item woodpAxe;
	public static Item woodpSword;
	public static Item stonepPickaxe;
	public static Item stonepSpade;
	public static Item stonepAxe;
	public static Item stonepSword;
	public static Item ironpPickaxe;
	public static Item ironpSpade;
	public static Item ironpAxe;
	public static Item ironpSword;
	public static Item diamondpPickaxe;
	public static Item diamondpSpade;
	public static Item diamondpAxe;
	public static Item diamondpSword;
	public static Item goldpPickaxe;
	public static Item goldpSpade;
	public static Item goldpAxe;
	public static Item goldpSword;
	public static Item obbypPickaxe;
	public static Item obbypSpade;
	public static Item obbypAxe;
	public static Item obbypSword;
	public static Item emeraldpPickaxe;
	public static Item emeraldpSpade;
	public static Item emeraldpAxe;
	public static Item emeraldpSword;
	public static Item obbyPickaxe;
	public static Item obbySpade;
	public static Item obbyAxe;
	public static Item obbySword;
	public static Item obbyHoe;
	public static Item emeraldPickaxe;
	public static Item emeraldSpade;
	public static Item emeraldAxe;
	public static Item emeraldSword;
	public static Item emeraldHoe;
	public static Item rubypPickaxe;
	public static Item rubypSpade;
	public static Item rubypAxe;
	public static Item rubypSword;
	public static Item rubyPickaxe;
	public static Item rubySpade;
	public static Item rubyAxe;
	public static Item rubySword;
	public static Item rubyHoe;

	public static Item emeraldHelmet;
	public static Item emeraldChestplate;
	public static Item emeraldLeggings;
	public static Item emeraldBoots;
	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;

	public static Item ruby;
	public static Block rubyOre;
	public static Block rubyBlock;
	public static Block castingTable;

	// new tool materials ("p" after tool material is for hand tools)
	// materials //type, harvest level, uses, efficiency (floater), attack
	// (floater), enchantability
	public static final Item.ToolMaterial woodpToolMaterial = EnumHelper
			.addToolMaterial("woodpToolMaterial", 0, 30, 2.0F, -1.0F, 15);
	public static final Item.ToolMaterial stonepToolMaterial = EnumHelper
			.addToolMaterial("stonepToolMaterial", 1, 66, 4.0F, 0.0F, 5);
	public static final Item.ToolMaterial ironpToolMaterial = EnumHelper
			.addToolMaterial("ironpToolMaterial", 2, 125, 6.0F, 1.0F, 14);
	public static final Item.ToolMaterial diamondpToolMaterial = EnumHelper
			.addToolMaterial("diamondpToolMaterial", 3, 781, 8.0F, 2.0F, 10);
	public static final Item.ToolMaterial goldpToolMaterial = EnumHelper
			.addToolMaterial("goldpToolMaterial", 0, 16, 10.0F, -1.0F, 22);
	public static final Item.ToolMaterial obbypToolMaterial = EnumHelper
			.addToolMaterial("obbypToolMaterial", 3, 125, 6.0F, 2.0F, 5);
	public static final Item.ToolMaterial obbyToolMaterial = EnumHelper
			.addToolMaterial("obbypToolMaterial", 3, 250, 6.0F, 3.0F, 5);
	public static final Item.ToolMaterial emeraldpToolMaterial = EnumHelper
			.addToolMaterial("emeraldpToolMaterial", 3, 1500, 12.0F, 4.0F, 18);
	public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper
			.addToolMaterial("emeraldToolMaterial", 3, 3000, 12.0F, 5.0F, 18);
	public static final Item.ToolMaterial rubypToolMaterial = EnumHelper
			.addToolMaterial("rubypToolMaterial", 3, 3250, 14.0F, 6.0F, 24);
	public static final Item.ToolMaterial rubyToolMaterial = EnumHelper
			.addToolMaterial("rubyToolMaterial", 3, 6500, 14.0F, 7.0F, 24);

	// new armor tiers
	// name, durability, protection level (times 4%), enchantability
	public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper
			.addArmorMaterial("emeraldArmorMaterial", 50, new int[] { 4, 8, 6,
					4 }, 18);
	public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper
			.addArmorMaterial("rubyArmorMaterial", 70,
					new int[] { 4, 9, 7, 4 }, 24);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// New Feature init and registering
		// Config handling
		// Anything not configured here is in it's separate class

		GameRegistry.registerWorldGenerator(new rubyOreGen(), 1);

		// new tools
		woodpPickaxe = new ItemWoodpPickaxe(woodpToolMaterial)
				.setCreativeTab(tabETTools);
		woodpSpade = new ItemWoodpSpade(woodpToolMaterial)
				.setCreativeTab(tabETTools);
		woodpAxe = new ItemWoodpAxe(woodpToolMaterial)
				.setCreativeTab(tabETTools);
		woodpSword = new ItemWoodpSword(woodpToolMaterial)
				.setCreativeTab(tabETTools);
		stonepPickaxe = new ItemStonepPickaxe(stonepToolMaterial)
				.setCreativeTab(tabETTools);
		stonepSpade = new ItemStonepSpade(stonepToolMaterial)
				.setCreativeTab(tabETTools);
		stonepAxe = new ItemStonepAxe(stonepToolMaterial)
				.setCreativeTab(tabETTools);
		stonepSword = new ItemStonepSword(stonepToolMaterial)
				.setCreativeTab(tabETTools);
		ironpPickaxe = new ItemIronpPickaxe(ironpToolMaterial)
				.setCreativeTab(tabETTools);
		ironpSpade = new ItemIronpSpade(ironpToolMaterial)
				.setCreativeTab(tabETTools);
		ironpAxe = new ItemIronpAxe(ironpToolMaterial)
				.setCreativeTab(tabETTools);
		ironpSword = new ItemIronpSword(ironpToolMaterial)
				.setCreativeTab(tabETTools);
		diamondpPickaxe = new ItemDiamondpPickaxe(diamondpToolMaterial)
				.setCreativeTab(tabETTools);
		diamondpSpade = new ItemDiamondpSpade(diamondpToolMaterial)
				.setCreativeTab(tabETTools);
		diamondpAxe = new ItemDiamondpAxe(diamondpToolMaterial)
				.setCreativeTab(tabETTools);
		diamondpSword = new ItemDiamondpSword(diamondpToolMaterial)
				.setCreativeTab(tabETTools);
		goldpPickaxe = new ItemGoldpPickaxe(goldpToolMaterial)
				.setCreativeTab(tabETTools);
		goldpSpade = new ItemGoldpSpade(goldpToolMaterial)
				.setCreativeTab(tabETTools);
		goldpAxe = new ItemGoldpAxe(goldpToolMaterial)
				.setCreativeTab(tabETTools);
		goldpSword = new ItemGoldpSword(goldpToolMaterial)
				.setCreativeTab(tabETTools);
		obbypPickaxe = new ItemObbypPickaxe(obbypToolMaterial)
				.setCreativeTab(tabETTools);
		obbypSpade = new ItemObbypSpade(obbypToolMaterial)
				.setCreativeTab(tabETTools);
		obbypAxe = new ItemObbypAxe(obbypToolMaterial)
				.setCreativeTab(tabETTools);
		obbypSword = new ItemObbypSword(obbypToolMaterial)
				.setCreativeTab(tabETTools);
		obbySword = new ItemObbySword(obbyToolMaterial)
				.setCreativeTab(tabETTools);
		obbyPickaxe = new ItemObbyPickaxe(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		obbySpade = new ItemObbySpade(obbyToolMaterial)
				.setCreativeTab(tabETTools);
		obbyAxe = new ItemObbyAxe(obbyToolMaterial).setCreativeTab(tabETTools);
		obbyHoe = new ItemObbyHoe(obbyToolMaterial).setCreativeTab(tabETTools);
		emeraldpPickaxe = new ItemEmeraldpPickaxe(emeraldpToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldpSpade = new ItemEmeraldpSpade(emeraldpToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldpAxe = new ItemEmeraldpAxe(emeraldpToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldpSword = new ItemEmeraldpSword(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldSword = new ItemEmeraldSword(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldSpade = new ItemEmeraldSpade(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldAxe = new ItemEmeraldAxe(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		emeraldHoe = new ItemEmeraldHoe(emeraldToolMaterial)
				.setCreativeTab(tabETTools);
		rubypPickaxe = new ItemRubypPickaxe(rubypToolMaterial)
				.setCreativeTab(tabETTools);
		rubypSpade = new ItemRubypSpade(rubypToolMaterial)
				.setCreativeTab(tabETTools);
		rubypAxe = new ItemRubypAxe(rubypToolMaterial)
				.setCreativeTab(tabETTools);
		rubypSword = new ItemRubypSword(rubypToolMaterial)
				.setCreativeTab(tabETTools);
		rubySword = new ItemRubySword(rubyToolMaterial)
				.setCreativeTab(tabETTools);
		rubyPickaxe = new ItemRubyPickaxe(rubyToolMaterial)
				.setCreativeTab(tabETTools);
		rubySpade = new ItemRubySpade(rubyToolMaterial)
				.setCreativeTab(tabETTools);
		rubyAxe = new ItemRubyAxe(rubyToolMaterial).setCreativeTab(tabETTools);
		rubyHoe = new ItemRubyHoe(rubyToolMaterial).setCreativeTab(tabETTools);

		// new armor
		emeraldHelmet = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemEmeraldHelmet")
				.setTextureName("et:ehelm").setCreativeTab(tabETArmor);
		emeraldChestplate = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemEmeraldChestplate")
				.setTextureName("et:echst").setCreativeTab(tabETArmor);
		emeraldLeggings = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemEmeraldLeggings")
				.setTextureName("et:elegs").setCreativeTab(tabETArmor);
		emeraldBoots = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemEmeraldBoots")
				.setTextureName("et:eboot").setCreativeTab(tabETArmor);
		rubyHelmet = new ItemRubyArmor(rubyArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemRubyHelmet")
				.setTextureName("et:rhelm").setCreativeTab(tabETArmor);
		rubyChestplate = new ItemRubyArmor(rubyArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemRubyChestplate")
				.setTextureName("et:rchst").setCreativeTab(tabETArmor);
		rubyLeggings = new ItemRubyArmor(rubyArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemRubyLeggings")
				.setTextureName("et:rlegs").setCreativeTab(tabETArmor);
		rubyBoots = new ItemRubyArmor(rubyArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemRubyBoots").setTextureName("et:rboot")
				.setCreativeTab(tabETArmor);

		// James's ruby shizzles
		ruby = new ItemRuby().setCreativeTab(tabETMisc);
		rubyOre = new kalistol.EasyTools.block.rubyOre(rubyOre, Material.rock)
				.setCreativeTab(tabETMisc);
		rubyBlock = new kalistol.EasyTools.block.rubyBlock(rubyBlock,
				Material.rock).setCreativeTab(tabETMisc);

		// Item & block registry
		// Names declared here
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(rubyBlock, "rubyBlock");

		GameRegistry.registerItem(ruby, "ruby");

		GameRegistry.registerItem(woodpPickaxe, woodpPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodpSpade, woodpSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(woodpAxe, woodpAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(woodpSword, woodpSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(stonepPickaxe, stonepPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stonepSpade, stonepSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(stonepAxe, stonepAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(stonepSword, stonepSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(ironpPickaxe, ironpPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironpSpade, ironpSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(ironpAxe, ironpAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(ironpSword, ironpSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(diamondpPickaxe, diamondpPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamondpSpade, diamondpSpade
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamondpAxe, diamondpAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(diamondpSword, diamondpSword
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldpPickaxe, goldpPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldpSpade, goldpSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(goldpAxe, goldpAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(goldpSword, goldpSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbypPickaxe, obbypPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obbypSpade, obbypSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbypAxe, obbypAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbypSword, obbypSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbyPickaxe, obbyPickaxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbySpade, obbySpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbyAxe, obbyAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbySword, obbySword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(obbyHoe, obbyHoe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(emeraldpPickaxe, emeraldpPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldpSpade, emeraldpSpade
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldpAxe, emeraldpAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(emeraldpSword, emeraldpSword
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldSpade, emeraldSpade
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(emeraldSword, emeraldSword
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubypPickaxe, rubypPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubypSpade, rubypSpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubypAxe, rubypAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubypSword, rubypSword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubyPickaxe, rubyPickaxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubySpade, rubySpade.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubyAxe, rubyAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubySword, rubySword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubyHoe, rubyHoe.getUnlocalizedName()
				.substring(5));

		GameRegistry.registerItem(emeraldHelmet, emeraldHelmet
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldChestplate, emeraldChestplate
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldLeggings, emeraldLeggings
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldBoots, emeraldBoots
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyHelmet, rubyHelmet.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(rubyChestplate, rubyChestplate
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyLeggings, rubyLeggings
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyBoots, rubyBoots.getUnlocalizedName()
				.substring(5));

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Proxy, Tileentity, entity, GUI, and packet registering

		oreRegistration();
		addOreRecipes();

		// recipes
		// I still need to change the emerald and ruby stuff to oredict recipes
		GameRegistry.addRecipe(new ItemStack(woodpPickaxe), new Object[] {
				"WW", "SW", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(woodpSpade), new Object[] { "W",
				"S", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(woodpAxe), new Object[] { "WW",
				"S ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(woodpSword), new Object[] { " W",
				"S ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(stonepPickaxe), new Object[] {
				"WW", "SW", 'W', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(stonepSpade), new Object[] { "W",
				"S", 'W', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(stonepAxe), new Object[] { "WW",
				"S ", 'W', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(stonepSword), new Object[] { " W",
				"S ", 'W', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ironpPickaxe), new Object[] {
				"WW", "SW", 'W', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ironpSpade), new Object[] { "W",
				"S", 'W', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ironpAxe), new Object[] { "WW",
				"S ", 'W', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ironpSword), new Object[] { " W",
				"S ", 'W', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(diamondpPickaxe), new Object[] {
				"WW", "SW", 'W', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(diamondpSpade), new Object[] {
				"W", "S", 'W', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(diamondpAxe), new Object[] { "WW",
				"S ", 'W', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(diamondpSword), new Object[] {
				" W", "S ", 'W', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(goldpPickaxe), new Object[] {
				"WW", "SW", 'W', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(goldpSpade), new Object[] { "W",
				"S", 'W', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(goldpAxe), new Object[] { "WW",
				"S ", 'W', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(goldpSword), new Object[] { " W",
				"S ", 'W', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbypPickaxe), new Object[] {
				"WW", "SW", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbypSpade), new Object[] { "W",
				"S", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbypAxe), new Object[] { "WW",
				"S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbypSword), new Object[] { " W",
				"S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbyPickaxe), new Object[] {
				"WWW", " S ", " S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbySpade), new Object[] { " W ",
				" S ", " S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbyAxe), new Object[] { "WW ",
				"WS ", " S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbyHoe), new Object[] { "WW ",
				" S ", " S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obbySword), new Object[] { " W ",
				" W ", " S ", 'W', Blocks.obsidian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldpPickaxe), new Object[] {
				"WW", "SW", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldpSpade), new Object[] {
				"W", "S", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldpAxe), new Object[] { "WW",
				"S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldpSword), new Object[] {
				" W", "S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldPickaxe), new Object[] {
				"WWW", " S ", " S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldSpade), new Object[] {
				" W ", " S ", " S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldAxe), new Object[] { "WW ",
				"WS ", " S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldHoe), new Object[] { "WW ",
				" S ", " S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(emeraldSword), new Object[] {
				" W ", " W ", " S ", 'W', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubypPickaxe), new Object[] {
				"WW", "SW", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubypSpade), new Object[] { "W",
				"S", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubypAxe), new Object[] { "WW",
				"S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubypSword), new Object[] { " W",
				"S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubyPickaxe), new Object[] {
				"WWW", " S ", " S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubySpade), new Object[] { " W ",
				" S ", " S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubyAxe), new Object[] { "WW ",
				"WS ", " S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubyHoe), new Object[] { "WW ",
				" S ", " S ", 'W', ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rubySword), new Object[] { " W ",
				" W ", " S ", 'W', ruby, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(rubyHelmet), new Object[] { "WWW",
				"W W", "   ", 'W', ruby });
		GameRegistry.addRecipe(new ItemStack(rubyChestplate), new Object[] {
				"W W", "WWW", "WWW", 'W', ruby });
		GameRegistry.addRecipe(new ItemStack(rubyBoots), new Object[] { "W W",
				"W W", "   ", 'W', ruby });
		GameRegistry.addRecipe(new ItemStack(emeraldHelmet), new Object[] {
				"WWW", "W W", "   ", 'W', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(emeraldChestplate), new Object[] {
				"W W", "WWW", "WWW", 'W', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(emeraldLeggings), new Object[] {
				"WWW", "W W", "W W", 'W', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(emeraldBoots), new Object[] {
				"W W", "W W", "   ", 'W', Items.emerald });

		GameRegistry.addRecipe(new ItemStack(rubyBlock), new Object[] { "WWW",
				"WWW", "WWW", 'W', ruby });

		GameRegistry.addShapelessRecipe(new ItemStack(ruby, 9), new ItemStack(
				rubyBlock));
	}

	private void oreRegistration() {
		// TODO Auto-generated method stub

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	private static void registerOreDictionary() {

		// OreDictionary.registerOre("oreDictName", modID);
		OreDictionary.registerOre("blockRuby", new ItemStack(rubyBlock));
		OreDictionary.registerOre("oreRuby", new ItemStack(rubyOre));
		OreDictionary.registerOre("gemRuby", new ItemStack(ruby));
	}

	public static void addOreRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(rubyLeggings, true,
				new Object[] { "FFF", "F F", "F F", Character.valueOf('F'),
						"gemRuby" }));
	}

	public static CreativeTabs tabETTools = new CreativeTabs("tabETTools") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return woodpPickaxe;
		}
	};

	public static CreativeTabs tabETArmor = new CreativeTabs("tabETArmor") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return emeraldHelmet;
		}
	};

	public static CreativeTabs tabETMisc = new CreativeTabs("tabETMisc") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ruby;
		}
	};

}