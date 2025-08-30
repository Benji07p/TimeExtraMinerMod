
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.timeextraminer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.timeextraminer.fluid.VanadiumSulfateFluid;
import net.mcreator.timeextraminer.fluid.UraniumHexafluorideFluid;
import net.mcreator.timeextraminer.fluid.TinSulfateFluid;
import net.mcreator.timeextraminer.fluid.SilverSulfateFluid;
import net.mcreator.timeextraminer.fluid.PolyethyleneFluid;
import net.mcreator.timeextraminer.fluid.OxygenFluid;
import net.mcreator.timeextraminer.fluid.MolybdenumSulfateFluid;
import net.mcreator.timeextraminer.fluid.MoltenBlackIronFluid;
import net.mcreator.timeextraminer.fluid.LithiumSulfateFluid;
import net.mcreator.timeextraminer.fluid.LiquidConcreteFluid;
import net.mcreator.timeextraminer.fluid.LiquidClayFluid;
import net.mcreator.timeextraminer.fluid.LeadSulfateFluid;
import net.mcreator.timeextraminer.fluid.IronSulfateFluid;
import net.mcreator.timeextraminer.fluid.HydrogenFluorideFluid;
import net.mcreator.timeextraminer.fluid.HydrogenFluid;
import net.mcreator.timeextraminer.fluid.HydraulicFluidFluid;
import net.mcreator.timeextraminer.fluid.Helium3fluidFluid;
import net.mcreator.timeextraminer.fluid.GoldSulfateFluid;
import net.mcreator.timeextraminer.fluid.CopperSulfateFluid;
import net.mcreator.timeextraminer.fluid.CarbyneSulfateFluid;
import net.mcreator.timeextraminer.fluid.AmmoniaFluid;
import net.mcreator.timeextraminer.TimeextraminerMod;

