
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.timeextraminer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.timeextraminer.world.biome.WarBiomesBiome;
import net.mcreator.timeextraminer.TimeextraminerMod;

public class TimeextraminerModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TimeextraminerMod.MODID);
	public static final RegistryObject<Biome> TIME_BIOME = REGISTRY.register("time_biome", () -> WarBiomesBiome.createBiome());
}
