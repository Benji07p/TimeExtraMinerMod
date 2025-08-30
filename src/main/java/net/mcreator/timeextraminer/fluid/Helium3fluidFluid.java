
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

public abstract class Helium3fluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TimeextraminerModFluids.HELIUM_3FLUID,
			TimeextraminerModFluids.FLOWING_HELIUM_3FLUID,
			FluidAttributes
					.builder(new ResourceLocation("timeextraminer:blocks/helium3_still"), new ResourceLocation("timeextraminer:blocks/helium3_flow"))

					.density(0)

	).explosionResistance(100f)

			.bucket(TimeextraminerModItems.HELIUM_3FLUID_BUCKET).block(() -> (LiquidBlock) TimeextraminerModBlocks.HELIUM_3FLUID.get());

	private Helium3fluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends Helium3fluidFluid {
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

	public static class Flowing extends Helium3fluidFluid {
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
