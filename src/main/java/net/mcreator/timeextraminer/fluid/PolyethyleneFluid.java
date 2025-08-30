
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

public abstract class PolyethyleneFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TimeextraminerModFluids.POLYETHYLENE,
			TimeextraminerModFluids.FLOWING_POLYETHYLENE, FluidAttributes.builder(new ResourceLocation("timeextraminer:blocks/polyethylene"),
					new ResourceLocation("timeextraminer:blocks/polyethylene"))

	).explosionResistance(100f)

			.bucket(TimeextraminerModItems.POLYETHYLENE_BUCKET).block(() -> (LiquidBlock) TimeextraminerModBlocks.POLYETHYLENE.get());

	private PolyethyleneFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PolyethyleneFluid {
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

	public static class Flowing extends PolyethyleneFluid {
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
