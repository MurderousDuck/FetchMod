package fetch.patches.constructor;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Hologram;
import com.megacrit.cardcrawl.localization.CardStrings;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.blue.Hologram", method="<ctor>")
public class HologramPatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings HologramStrings = fetchLocalizer.getFetchCardStrings("Hologram");
	
	public static void Postfix(Hologram __instance)
	{
		__instance.rawDescription = HologramStrings.DESCRIPTION;
		__instance.initializeDescription();
	}	
}