package fetch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.localization.Keyword;

import basemod.BaseMod;
import basemod.interfaces.EditKeywordsSubscriber;
import fetch.localization.Localizer;

@SpireInitializer
public class FetchMod implements EditKeywordsSubscriber{
	
	public static final Logger logger = LogManager.getLogger(FetchMod.class.getName());
	private Localizer fetchLocalizer = new Localizer();
	
    public static void initialize() {
    	logger.info("FetchMod initializing");
        BaseMod.subscribe(new FetchMod());
    }
	
	@Override
	public void receiveEditKeywords() {
		logger.info("Creating Keyword");
		Keyword fetch = fetchLocalizer.getFetch();
	    BaseMod.addKeyword(fetch.NAMES, fetch.DESCRIPTION);
	}
}

