package net.mcreator.timeextraminer.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.timeextraminer.init.TimeextraminerModItems;
import net.mcreator.timeextraminer.init.TimeextraminerModBlocks;

public class TemporalSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.FARMLAND
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.VOID_AIR
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TimeextraminerModItems.TEMPORAL_SEEDS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(new BlockPos(x, y + 1, z), TimeextraminerModBlocks.TEMPORAL_WHEAT_0.get().defaultBlockState(), 3);
		}
	}
}
