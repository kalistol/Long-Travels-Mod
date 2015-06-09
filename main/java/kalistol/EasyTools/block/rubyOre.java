package kalistol.EasyTools.block;

import java.util.Random;

import kalistol.EasyTools.EasyTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class rubyOre extends Block {

	public rubyOre(Block rubyOre, Material mat) {
		super(mat);
		setHardness(3.5F);
		setBlockName("rubyOre");
	}

	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_.registerIcon("lt:oreRuby");
	}

	public Item getItemDropped(int par1, Random random, int par2) {
		return EasyTools.ruby;
	}
}
