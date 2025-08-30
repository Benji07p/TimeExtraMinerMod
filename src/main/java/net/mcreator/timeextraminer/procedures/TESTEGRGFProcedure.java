package net.mcreator.timeextraminer.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class TESTEGRGFProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("beyond_earth:is_glacio")))
				&& x >= 0 && z >= 0 && x <= 16 && z <= 16;
	}
}
