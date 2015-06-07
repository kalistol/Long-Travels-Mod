package kalistol.LongTravels;

import kalistol.LongTravels.item.ItemBackpack;
import kalistol.LongTravels.item.ItemDiamondpAxe;
import kalistol.LongTravels.item.ItemDiamondpPickaxe;
import kalistol.LongTravels.item.ItemDiamondpSpade;
import kalistol.LongTravels.item.ItemDiamondpSword;
import kalistol.LongTravels.item.ItemEmeraldArmor;
import kalistol.LongTravels.item.ItemEmeraldAxe;
import kalistol.LongTravels.item.ItemEmeraldHoe;
import kalistol.LongTravels.item.ItemEmeraldPickaxe;
import kalistol.LongTravels.item.ItemEmeraldSpade;
import kalistol.LongTravels.item.ItemEmeraldSword;
import kalistol.LongTravels.item.ItemEmeraldpAxe;
import kalistol.LongTravels.item.ItemEmeraldpPickaxe;
import kalistol.LongTravels.item.ItemEmeraldpSpade;
import kalistol.LongTravels.item.ItemEmeraldpSword;
import kalistol.LongTravels.item.ItemGoldpAxe;
import kalistol.LongTravels.item.ItemGoldpPickaxe;
import kalistol.LongTravels.item.ItemGoldpSpade;
import kalistol.LongTravels.item.ItemGoldpSword;
import kalistol.LongTravels.item.ItemIronpAxe;
import kalistol.LongTravels.item.ItemIronpPickaxe;
import kalistol.LongTravels.item.ItemIronpSpade;
import kalistol.LongTravels.item.ItemIronpSword;
import kalistol.LongTravels.item.ItemObbyAxe;
import kalistol.LongTravels.item.ItemObbyHoe;
import kalistol.LongTravels.item.ItemObbyPickaxe;
import kalistol.LongTravels.item.ItemObbySpade;
import kalistol.LongTravels.item.ItemObbySword;
import kalistol.LongTravels.item.ItemObbypAxe;
import kalistol.LongTravels.item.ItemObbypPickaxe;
import kalistol.LongTravels.item.ItemObbypSpade;
import kalistol.LongTravels.item.ItemObbypSword;
import kalistol.LongTravels.item.ItemRuby;
import kalistol.LongTravels.item.ItemRubyArmor;
import kalistol.LongTravels.item.ItemRubyAxe;
import kalistol.LongTravels.item.ItemRubyHoe;
import kalistol.LongTravels.item.ItemRubyPickaxe;
import kalistol.LongTravels.item.ItemRubySpade;
import kalistol.LongTravels.item.ItemRubySword;
import kalistol.LongTravels.item.ItemRubypAxe;
import kalistol.LongTravels.item.ItemRubypPickaxe;
import kalistol.LongTravels.item.ItemRubypSpade;
import kalistol.LongTravels.item.ItemRubypSword;
import kalistol.LongTravels.item.ItemStonepAxe;
import kalistol.LongTravels.item.ItemStonepPickaxe;
import kalistol.LongTravels.item.ItemStonepSpade;
import kalistol.LongTravels.item.ItemStonepSword;
import kalistol.LongTravels.item.ItemWoodpAxe;
import kalistol.LongTravels.item.ItemWoodpPickaxe;
import kalistol.LongTravels.item.ItemWoodpSpade;
import kalistol.LongTravels.item.ItemWoodpSword;
import kalistol.LongTravels.worldGen.rubyOreGen;
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
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "lt", name = "Long Travels", version = "1.2.3.4")
public class LongTravels {
	// item classes

	@ForgeSubscribe
	public void what() {
		System.out.println("Downloading viruses...");
	}
	//unused for now
	
	public static Item ruby;

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
	public static Item backpack;

	public static Block rubyOre;
	public static Block rubyBlock;
	public static Block castingTable;

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

	// name, uses, protection level, enchantability
	public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper
			.addArmorMaterial("emeraldArmorMaterial", 50, new int[] { 4, 8, 6,
					4 }, 18);
	public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper
			.addArmorMaterial("rubyArmorMaterial", 70,
					new int[] { 4, 9, 7, 4 }, 24);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block init and registering
		// Config handling

