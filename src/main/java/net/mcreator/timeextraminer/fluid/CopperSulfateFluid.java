
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

public abstract class CopperSulfateFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TimeextraminerModFluids.COPPER_SULFATE,
			TimeextraminerModFluids.FLOWING_COPPER_SULFATE,
			FluidAttributes.builder(new ResourceLocation("timeextraminer:blocks/lithium"), new ResourceLocation("timeextraminer:blocks/lithium"))

	).explosionResistance(100f)

			.bucket(TimeextraminerModItems.COPPER_SULFATE_BUCKET).block(() -> (LiquidBlock) TimeextraminerModBlocks.COPPER_SULFATE.get());

	private CopperSulfateFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CopperSulfateFluid {
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

	public static class Flowing extends CopperSulfateFluid {
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
