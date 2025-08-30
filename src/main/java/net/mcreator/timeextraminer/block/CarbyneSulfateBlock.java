
package net.mcreator.timeextraminer.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.timeextraminer.init.TimeextraminerModFluids;

public class CarbyneSulfateBlock extends LiquidBlock {
	public CarbyneSulfateBlock() {
		super(() -> (FlowingFluid) TimeextraminerModFluids.CARBYNE_SULFATE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
