package fetch.patches.constructor;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Seek;
import com.megacrit.cardcrawl.localization.CardStrings;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.blue.Seek", method="<ctor>")
public class SeekPatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings SeekStrings = fetchLocalizer.getFetchCardStrings("Seek");
	
	public static void Postfix(Seek __instance)
	{
		__instance.rawDescription = SeekStrings.DESCRIPTION;
		__instance.initializeDescription();
	}	
}
