
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.timeextraminer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.timeextraminer.item.VanadiumSulfateItem;
import net.mcreator.timeextraminer.item.UraniumHexafluorideItem;
import net.mcreator.timeextraminer.item.UniversalReconstructorItem;
import net.mcreator.timeextraminer.item.UniversalCoreItem;
import net.mcreator.timeextraminer.item.TinSulfateItem;
import net.mcreator.timeextraminer.item.TimeCubesItem;
import net.mcreator.timeextraminer.item.TimeCristalItem;
import net.mcreator.timeextraminer.item.TemporalSeedsItem;
import net.mcreator.timeextraminer.item.SilverSulfateItem;
import net.mcreator.timeextraminer.item.ShadowsSwordItem;
import net.mcreator.timeextraminer.item.RawTimeCristalItem;
import net.mcreator.timeextraminer.item.ProtonsItem;
import net.mcreator.timeextraminer.item.PositronsItem;
import net.mcreator.timeextraminer.item.PolyethyleneItem;
import net.mcreator.timeextraminer.item.Plutonium244Item;
import net.mcreator.timeextraminer.item.OxygenItem;
import net.mcreator.timeextraminer.item.NewtonsPlateItem;
import net.mcreator.timeextraminer.item.NewtonsNuggetItem;
import net.mcreator.timeextraminer.item.NewtonsIngotItem;
import net.mcreator.timeextraminer.item.NewtonsDustItem;
import net.mcreator.timeextraminer.item.NeutronsItem;
import net.mcreator.timeextraminer.item.NetherGasItem;
import net.mcreator.timeextraminer.item.MolybdenumSulfateItem;
import net.mcreator.timeextraminer.item.MoltenBlackIronItem;
import net.mcreator.timeextraminer.item.MixingSiliconItem;
import net.mcreator.timeextraminer.item.LithiumSulfateItem;
import net.mcreator.timeextraminer.item.LiquidConcreteItem;
import net.mcreator.timeextraminer.item.LiquidClayItem;
import net.mcreator.timeextraminer.item.LiquidAirItem;
import net.mcreator.timeextraminer.item.LeadSulfateItem;
import net.mcreator.timeextraminer.item.IronSulfateItem;
import net.mcreator.timeextraminer.item.HyperCubesItem;
import net.mcreator.timeextraminer.item.HydrogenItem;
import net.mcreator.timeextraminer.item.HydrogenFluorideItem;
import net.mcreator.timeextraminer.item.HydraulicFluidItem;
import net.mcreator.timeextraminer.item.Helium3fluidItem;
import net.mcreator.timeextraminer.item.Helium3Item;
import net.mcreator.timeextraminer.item.GoldSulfateItem;
import net.mcreator.timeextraminer.item.FuringotsItem;
import net.mcreator.timeextraminer.item.FourneutronsItem;
import net.mcreator.timeextraminer.item.FiveneutronsItem;
import net.mcreator.timeextraminer.item.ElectronsItem;
import net.mcreator.timeextraminer.item.DoukingotsItem;
import net.mcreator.timeextraminer.item.DiheliumItem;
import net.mcreator.timeextraminer.item.Curium249Item;
import net.mcreator.timeextraminer.item.Curium244Item;
import net.mcreator.timeextraminer.item.CopperSulfateItem;
import net.mcreator.timeextraminer.item.CarbyneSulfateItem;
import net.mcreator.timeextraminer.item.CanisterItem;
import net.mcreator.timeextraminer.item.Californium249Item;
import net.mcreator.timeextraminer.item.Calcium48Item;
import net.mcreator.timeextraminer.item.BrokenBlackIronItem;
import net.mcreator.timeextraminer.item.BlackIronHammerItem;
import net.mcreator.timeextraminer.item.Berkelium249Item;
import net.mcreator.timeextraminer.item.BenjingotsItem;
import net.mcreator.timeextraminer.item.BedrockIngotItem;
import net.mcreator.timeextraminer.item.BedrockDustItem;
import net.mcreator.timeextraminer.item.AntiprotonsItem;
import net.mcreator.timeextraminer.item.AntineutronsItem;
import net.mcreator.timeextraminer.item.AntiHydrogenItem;
import net.mcreator.timeextraminer.item.AmmoniaItem;
import net.mcreator.timeextraminer.item.Americium244Item;
import net.mcreator.timeextraminer.item.Americium243Item;
import net.mcreator.timeextraminer.item.AlphmiumIngotItem;
import net.mcreator.timeextraminer.item.AlchemicalIngotItem;
import net.mcreator.timeextraminer.item.AirGasItem;
import net.mcreator.timeextraminer.TimeextraminerMod;

