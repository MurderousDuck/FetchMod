package fetch.patches.constructor;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.AllForOne;
import com.megacrit.cardcrawl.localization.CardStrings;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.blue.AllForOne", method="<ctor>")
public class AllForOnePatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings AllForOneStrings = fetchLocalizer.getFetchCardStrings("All For One");
	
	public static void Postfix(AllForOne __instance)
	{
		__instance.rawDescription = AllForOneStrings.DESCRIPTION;
		__instance.initializeDescription();
	}	
}