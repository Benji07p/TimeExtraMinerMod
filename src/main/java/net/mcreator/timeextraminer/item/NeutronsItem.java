
package net.mcreator.timeextraminer.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.timeextraminer.init.TimeextraminerModTabs;

public class NeutronsItem extends Item {
	public NeutronsItem() {
		super(new Item.Properties().tab(TimeextraminerModTabs.TAB_TIME_EXTRA_MINER).stacksTo(64).rarity(Rarity.RARE));
	}
}
