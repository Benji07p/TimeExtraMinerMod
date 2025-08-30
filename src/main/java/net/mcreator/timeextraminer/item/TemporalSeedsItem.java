
package net.mcreator.timeextraminer.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.timeextraminer.procedures.TemporalSeedsRightclickedOnBlockProcedure;
import net.mcreator.timeextraminer.init.TimeextraminerModTabs;

public class TemporalSeedsItem extends Item {
	public TemporalSeedsItem() {
		super(new Item.Properties().tab(TimeextraminerModTabs.TAB_TIME_EXTRA_MINER).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TemporalSeedsRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
