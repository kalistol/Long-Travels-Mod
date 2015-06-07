package kalistol.LongTravels.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemRubyArmor extends ItemArmor {

	public ItemRubyArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (this.armorType == 2) {
			return "lt:textures/models/armor/ruby_layer_2.png";
		}
		return "lt:textures/models/armor/ruby_layer_1.png";
	}
}
