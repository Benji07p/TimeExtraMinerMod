
package net.mcreator.timeextraminer.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.timeextraminer.init.TimeextraminerModTabs;
import net.mcreator.timeextraminer.init.TimeextraminerModFluids;

public class GoldSulfateItem extends BucketItem {
	public GoldSulfateItem() {
		super(TimeextraminerModFluids.GOLD_SULFATE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(TimeextraminerModTabs.TAB_TIME_EXTRA_MINER));
	}
}
