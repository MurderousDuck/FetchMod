package fetch.patches.constructor;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Exhume;
import com.megacrit.cardcrawl.localization.CardStrings;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.red.Exhume", method="<ctor>")
public class ExhumePatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings ExhumeStrings = fetchLocalizer.getFetchCardStrings("Exhume");
	
	public static void Postfix(Exhume __instance)
	{
		__instance.rawDescription = ExhumeStrings.DESCRIPTION;
		__instance.initializeDescription();
	}	
}
