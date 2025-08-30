
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.timeextraminer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.timeextraminer.block.VanadiumSulfateBlock;
import net.mcreator.timeextraminer.block.UraniumHexafluorideBlock;
import net.mcreator.timeextraminer.block.UltimateMachineFrameBlock;
import net.mcreator.timeextraminer.block.TinSulfateBlock;
import net.mcreator.timeextraminer.block.TimesBlockBlock;
import net.mcreator.timeextraminer.block.TimeOresBlock;
import net.mcreator.timeextraminer.block.TemporalWheat2Block;
import net.mcreator.timeextraminer.block.TemporalWheat1Block;
import net.mcreator.timeextraminer.block.TemporalWheat0Block;
import net.mcreator.timeextraminer.block.SilverSulfateBlock;
import net.mcreator.timeextraminer.block.ReversedNukTestBlock;
import net.mcreator.timeextraminer.block.PolyethyleneBlock;
import net.mcreator.timeextraminer.block.OxygenBlock;
import net.mcreator.timeextraminer.block.NuclearChestBlock;
import net.mcreator.timeextraminer.block.NewtonsBlockBlock;
import net.mcreator.timeextraminer.block.MolybdenumSulfateBlock;
import net.mcreator.timeextraminer.block.MoltenBlackIronBlock;
import net.mcreator.timeextraminer.block.LithiumSulfateBlock;
import net.mcreator.timeextraminer.block.LiquidConcreteBlock;
import net.mcreator.timeextraminer.block.LiquidClayBlock;
import net.mcreator.timeextraminer.block.LeadSulfateBlock;
import net.mcreator.timeextraminer.block.IronSulfateBlock;
import net.mcreator.timeextraminer.block.HydrogenFluorideBlock;
import net.mcreator.timeextraminer.block.HydrogenBlock;
import net.mcreator.timeextraminer.block.HydraulicFluidBlock;
import net.mcreator.timeextraminer.block.Helium3fluidBlock;
import net.mcreator.timeextraminer.block.GoldSulfateBlock;
import net.mcreator.timeextraminer.block.DamagedBedrockBlock;
import net.mcreator.timeextraminer.block.CopperSulfateBlock;
import net.mcreator.timeextraminer.block.CaveblockBlock;
import net.mcreator.timeextraminer.block.CarbyneSulfateBlock;
import net.mcreator.timeextraminer.block.AtomicTESTBlock;
import net.mcreator.timeextraminer.block.AntirtestBlock;
import net.mcreator.timeextraminer.block.AmmoniaBlock;
import net.mcreator.timeextraminer.block.AlchemicalOreBlock;
import net.mcreator.timeextraminer.block.AirTestBlock;
import net.mcreator.timeextraminer.block.AdvancedcatalystBlock;
import net.mcreator.timeextraminer.block.AdvancedNukTestBlock;
import net.mcreator.timeextraminer.block.AdvancedComponentsBlock;
import net.mcreator.timeextraminer.TimeextraminerMod;