public class TimeextraminerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TimeextraminerMod.MODID);
	public static final RegistryObject<Item> TIME_CRISTAL = REGISTRY.register("time_cristal", () -> new TimeCristalItem());
	public static final RegistryObject<Item> TIME_ORES = block(TimeextraminerModBlocks.TIME_ORES, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> RAW_TIME_CRISTAL = REGISTRY.register("raw_time_cristal", () -> new RawTimeCristalItem());
	public static final RegistryObject<Item> TIME_CUBES = REGISTRY.register("time_cubes", () -> new TimeCubesItem());
	public static final RegistryObject<Item> TIMES_BLOCK = block(TimeextraminerModBlocks.TIMES_BLOCK, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> HYPER_CUBES = REGISTRY.register("hyper_cubes", () -> new HyperCubesItem());
	public static final RegistryObject<Item> TEMPORAL_SEEDS = REGISTRY.register("temporal_seeds", () -> new TemporalSeedsItem());
	public static final RegistryObject<Item> TEMPORAL_WHEAT_0 = block(TimeextraminerModBlocks.TEMPORAL_WHEAT_0, null);
	public static final RegistryObject<Item> TEMPORAL_WHEAT_1 = block(TimeextraminerModBlocks.TEMPORAL_WHEAT_1, null);
	public static final RegistryObject<Item> TEMPORAL_WHEAT_2 = block(TimeextraminerModBlocks.TEMPORAL_WHEAT_2, null);
	public static final RegistryObject<Item> HELIUM_3 = REGISTRY.register("helium_3", () -> new Helium3Item());
	public static final RegistryObject<Item> DIHELIUM = REGISTRY.register("dihelium", () -> new DiheliumItem());
	public static final RegistryObject<Item> PROTONS = REGISTRY.register("protons", () -> new ProtonsItem());
	public static final RegistryObject<Item> NEUTRONS = REGISTRY.register("neutrons", () -> new NeutronsItem());
	public static final RegistryObject<Item> ELECTRONS = REGISTRY.register("electrons", () -> new ElectronsItem());
	public static final RegistryObject<Item> SHADOWS_SWORD = REGISTRY.register("shadows_sword", () -> new ShadowsSwordItem());
	public static final RegistryObject<Item> NETHER_GAS = REGISTRY.register("nether_gas", () -> new NetherGasItem());
	public static final RegistryObject<Item> AIR_GAS = REGISTRY.register("air_gas", () -> new AirGasItem());
	public static final RegistryObject<Item> LIQUID_AIR = REGISTRY.register("liquid_air", () -> new LiquidAirItem());
	public static final RegistryObject<Item> BEDROCK_DUST = REGISTRY.register("bedrock_dust", () -> new BedrockDustItem());
	public static final RegistryObject<Item> HELIUM_3FLUID_BUCKET = REGISTRY.register("helium_3fluid_bucket", () -> new Helium3fluidItem());
	public static final RegistryObject<Item> BEDROCK_INGOT = REGISTRY.register("bedrock_ingot", () -> new BedrockIngotItem());
	public static final RegistryObject<Item> DAMAGED_BEDROCK = block(TimeextraminerModBlocks.DAMAGED_BEDROCK,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ANTI_HYDROGEN = REGISTRY.register("anti_hydrogen", () -> new AntiHydrogenItem());
	public static final RegistryObject<Item> POSITRONS = REGISTRY.register("positrons", () -> new PositronsItem());
	public static final RegistryObject<Item> ANTIPROTONS = REGISTRY.register("antiprotons", () -> new AntiprotonsItem());
	public static final RegistryObject<Item> ANTINEUTRONS = REGISTRY.register("antineutrons", () -> new AntineutronsItem());
	public static final RegistryObject<Item> PLUTONIUM_243 = REGISTRY.register("plutonium_243", () -> new Plutonium244Item());
	public static final RegistryObject<Item> AMERICIUM_244 = REGISTRY.register("americium_244", () -> new Americium244Item());
	public static final RegistryObject<Item> AMERICIUM_243 = REGISTRY.register("americium_243", () -> new Americium243Item());
	public static final RegistryObject<Item> CURIUM_244 = REGISTRY.register("curium_244", () -> new Curium244Item());
	public static final RegistryObject<Item> CURIUM_249 = REGISTRY.register("curium_249", () -> new Curium249Item());
	public static final RegistryObject<Item> BERKELIUM_249 = REGISTRY.register("berkelium_249", () -> new Berkelium249Item());
	public static final RegistryObject<Item> CALIFORNIUM_249 = REGISTRY.register("californium_249", () -> new Californium249Item());
	public static final RegistryObject<Item> CALCIUM_48 = REGISTRY.register("calcium_48", () -> new Calcium48Item());
	public static final RegistryObject<Item> FOURNEUTRONS = REGISTRY.register("fourneutrons", () -> new FourneutronsItem());
	public static final RegistryObject<Item> FIVENEUTRONS = REGISTRY.register("fiveneutrons", () -> new FiveneutronsItem());
	public static final RegistryObject<Item> CAVEBLOCK = block(TimeextraminerModBlocks.CAVEBLOCK, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> MIXING_SILICON = REGISTRY.register("mixing_silicon", () -> new MixingSiliconItem());
	public static final RegistryObject<Item> ATOMIC_TEST = block(TimeextraminerModBlocks.ATOMIC_TEST, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> AIR_TEST = block(TimeextraminerModBlocks.AIR_TEST, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> NUCLEAR_CHEST = block(TimeextraminerModBlocks.NUCLEAR_CHEST, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ANTIRTEST = block(TimeextraminerModBlocks.ANTIRTEST, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ADVANCED_NUK_TEST = block(TimeextraminerModBlocks.ADVANCED_NUK_TEST,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> REVERSED_NUK_TEST = block(TimeextraminerModBlocks.REVERSED_NUK_TEST,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ALCHEMICAL_INGOT = REGISTRY.register("alchemical_ingot", () -> new AlchemicalIngotItem());
	public static final RegistryObject<Item> DOUKINGOTS = REGISTRY.register("doukingots", () -> new DoukingotsItem());
	public static final RegistryObject<Item> BENJINGOTS = REGISTRY.register("benjingots", () -> new BenjingotsItem());
	public static final RegistryObject<Item> FURINGOTS = REGISTRY.register("furingots", () -> new FuringotsItem());
	public static final RegistryObject<Item> ADVANCEDCATALYST = block(TimeextraminerModBlocks.ADVANCEDCATALYST,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ADVANCED_COMPONENTS = block(TimeextraminerModBlocks.ADVANCED_COMPONENTS,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> ALCHEMICAL_ORE = block(TimeextraminerModBlocks.ALCHEMICAL_ORE,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> UNIVERSAL_CORE = REGISTRY.register("universal_core", () -> new UniversalCoreItem());
	public static final RegistryObject<Item> UNIVERSAL_RECONSTRUCTOR = REGISTRY.register("universal_reconstructor",
			() -> new UniversalReconstructorItem());
	public static final RegistryObject<Item> ALPHMIUM_INGOT = REGISTRY.register("alphmium_ingot", () -> new AlphmiumIngotItem());
	public static final RegistryObject<Item> ULTIMATE_MACHINE_FRAME = block(TimeextraminerModBlocks.ULTIMATE_MACHINE_FRAME,
			TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> LITHIUM_SULFATE_BUCKET = REGISTRY.register("lithium_sulfate_bucket", () -> new LithiumSulfateItem());
	public static final RegistryObject<Item> COPPER_SULFATE_BUCKET = REGISTRY.register("copper_sulfate_bucket", () -> new CopperSulfateItem());
	public static final RegistryObject<Item> VANADIUM_SULFATE_BUCKET = REGISTRY.register("vanadium_sulfate_bucket", () -> new VanadiumSulfateItem());
	public static final RegistryObject<Item> MOLYBDENUM_SULFATE_BUCKET = REGISTRY.register("molybdenum_sulfate_bucket",
			() -> new MolybdenumSulfateItem());
	public static final RegistryObject<Item> CARBYNE_SULFATE_BUCKET = REGISTRY.register("carbyne_sulfate_bucket", () -> new CarbyneSulfateItem());
	public static final RegistryObject<Item> LEAD_SULFATE_BUCKET = REGISTRY.register("lead_sulfate_bucket", () -> new LeadSulfateItem());
	public static final RegistryObject<Item> SILVER_SULFATE_BUCKET = REGISTRY.register("silver_sulfate_bucket", () -> new SilverSulfateItem());
	public static final RegistryObject<Item> GOLD_SULFATE_BUCKET = REGISTRY.register("gold_sulfate_bucket", () -> new GoldSulfateItem());
	public static final RegistryObject<Item> TIN_SULFATE_BUCKET = REGISTRY.register("tin_sulfate_bucket", () -> new TinSulfateItem());
	public static final RegistryObject<Item> HYDRAULIC_FLUID_BUCKET = REGISTRY.register("hydraulic_fluid_bucket", () -> new HydraulicFluidItem());
	public static final RegistryObject<Item> OXYGEN_BUCKET = REGISTRY.register("oxygen_bucket", () -> new OxygenItem());
	public static final RegistryObject<Item> HYDROGEN_BUCKET = REGISTRY.register("hydrogen_bucket", () -> new HydrogenItem());
	public static final RegistryObject<Item> URANIUM_HEXAFLUORIDE_BUCKET = REGISTRY.register("uranium_hexafluoride_bucket",
			() -> new UraniumHexafluorideItem());
	public static final RegistryObject<Item> IRON_SULFATE_BUCKET = REGISTRY.register("iron_sulfate_bucket", () -> new IronSulfateItem());
	public static final RegistryObject<Item> BROKEN_BLACK_IRON = REGISTRY.register("broken_black_iron", () -> new BrokenBlackIronItem());
	public static final RegistryObject<Item> MOLTEN_BLACK_IRON_BUCKET = REGISTRY.register("molten_black_iron_bucket",
			() -> new MoltenBlackIronItem());
	public static final RegistryObject<Item> NEWTONS_BLOCK = block(TimeextraminerModBlocks.NEWTONS_BLOCK, TimeextraminerModTabs.TAB_TIME_EXTRA_MINER);
	public static final RegistryObject<Item> NEWTONS_DUST = REGISTRY.register("newtons_dust", () -> new NewtonsDustItem());
	public static final RegistryObject<Item> NEWTONS_INGOT = REGISTRY.register("newtons_ingot", () -> new NewtonsIngotItem());
	public static final RegistryObject<Item> NEWTONS_NUGGET = REGISTRY.register("newtons_nugget", () -> new NewtonsNuggetItem());
	public static final RegistryObject<Item> NEWTONS_PLATE = REGISTRY.register("newtons_plate", () -> new NewtonsPlateItem());
	public static final RegistryObject<Item> BLACK_IRON_HAMMER = REGISTRY.register("black_iron_hammer", () -> new BlackIronHammerItem());
	public static final RegistryObject<Item> AMMONIA_BUCKET = REGISTRY.register("ammonia_bucket", () -> new AmmoniaItem());
	public static final RegistryObject<Item> LIQUID_CLAY_BUCKET = REGISTRY.register("liquid_clay_bucket", () -> new LiquidClayItem());
	public static final RegistryObject<Item> LIQUID_CONCRETE_BUCKET = REGISTRY.register("liquid_concrete_bucket", () -> new LiquidConcreteItem());
	public static final RegistryObject<Item> HYDROGEN_FLUORIDE_BUCKET = REGISTRY.register("hydrogen_fluoride_bucket",
			() -> new HydrogenFluorideItem());
	public static final RegistryObject<Item> CANISTER = REGISTRY.register("canister", () -> new CanisterItem());
	public static final RegistryObject<Item> POLYETHYLENE_BUCKET = REGISTRY.register("polyethylene_bucket", () -> new PolyethyleneItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
