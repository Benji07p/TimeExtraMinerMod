
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

public abstract class HydrogenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TimeextraminerModFluids.HYDROGEN,
			TimeextraminerModFluids.FLOWING_HYDROGEN,
			FluidAttributes.builder(new ResourceLocation("timeextraminer:blocks/hydrogen"), new ResourceLocation("timeextraminer:blocks/hydrogen"))

	).explosionResistance(100f)

			.bucket(TimeextraminerModItems.HYDROGEN_BUCKET).block(() -> (LiquidBlock) TimeextraminerModBlocks.HYDROGEN.get());

	private HydrogenFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HydrogenFluid {
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

	public static class Flowing extends HydrogenFluid {
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
