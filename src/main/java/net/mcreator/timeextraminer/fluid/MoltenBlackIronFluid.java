
package net.mcreator.timeextraminer.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.timeextraminer.init.TimeextraminerModItems;
import net.mcreator.timeextraminer.init.TimeextraminerModFluids;
import net.mcreator.timeextraminer.init.TimeextraminerModBlocks;

public abstract class MoltenBlackIronFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TimeextraminerModFluids.MOLTEN_BLACK_IRON,
			TimeextraminerModFluids.FLOWING_MOLTEN_BLACK_IRON, FluidAttributes.builder(new ResourceLocation("timeextraminer:blocks/stillblackiron"),
					new ResourceLocation("timeextraminer:blocks/flowingblackiron"))

	).explosionResistance(100f)

			.bucket(TimeextraminerModItems.MOLTEN_BLACK_IRON_BUCKET).block(() -> (LiquidBlock) TimeextraminerModBlocks.MOLTEN_BLACK_IRON.get());

	private MoltenBlackIronFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenBlackIronFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenBlackIronFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
