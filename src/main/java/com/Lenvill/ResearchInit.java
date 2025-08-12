package com.Lenvill;

import minefantasy.mfr.constants.Skill;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.mechanics.knowledge.InformationBase;
import minefantasy.mfr.mechanics.knowledge.ResearchArtefacts;
import net.minecraft.init.Items;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.register.BlockRegister;
import teamroots.embers.register.ItemRegister;

import static minefantasy.mfr.init.MineFantasyKnowledgeList.composite_alloy;
import static minefantasy.mfr.mechanics.knowledge.InformationList.engineering;


public class ResearchInit {
    public static InformationBase golems;
    public static InformationBase tinkerHammer;
    public static InformationBase gadgets;
    public static InformationBase pipes;
    public static InformationBase mechanicalCore;
    public static InformationBase emberTransfer;
    public static InformationBase melter;
    public static InformationBase stamper;
    public static InformationBase ember;
    public static InformationBase golemEye;
    public static InformationBase storage;
    public static InformationBase emberBore;
    public static InformationBase crystallizedEmber;
    public static InformationBase emberActivator;
    public static InformationBase pressureRefinery;
    public static InformationBase miniBoiler;
    public static InformationBase reactionChamber;

    public static void init() {
        golems = (new InformationBase("golems", 0, 4, 0, ItemRegister.ANCIENT_MOTIVE_CORE, null)).registerStat().setUnlocked();
        tinkerHammer = (new InformationBase("tinker_hammer", 10, 0, 1, ItemRegister.TINKER_HAMMER, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        gadgets = (new InformationBase("gadgets", 12, 0, 1, ItemRegister.EMBER_DETECTOR, tinkerHammer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pipes = (new InformationBase("pipes", 13, 2, 1, BlockRegister.ITEM_PIPE, gadgets)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        mechanicalCore = (new InformationBase("mechanical_core", 12, -2, 1, BlockRegister.MECH_CORE, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //emberMachines = (new InformationBase("ember_production", 13, -4, 1, RegistryManager.ember_bore, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        emberTransfer = (new InformationBase("basic_ember_transfer", 16, -5, 1, BlockRegister.EMBER_EMITTER, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        melter = (new InformationBase("melter", 16, -3, 2, BlockRegister.MIXER, emberTransfer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //ember = (new InformationBase("ember", 15, 11, 1, RegistryManager.crystal_ember, null)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 55);
        stamper = (new InformationBase("stamper", 16, -1, 2, BlockRegister.STAMPER, melter)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        golemEye = (new InformationBase("golem_eye", 0, 6, 0, ItemRegister.GOLEMS_EYE, golems)).registerStat().setUnlocked();
        storage = (new InformationBase("storage", 11, -4, 1, BlockRegister.BIN, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 40);

        emberBore = (new InformationBase("ember_bore", 14, -2, 1, BlockRegister.EMBER_BORE, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        crystallizedEmber = (new InformationBase("ember", 13, -1, 0, ItemRegister.CRYSTAL_EMBER, emberBore)).registerStat().setPage(engineering).setUnlocked();
        emberActivator = (new InformationBase("ember_activator", 14, -4, 1, BlockRegister.EMBER_ACTIVATOR, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pressureRefinery = (new InformationBase("pressure_refinery", 14, 0, 1, BlockRegister.BOILER, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        miniBoiler = (new InformationBase("mini_boiler", 13, -5, 1, BlockRegister.MINI_BOILER, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        reactionChamber = (new InformationBase("reaction_chamber", 14, -6, 1, BlockRegister.REACTION_CHAMBER, miniBoiler)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);

        initArtefacts();
    }

    private static void initArtefacts() {
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, tinkerHammer);
        ResearchArtefacts.addArtefact(MineFantasyItems.COPPER_INGOT, gadgets);
        if(ConfigMaterial.COPPER.isNotOff()) {
            ResearchArtefacts.addArtefact(ItemRegister.INGOT_COPPER, gadgets);
        }
        ResearchArtefacts.addArtefact(ItemRegister.PLATE_CAMINITE, pipes);
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, mechanicalCore);
        ResearchArtefacts.addArtefact(ItemRegister.CRYSTAL_EMBER, emberTransfer);
        ResearchArtefacts.addArtefact(BlockRegister.MECH_CORE, melter);
        ResearchArtefacts.addArtefact(ItemRegister.CRYSTAL_EMBER, melter);
        ResearchArtefacts.addArtefact(BlockRegister.MECH_CORE, stamper);
        ResearchArtefacts.addArtefact(ItemRegister.PLATE_CAMINITE, stamper);
        ResearchArtefacts.addArtefact(BlockRegister.MECH_CORE, emberBore);

        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, storage);
        ResearchArtefacts.addArtefact(ItemRegister.CRYSTAL_EMBER, emberActivator);
        ResearchArtefacts.addArtefact(ItemRegister.CRYSTAL_EMBER, pressureRefinery);
        ResearchArtefacts.addArtefact(Items.WATER_BUCKET, miniBoiler);
        ResearchArtefacts.addArtefact(ItemRegister.SPARK_PLUG, reactionChamber);
    }
}
