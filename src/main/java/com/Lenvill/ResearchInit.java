package com.Lenvill;

import minefantasy.mfr.client.knowledge.EntryPageRecipeAnvil;
import minefantasy.mfr.client.knowledge.EntryPageRecipeCarpenter;
import minefantasy.mfr.client.knowledge.EntryPageText;
import minefantasy.mfr.constants.Skill;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.mechanics.knowledge.InformationBase;
import minefantasy.mfr.mechanics.knowledge.InformationPage;
import minefantasy.mfr.mechanics.knowledge.ResearchArtefacts;
import minefantasy.mfr.recipe.CraftingManagerAnvil;
import minefantasy.mfr.recipe.CraftingManagerCarpenter;
import net.minecraft.init.Items;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import teamroots.embers.RegistryManager;

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
        golems = (new InformationBase("golems", 0, 4, 0, RegistryManager.ancient_motive_core, null)).registerStat().setUnlocked();
        tinkerHammer = (new InformationBase("tinker_hammer", 10, 0, 1, RegistryManager.tinker_hammer, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        gadgets = (new InformationBase("gadgets", 12, 0, 1, RegistryManager.ember_gauge, tinkerHammer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pipes = (new InformationBase("pipes", 13, 2, 1, RegistryManager.item_pipe, gadgets)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        mechanicalCore = (new InformationBase("mechanical_core", 12, -2, 1, RegistryManager.mech_core, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //emberMachines = (new InformationBase("ember_production", 13, -4, 1, RegistryManager.ember_bore, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        emberTransfer = (new InformationBase("basic_ember_transfer", 16, -5, 1, RegistryManager.ember_emitter, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        melter = (new InformationBase("melter", 16, -3, 2, RegistryManager.mixer, emberTransfer)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        //ember = (new InformationBase("ember", 15, 11, 1, RegistryManager.crystal_ember, null)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 55);
        stamper = (new InformationBase("stamper", 16, -1, 2, RegistryManager.stamper, melter)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        golemEye = (new InformationBase("golem_eye", 0, 6, 0, RegistryManager.golems_eye, golems)).registerStat().setUnlocked();
        storage = (new InformationBase("storage", 11, -4, 1, RegistryManager.bin, composite_alloy)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 40);

        emberBore = (new InformationBase("ember_bore", 14, -2, 1, RegistryManager.ember_bore, mechanicalCore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        crystallizedEmber = (new InformationBase("ember", 13, -1, 0, RegistryManager.crystal_ember, emberBore)).registerStat().setPage(engineering).setUnlocked();
        emberActivator = (new InformationBase("ember_activator", 14, -4, 1, RegistryManager.ember_activator, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        pressureRefinery = (new InformationBase("pressure_refinery", 14, 0, 1, RegistryManager.boiler, emberBore)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        miniBoiler = (new InformationBase("mini_boiler", 13, -5, 1, RegistryManager.mini_boiler, emberActivator)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);
        reactionChamber = (new InformationBase("reaction_chamber", 14, -6, 1, RegistryManager.reaction_chamber, miniBoiler)).registerStat().setPage(engineering).addSkill(Skill.ENGINEERING, 50).addSkill(Skill.ARTISANRY, 30);

        initArtefacts();
    }

    private static void initArtefacts() {
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, tinkerHammer);
        ResearchArtefacts.addArtefact(MineFantasyItems.COPPER_INGOT, gadgets);
        ResearchArtefacts.addArtefact(RegistryManager.ingot_copper, gadgets);
        ResearchArtefacts.addArtefact(RegistryManager.plate_caminite, pipes);
        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, mechanicalCore);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, emberTransfer);
        ResearchArtefacts.addArtefact(RegistryManager.mech_core, melter);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, melter);
        ResearchArtefacts.addArtefact(RegistryManager.mech_core, stamper);
        ResearchArtefacts.addArtefact(RegistryManager.plate_caminite, stamper);
        ResearchArtefacts.addArtefact(RegistryManager.mech_core, emberBore);

        ResearchArtefacts.addArtefact(MineFantasyItems.COMPOSITE_ALLOY_INGOT, storage);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, emberActivator);
        ResearchArtefacts.addArtefact(RegistryManager.crystal_ember, pressureRefinery);
        ResearchArtefacts.addArtefact(Items.WATER_BUCKET, miniBoiler);
        ResearchArtefacts.addArtefact(RegistryManager.spark_plug, reactionChamber);
    }
}
