package kalistol.LongTravels.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmeraldArmor extends ItemArmor {

	public ItemEmeraldArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "lt:textures/models/armor/emerald_layer_2.png";
		}
		return "lt:textures/models/armor/emerald_layer_1.png";
	}
}
