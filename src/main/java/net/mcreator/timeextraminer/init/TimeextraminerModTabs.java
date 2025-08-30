
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.timeextraminer.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TimeextraminerModTabs {
	public static CreativeModeTab TAB_TIME_EXTRA_MINER;

	public static void load() {
		TAB_TIME_EXTRA_MINER = new CreativeModeTab("tabtime_extra_miner") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TimeextraminerModBlocks.TIMES_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
