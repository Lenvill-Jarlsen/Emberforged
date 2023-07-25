package com.Lenvill.proxy;

import com.Lenvill.ResearchInit;
import minefantasy.mfr.client.knowledge.EntryPageRecipeAnvil;
import minefantasy.mfr.client.knowledge.EntryPageText;
import minefantasy.mfr.recipe.CraftingManagerAnvil;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KnowledgePageRegistry {
    public static void initPages() {
        //MineFantasyKnowledgeList.ores.addPages(new EntryPageText("knowledge.ores.3"));
        //MineFantasyKnowledgeList.ores.addPages(new EntryPage[] {new EntryPageImage("LeadOre.png", 96, 96, "knowledge.ores.lead"), new EntryPageSmelting(new ItemStack(RegistryManager.ore_lead), new ItemStack(RegistryManager.ingot_lead))});
        //MineFantasyKnowledgeList.ores.addPages(new EntryPageImage("textures/gui/knowledge/image/" + "QuartzOre" + ".png", 96, 96, "knowledge.ores.quartz"));

        ResearchInit.golems.addPages(new EntryPageText("knowledge.golems.1"));

        //golems.addPages(new EntryPageImage("textures/gui/knowledge/images/" + "AncientGolem" + ".png", 96, 96, "knowledge.golems.1"));

        ResearchInit.tinkerHammer.addPages(
                new EntryPageText("knowledge.tinker_hammer.1"),
                //new EntryPageRecipeCarpenter(CraftingManagerCarpenter.getRecipeByName("tinker_hammer")),
                new EntryPageRecipeAnvil(CraftingManagerAnvil.getRecipeByName("TinkerHammer"))
        );

        ResearchInit.gadgets.addPages(
                new EntryPageText("knowledge.gadgets.1")
        );

        ResearchInit.pipes.addPages(new EntryPageText("knowledge.pipes.1"));
        ResearchInit.pipes.addPages(new EntryPageText("knowledge.pipes.2"));
        ResearchInit.pipes.addPages(new EntryPageText("knowledge.pipes.3"));
        ResearchInit.pipes.addPages(new EntryPageText("knowledge.pipes.4"));

        ResearchInit.golemEye.addPages(new EntryPageText("knowledge.golem_eye.1"));

        ResearchInit.storage.addPages(new EntryPageText("knowledge.storage.1"));
        ResearchInit.storage.addPages(new EntryPageText("knowledge.storage.2"));
        ResearchInit.storage.addPages(new EntryPageText("knowledge.storage.3"));

        ResearchInit.emberBore.addPages((new EntryPageText("knowledge.ember_bore.1")));

        ResearchInit.crystallizedEmber.addPages((new EntryPageText("knowledge.ember.1")));

        ResearchInit.emberActivator.addPages((new EntryPageText("knowledge.ember_activator.1")));

        ResearchInit.pressureRefinery.addPages((new EntryPageText("knowledge.pressure_refinery.1")));

        ResearchInit.miniBoiler.addPages((new EntryPageText("knowledge.mini_boiler.1")));

        ResearchInit.reactionChamber.addPages((new EntryPageText("knowledge.reaction_chamber.1")));

        ResearchInit.mechanicalCore.addPages(new EntryPageText("knowledge.mechanical_core.1"));
        ResearchInit.emberTransfer.addPages(new EntryPageText("knowledge.ember_transfer.1"));
        ResearchInit.emberTransfer.addPages(new EntryPageText("knowledge.ember_transfer.2"));
        ResearchInit.melter.addPages(new EntryPageText("knowledge.melter.1"));
        ResearchInit.stamper.addPages(new EntryPageText("knowledge.stamper.1"));
    }
}
