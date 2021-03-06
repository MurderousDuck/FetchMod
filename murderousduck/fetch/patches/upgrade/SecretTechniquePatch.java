package fetch.patches.upgrade;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.cards.colorless.SecretTechnique;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.colorless.SecretTechnique", method="upgrade")
public class SecretTechniquePatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings SecretTechniqueStrings = fetchLocalizer.getFetchCardStrings("Secret Technique");
	
	public static void Postfix(SecretTechnique __instance)
	{
		__instance.rawDescription = SecretTechniqueStrings.UPGRADE_DESCRIPTION;
		__instance.initializeDescription();
	}	
}