public class TimeextraminerModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TimeextraminerMod.MODID);
	public static final RegistryObject<Fluid> HELIUM_3FLUID = REGISTRY.register("helium_3fluid", () -> new Helium3fluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HELIUM_3FLUID = REGISTRY.register("flowing_helium_3fluid",
			() -> new Helium3fluidFluid.Flowing());
	public static final RegistryObject<Fluid> LITHIUM_SULFATE = REGISTRY.register("lithium_sulfate", () -> new LithiumSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LITHIUM_SULFATE = REGISTRY.register("flowing_lithium_sulfate",
			() -> new LithiumSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> COPPER_SULFATE = REGISTRY.register("copper_sulfate", () -> new CopperSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_COPPER_SULFATE = REGISTRY.register("flowing_copper_sulfate",
			() -> new CopperSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> VANADIUM_SULFATE = REGISTRY.register("vanadium_sulfate", () -> new VanadiumSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_VANADIUM_SULFATE = REGISTRY.register("flowing_vanadium_sulfate",
			() -> new VanadiumSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> MOLYBDENUM_SULFATE = REGISTRY.register("molybdenum_sulfate", () -> new MolybdenumSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MOLYBDENUM_SULFATE = REGISTRY.register("flowing_molybdenum_sulfate",
			() -> new MolybdenumSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> CARBYNE_SULFATE = REGISTRY.register("carbyne_sulfate", () -> new CarbyneSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CARBYNE_SULFATE = REGISTRY.register("flowing_carbyne_sulfate",
			() -> new CarbyneSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> LEAD_SULFATE = REGISTRY.register("lead_sulfate", () -> new LeadSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LEAD_SULFATE = REGISTRY.register("flowing_lead_sulfate", () -> new LeadSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> SILVER_SULFATE = REGISTRY.register("silver_sulfate", () -> new SilverSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SILVER_SULFATE = REGISTRY.register("flowing_silver_sulfate",
			() -> new SilverSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> GOLD_SULFATE = REGISTRY.register("gold_sulfate", () -> new GoldSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_GOLD_SULFATE = REGISTRY.register("flowing_gold_sulfate", () -> new GoldSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> TIN_SULFATE = REGISTRY.register("tin_sulfate", () -> new TinSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_TIN_SULFATE = REGISTRY.register("flowing_tin_sulfate", () -> new TinSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> HYDRAULIC_FLUID = REGISTRY.register("hydraulic_fluid", () -> new HydraulicFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HYDRAULIC_FLUID = REGISTRY.register("flowing_hydraulic_fluid",
			() -> new HydraulicFluidFluid.Flowing());
	public static final RegistryObject<Fluid> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_OXYGEN = REGISTRY.register("flowing_oxygen", () -> new OxygenFluid.Flowing());
	public static final RegistryObject<Fluid> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HYDROGEN = REGISTRY.register("flowing_hydrogen", () -> new HydrogenFluid.Flowing());
	public static final RegistryObject<Fluid> URANIUM_HEXAFLUORIDE = REGISTRY.register("uranium_hexafluoride",
			() -> new UraniumHexafluorideFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_URANIUM_HEXAFLUORIDE = REGISTRY.register("flowing_uranium_hexafluoride",
			() -> new UraniumHexafluorideFluid.Flowing());
	public static final RegistryObject<Fluid> IRON_SULFATE = REGISTRY.register("iron_sulfate", () -> new IronSulfateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_IRON_SULFATE = REGISTRY.register("flowing_iron_sulfate", () -> new IronSulfateFluid.Flowing());
	public static final RegistryObject<Fluid> MOLTEN_BLACK_IRON = REGISTRY.register("molten_black_iron", () -> new MoltenBlackIronFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MOLTEN_BLACK_IRON = REGISTRY.register("flowing_molten_black_iron",
			() -> new MoltenBlackIronFluid.Flowing());
	public static final RegistryObject<Fluid> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_AMMONIA = REGISTRY.register("flowing_ammonia", () -> new AmmoniaFluid.Flowing());
	public static final RegistryObject<Fluid> LIQUID_CLAY = REGISTRY.register("liquid_clay", () -> new LiquidClayFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUID_CLAY = REGISTRY.register("flowing_liquid_clay", () -> new LiquidClayFluid.Flowing());
	public static final RegistryObject<Fluid> LIQUID_CONCRETE = REGISTRY.register("liquid_concrete", () -> new LiquidConcreteFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUID_CONCRETE = REGISTRY.register("flowing_liquid_concrete",
			() -> new LiquidConcreteFluid.Flowing());
	public static final RegistryObject<Fluid> HYDROGEN_FLUORIDE = REGISTRY.register("hydrogen_fluoride", () -> new HydrogenFluorideFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HYDROGEN_FLUORIDE = REGISTRY.register("flowing_hydrogen_fluoride",
			() -> new HydrogenFluorideFluid.Flowing());
	public static final RegistryObject<Fluid> POLYETHYLENE = REGISTRY.register("polyethylene", () -> new PolyethyleneFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_POLYETHYLENE = REGISTRY.register("flowing_polyethylene", () -> new PolyethyleneFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HELIUM_3FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HELIUM_3FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LITHIUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LITHIUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COPPER_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COPPER_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(VANADIUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VANADIUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MOLYBDENUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLYBDENUM_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CARBYNE_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CARBYNE_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LEAD_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LEAD_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SILVER_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SILVER_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GOLD_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GOLD_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TIN_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TIN_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HYDRAULIC_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDRAULIC_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OXYGEN.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OXYGEN.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HYDROGEN.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDROGEN.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(URANIUM_HEXAFLUORIDE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_URANIUM_HEXAFLUORIDE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(IRON_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_IRON_SULFATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_BLACK_IRON.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_BLACK_IRON.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(AMMONIA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AMMONIA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_CLAY.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_CLAY.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_CONCRETE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_CONCRETE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HYDROGEN_FLUORIDE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDROGEN_FLUORIDE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(POLYETHYLENE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POLYETHYLENE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
