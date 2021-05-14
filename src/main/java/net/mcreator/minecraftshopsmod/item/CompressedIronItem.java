
package net.mcreator.minecraftshopsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.minecraftshopsmod.itemgroup.MinecraftShopsModTabItemGroup;
import net.mcreator.minecraftshopsmod.MinecraftShopsModModElements;

@MinecraftShopsModModElements.ModElement.Tag
public class CompressedIronItem extends MinecraftShopsModModElements.ModElement {
	@ObjectHolder("minecraft_shops_mod:compressed_iron")
	public static final Item block = null;
	public CompressedIronItem(MinecraftShopsModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MinecraftShopsModTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("compressed_iron");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