public class TimeextraminerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TimeextraminerMod.MODID);
	public static final RegistryObject<Block> TIME_ORES = REGISTRY.register("time_ores", () -> new TimeOresBlock());
	public static final RegistryObject<Block> TIMES_BLOCK = REGISTRY.register("times_block", () -> new TimesBlockBlock());
	public static final RegistryObject<Block> TEMPORAL_WHEAT_0 = REGISTRY.register("temporal_wheat_0", () -> new TemporalWheat0Block());
	public static final RegistryObject<Block> TEMPORAL_WHEAT_1 = REGISTRY.register("temporal_wheat_1", () -> new TemporalWheat1Block());
	public static final RegistryObject<Block> TEMPORAL_WHEAT_2 = REGISTRY.register("temporal_wheat_2", () -> new TemporalWheat2Block());
	public static final RegistryObject<Block> HELIUM_3FLUID = REGISTRY.register("helium_3fluid", () -> new Helium3fluidBlock());
	public static final RegistryObject<Block> DAMAGED_BEDROCK = REGISTRY.register("damaged_bedrock", () -> new DamagedBedrockBlock());
	public static final RegistryObject<Block> CAVEBLOCK = REGISTRY.register("caveblock", () -> new CaveblockBlock());
	public static final RegistryObject<Block> ATOMIC_TEST = REGISTRY.register("atomic_test", () -> new AtomicTESTBlock());
	public static final RegistryObject<Block> AIR_TEST = REGISTRY.register("air_test", () -> new AirTestBlock());
	public static final RegistryObject<Block> NUCLEAR_CHEST = REGISTRY.register("nuclear_chest", () -> new NuclearChestBlock());
	public static final RegistryObject<Block> ANTIRTEST = REGISTRY.register("antirtest", () -> new AntirtestBlock());
	public static final RegistryObject<Block> ADVANCED_NUK_TEST = REGISTRY.register("advanced_nuk_test", () -> new AdvancedNukTestBlock());
	public static final RegistryObject<Block> REVERSED_NUK_TEST = REGISTRY.register("reversed_nuk_test", () -> new ReversedNukTestBlock());
	public static final RegistryObject<Block> ADVANCEDCATALYST = REGISTRY.register("advancedcatalyst", () -> new AdvancedcatalystBlock());
	public static final RegistryObject<Block> ADVANCED_COMPONENTS = REGISTRY.register("advanced_components", () -> new AdvancedComponentsBlock());
	public static final RegistryObject<Block> ALCHEMICAL_ORE = REGISTRY.register("alchemical_ore", () -> new AlchemicalOreBlock());
	public static final RegistryObject<Block> ULTIMATE_MACHINE_FRAME = REGISTRY.register("ultimate_machine_frame",
			() -> new UltimateMachineFrameBlock());
	public static final RegistryObject<Block> LITHIUM_SULFATE = REGISTRY.register("lithium_sulfate", () -> new LithiumSulfateBlock());
	public static final RegistryObject<Block> COPPER_SULFATE = REGISTRY.register("copper_sulfate", () -> new CopperSulfateBlock());
	public static final RegistryObject<Block> VANADIUM_SULFATE = REGISTRY.register("vanadium_sulfate", () -> new VanadiumSulfateBlock());
	public static final RegistryObject<Block> MOLYBDENUM_SULFATE = REGISTRY.register("molybdenum_sulfate", () -> new MolybdenumSulfateBlock());
	public static final RegistryObject<Block> CARBYNE_SULFATE = REGISTRY.register("carbyne_sulfate", () -> new CarbyneSulfateBlock());
	public static final RegistryObject<Block> LEAD_SULFATE = REGISTRY.register("lead_sulfate", () -> new LeadSulfateBlock());
	public static final RegistryObject<Block> SILVER_SULFATE = REGISTRY.register("silver_sulfate", () -> new SilverSulfateBlock());
	public static final RegistryObject<Block> GOLD_SULFATE = REGISTRY.register("gold_sulfate", () -> new GoldSulfateBlock());
	public static final RegistryObject<Block> TIN_SULFATE = REGISTRY.register("tin_sulfate", () -> new TinSulfateBlock());
	public static final RegistryObject<Block> HYDRAULIC_FLUID = REGISTRY.register("hydraulic_fluid", () -> new HydraulicFluidBlock());
	public static final RegistryObject<Block> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenBlock());
	public static final RegistryObject<Block> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenBlock());
	public static final RegistryObject<Block> URANIUM_HEXAFLUORIDE = REGISTRY.register("uranium_hexafluoride", () -> new UraniumHexafluorideBlock());
	public static final RegistryObject<Block> IRON_SULFATE = REGISTRY.register("iron_sulfate", () -> new IronSulfateBlock());
	public static final RegistryObject<Block> MOLTEN_BLACK_IRON = REGISTRY.register("molten_black_iron", () -> new MoltenBlackIronBlock());
	public static final RegistryObject<Block> NEWTONS_BLOCK = REGISTRY.register("newtons_block", () -> new NewtonsBlockBlock());
	public static final RegistryObject<Block> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaBlock());
	public static final RegistryObject<Block> LIQUID_CLAY = REGISTRY.register("liquid_clay", () -> new LiquidClayBlock());
	public static final RegistryObject<Block> LIQUID_CONCRETE = REGISTRY.register("liquid_concrete", () -> new LiquidConcreteBlock());
	public static final RegistryObject<Block> HYDROGEN_FLUORIDE = REGISTRY.register("hydrogen_fluoride", () -> new HydrogenFluorideBlock());
	public static final RegistryObject<Block> POLYETHYLENE = REGISTRY.register("polyethylene", () -> new PolyethyleneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TemporalWheat0Block.registerRenderLayer();
			TemporalWheat1Block.registerRenderLayer();
			TemporalWheat2Block.registerRenderLayer();
			CaveblockBlock.registerRenderLayer();
			AtomicTESTBlock.registerRenderLayer();
			NuclearChestBlock.registerRenderLayer();
			AntirtestBlock.registerRenderLayer();
			AdvancedNukTestBlock.registerRenderLayer();
			ReversedNukTestBlock.registerRenderLayer();
		}
	}
}
