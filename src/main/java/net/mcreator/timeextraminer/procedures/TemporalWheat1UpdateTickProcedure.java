package net.mcreator.timeextraminer.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.timeextraminer.init.TimeextraminerModBlocks;

public class TemporalWheat1UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), TimeextraminerModBlocks.TEMPORAL_WHEAT_2.get().defaultBlockState(), 3);
	}
}
