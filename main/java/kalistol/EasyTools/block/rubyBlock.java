package kalistol.EasyTools.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class rubyBlock extends Block {

	public rubyBlock(Block rubyBlock, Material mat) {
		super(mat);
		setHardness(5.5F);
		setBlockName("rubyBlock");

	}

	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_.registerIcon("lt:blockRuby");
	}
}