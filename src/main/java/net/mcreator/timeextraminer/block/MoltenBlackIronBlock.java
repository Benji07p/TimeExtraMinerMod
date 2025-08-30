
package net.mcreator.timeextraminer.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.timeextraminer.init.TimeextraminerModFluids;

public class MoltenBlackIronBlock extends LiquidBlock {
	public MoltenBlackIronBlock() {
		super(() -> (FlowingFluid) TimeextraminerModFluids.MOLTEN_BLACK_IRON.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
