package fetch.patches.constructor;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.cards.colorless.SecretWeapon;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.colorless.SecretWeapon", method="<ctor>")
public class SecretWeaponPatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings SecretWeaponStrings = fetchLocalizer.getFetchCardStrings("Secret Weapon");
	
	public static void Postfix(SecretWeapon __instance)
	{
		__instance.rawDescription = SecretWeaponStrings.DESCRIPTION;
		__instance.initializeDescription();
	}	
}
