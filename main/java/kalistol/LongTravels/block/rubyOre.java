package kalistol.LongTravels.block;

import java.util.Random;

import kalistol.LongTravels.LongTravels;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class rubyOre extends Block {

	public rubyOre(Block rubyOre, Material mat) {
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_.registerIcon("lt:oreRuby");
	}

	public Item getItemDropped(int par1, Random random, int par2) {
		return LongTravels.ruby;
	}
}
