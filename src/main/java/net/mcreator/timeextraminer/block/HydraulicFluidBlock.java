
package net.mcreator.timeextraminer.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.timeextraminer.init.TimeextraminerModFluids;

public class HydraulicFluidBlock extends LiquidBlock {
	public HydraulicFluidBlock() {
		super(() -> (FlowingFluid) TimeextraminerModFluids.HYDRAULIC_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
