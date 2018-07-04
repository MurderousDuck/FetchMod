package fetch.patches.upgrade;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.cards.colorless.SecretWeapon;

import fetch.localization.Localizer;

@SpirePatch(cls="com.megacrit.cardcrawl.cards.colorless.SecretWeapon", method="upgrade")
public class SecretWeaponPatch {
	
	private static Localizer fetchLocalizer = new Localizer();
	private static CardStrings SecretWeaponStrings = fetchLocalizer.getFetchCardStrings("Secret Weapon");
	
	public static void Postfix(SecretWeapon __instance)
	{
		__instance.rawDescription = SecretWeaponStrings.UPGRADE_DESCRIPTION;
		__instance.initializeDescription();
	}	
}