		GameRegistry.registerWorldGenerator(new rubyOreGen(), 1);

		ruby = new ItemRuby().setTextureName("lt:ruby");

		woodpPickaxe = new ItemWoodpPickaxe(woodpToolMaterial)
				.setUnlocalizedName("ItemWoodpPickaxe")
				.setTextureName("lt:wpick").setCreativeTab(tabLongTravels);
		woodpSpade = new ItemWoodpSpade(woodpToolMaterial)
				.setUnlocalizedName("ItemWoodpSpade").setTextureName("lt:wtro")
				.setCreativeTab(tabLongTravels);
		woodpAxe = new ItemWoodpAxe(woodpToolMaterial)
				.setUnlocalizedName("ItemWoodpAxe").setTextureName("lt:what")
				.setCreativeTab(tabLongTravels);
		woodpSword = new ItemWoodpSword(woodpToolMaterial)
				.setUnlocalizedName("ItemWoodpSword").setTextureName("lt:wdag")
				.setCreativeTab(tabLongTravels);
		stonepPickaxe = new ItemStonepPickaxe(stonepToolMaterial)
				.setUnlocalizedName("ItemStonepPickaxe")
				.setTextureName("lt:spick").setCreativeTab(tabLongTravels);
		stonepSpade = new ItemStonepSpade(stonepToolMaterial)
				.setUnlocalizedName("ItemStonepSpade")
				.setTextureName("lt:stro").setCreativeTab(tabLongTravels);
		stonepAxe = new ItemStonepAxe(stonepToolMaterial)
				.setUnlocalizedName("ItemStonepAxe").setTextureName("lt:shat")
				.setCreativeTab(tabLongTravels);
		stonepSword = new ItemStonepSword(stonepToolMaterial)
				.setUnlocalizedName("ItemStonepSword")
				.setTextureName("lt:sdag").setCreativeTab(tabLongTravels);
		ironpPickaxe = new ItemIronpPickaxe(ironpToolMaterial)
				.setUnlocalizedName("ItemIronpPickaxe")
				.setTextureName("lt:ipick").setCreativeTab(tabLongTravels);
		ironpSpade = new ItemIronpSpade(ironpToolMaterial)
				.setUnlocalizedName("ItemIronpSpade").setTextureName("lt:itro")
				.setCreativeTab(tabLongTravels);
		ironpAxe = new ItemIronpAxe(ironpToolMaterial)
				.setUnlocalizedName("ItemIronpAxe").setTextureName("lt:ihat")
				.setCreativeTab(tabLongTravels);
		ironpSword = new ItemIronpSword(ironpToolMaterial)
				.setUnlocalizedName("ItemIronpSword").setTextureName("lt:idag")
				.setCreativeTab(tabLongTravels);
		diamondpPickaxe = new ItemDiamondpPickaxe(diamondpToolMaterial)
				.setUnlocalizedName("ItemDiamondpPickaxe")
				.setTextureName("lt:dpick").setCreativeTab(tabLongTravels);
		diamondpSpade = new ItemDiamondpSpade(diamondpToolMaterial)
				.setUnlocalizedName("ItemDiamondpSpade")
				.setTextureName("lt:dtro").setCreativeTab(tabLongTravels);
		diamondpAxe = new ItemDiamondpAxe(diamondpToolMaterial)
				.setUnlocalizedName("ItemDiamondpAxe")
				.setTextureName("lt:dhat").setCreativeTab(tabLongTravels);
		diamondpSword = new ItemDiamondpSword(diamondpToolMaterial)
				.setUnlocalizedName("ItemDiamondpSword")
				.setTextureName("lt:ddag").setCreativeTab(tabLongTravels);
		goldpPickaxe = new ItemGoldpPickaxe(goldpToolMaterial)
				.setUnlocalizedName("ItemGoldpPickaxe")
				.setTextureName("lt:gpick1").setCreativeTab(tabLongTravels);
		goldpSpade = new ItemGoldpSpade(goldpToolMaterial)
				.setUnlocalizedName("ItemGoldpSpade").setTextureName("lt:gtro")
				.setCreativeTab(tabLongTravels);
		goldpAxe = new ItemGoldpAxe(goldpToolMaterial)
				.setUnlocalizedName("ItemGoldpAxe").setTextureName("lt:ghat")
				.setCreativeTab(tabLongTravels);
		goldpSword = new ItemGoldpSword(goldpToolMaterial)
				.setUnlocalizedName("ItemGoldpSword").setTextureName("lt:gdag")
				.setCreativeTab(tabLongTravels);
		obbypPickaxe = new ItemObbypPickaxe(obbypToolMaterial)
				.setUnlocalizedName("ItemObbypPickaxe")
				.setTextureName("lt:opick").setCreativeTab(tabLongTravels);
		obbypSpade = new ItemObbypSpade(obbypToolMaterial)
				.setUnlocalizedName("ItemObbypSpade").setTextureName("lt:otro")
				.setCreativeTab(tabLongTravels);
		obbypAxe = new ItemObbypAxe(obbypToolMaterial)
				.setUnlocalizedName("ItemObbypAxe").setTextureName("lt:ohat")
				.setCreativeTab(tabLongTravels);
		obbypSword = new ItemObbypSword(obbypToolMaterial)
				.setUnlocalizedName("ItemObbypSword").setTextureName("lt:odag")
				.setCreativeTab(tabLongTravels);
		obbySword = new ItemObbySword(obbyToolMaterial)
				.setUnlocalizedName("ItemObbySword")
				.setTextureName("lt:osword").setCreativeTab(tabLongTravels);
		obbyPickaxe = new ItemObbyPickaxe(emeraldToolMaterial)
				.setUnlocalizedName("ItemObbyPickaxe")
				.setTextureName("lt:opick33").setCreativeTab(tabLongTravels);
		obbySpade = new ItemObbySpade(obbyToolMaterial)
				.setUnlocalizedName("ItemObbySpade").setTextureName("lt:oshov")
				.setCreativeTab(tabLongTravels);
		obbyAxe = new ItemObbyAxe(obbyToolMaterial)
				.setUnlocalizedName("ItemObbyAxe").setTextureName("lt:oaxe")
				.setCreativeTab(tabLongTravels);
		obbyHoe = new ItemObbyHoe(obbyToolMaterial)
				.setUnlocalizedName("ItemObbyHoe").setTextureName("lt:ohoe")
				.setCreativeTab(tabLongTravels);
		emeraldpPickaxe = new ItemEmeraldpPickaxe(emeraldpToolMaterial)
				.setUnlocalizedName("ItemEmeraldpPickaxe")
				.setTextureName("lt:epick").setCreativeTab(tabLongTravels);
		emeraldpSpade = new ItemEmeraldpSpade(emeraldpToolMaterial)
				.setUnlocalizedName("ItemEmeraldpSpade")
				.setTextureName("lt:etro").setCreativeTab(tabLongTravels);
		emeraldpAxe = new ItemEmeraldpAxe(emeraldpToolMaterial)
				.setUnlocalizedName("ItemEmeraldpAxe")
				.setTextureName("lt:ehat").setCreativeTab(tabLongTravels);
		emeraldpSword = new ItemEmeraldpSword(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldpSword")
				.setTextureName("lt:edag").setCreativeTab(tabLongTravels);
		emeraldSword = new ItemEmeraldSword(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldSword")
				.setTextureName("lt:esword").setCreativeTab(tabLongTravels);
		emeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldPickaxe")
				.setTextureName("lt:epick33").setCreativeTab(tabLongTravels);
		emeraldSpade = new ItemEmeraldSpade(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldSpade")
				.setTextureName("lt:eshov").setCreativeTab(tabLongTravels);
		emeraldAxe = new ItemEmeraldAxe(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldAxe").setTextureName("lt:eaxe")
				.setCreativeTab(tabLongTravels);
		emeraldHoe = new ItemEmeraldHoe(emeraldToolMaterial)
				.setUnlocalizedName("ItemEmeraldHoe").setTextureName("lt:ehoe")
				.setCreativeTab(tabLongTravels);
		rubypPickaxe = new ItemRubypPickaxe(rubypToolMaterial)
				.setUnlocalizedName("ItemRubypPickaxe")
				.setTextureName("lt:rpick").setCreativeTab(tabLongTravels);
		rubypSpade = new ItemRubypSpade(rubypToolMaterial)
				.setUnlocalizedName("ItemRubypSpade").setTextureName("lt:rtro")
				.setCreativeTab(tabLongTravels);
		rubypAxe = new ItemRubypAxe(rubypToolMaterial)
				.setUnlocalizedName("ItemRubypAxe").setTextureName("lt:rhat")
				.setCreativeTab(tabLongTravels);
		rubypSword = new ItemRubypSword(rubypToolMaterial)
				.setUnlocalizedName("ItemRubypSword").setTextureName("lt:rdag")
				.setCreativeTab(tabLongTravels);
		rubySword = new ItemRubySword(rubyToolMaterial)
				.setUnlocalizedName("ItemRubySword")
				.setTextureName("lt:rsword").setCreativeTab(tabLongTravels);
		rubyPickaxe = new ItemRubyPickaxe(rubyToolMaterial)
				.setUnlocalizedName("ItemRubyPickaxe")
				.setTextureName("lt:rpick33").setCreativeTab(tabLongTravels);
		rubySpade = new ItemRubySpade(rubyToolMaterial)
				.setUnlocalizedName("ItemRubySpade").setTextureName("lt:rshov")
				.setCreativeTab(tabLongTravels);
		rubyAxe = new ItemRubyAxe(rubyToolMaterial)
				.setUnlocalizedName("ItemRubyAxe").setTextureName("lt:raxe")
				.setCreativeTab(tabLongTravels);
		rubyHoe = new ItemRubyHoe(rubyToolMaterial)
				.setUnlocalizedName("ItemRubyHoe").setTextureName("lt:rhoe")
				.setCreativeTab(tabLongTravels);

		emeraldHelmet = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemEmeraldHelmet")
				.setTextureName("lt:ehelm").setCreativeTab(tabLongTravels);
		emeraldChestplate = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemEmeraldChestplate")
				.setTextureName("lt:echst").setCreativeTab(tabLongTravels);
		emeraldLeggings = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemEmeraldLeggings")
				.setTextureName("lt:elegs").setCreativeTab(tabLongTravels);
		emeraldBoots = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemEmeraldBoots")
				.setTextureName("lt:eboot").setCreativeTab(tabLongTravels);
		rubyHelmet = new ItemRubyArmor(rubyArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemRubyHelmet")
				.setTextureName("lt:rhelm").setCreativeTab(tabLongTravels);
		rubyChestplate = new ItemRubyArmor(rubyArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemRubyChestplate")
				.setTextureName("lt:rchst").setCreativeTab(tabLongTravels);
		rubyLeggings = new ItemRubyArmor(rubyArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemRubyLeggings")
				.setTextureName("lt:rlegs").setCreativeTab(tabLongTravels);
		rubyBoots = new ItemRubyArmor(rubyArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemRubyBoots").setTextureName("lt:rboot")
				.setCreativeTab(tabLongTravels);
		backpack = new ItemBackpack().setUnlocalizedName("Backpack")
				.setTextureName("lt:backpack").setCreativeTab(tabLongTravels);

		rubyOre = new kalistol.LongTravels.block.rubyOre(rubyOre, Material.rock)
				.setHardness(3.5F).setBlockName("rubyOre");
		rubyBlock = new kalistol.LongTravels.block.rubyBlock(rubyBlock,
				Material.rock).setHardness(5.5F).setBlockName("rubyBlock");

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
		GameRegistry.registerItem(backpack, backpack.getUnlocalizedName()
				.substring(5));

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Proxy, Tileentity, entity, GUI, and packet registering

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
		GameRegistry.addRecipe(new ItemStack(rubyLeggings), new Object[] {
				"WWW", "W W", "W W", 'W', ruby });
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

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	private static void registerOreDictionary() {

		OreDictionary.registerOre("oreRuby", rubyOre);

        OreDictionary.registerOre("gemRuby", ruby);
	}

	public static CreativeTabs tabLongTravels = new CreativeTabs(
			"tabLongTravels") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return woodpPickaxe;
		}
	};
}