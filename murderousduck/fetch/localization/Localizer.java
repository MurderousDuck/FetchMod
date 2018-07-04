package fetch.localization;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.localization.Keyword;

import basemod.BaseMod;
import basemod.ReflectionHacks;

public class Localizer {
	
	public final String PATH = "fetch/localization/";
	
	public Keyword getFetch()
	{
		return getLocalizedFetch(getLocalizedPath());
	}
	
	private Keyword getLocalizedFetch(String path)
	{
		String json = getJson(path + "FetchKeywordStrings.json");
		return BaseMod.gson.fromJson(json, Keyword.class);
	}
	
	public CardStrings getFetchCardStrings(String card)
	{		
		return getLocalizedFetchCardStrings(getLocalizedPath(), card);
	}
	
	@SuppressWarnings("unchecked")
	private CardStrings getLocalizedFetchCardStrings(String path, String card)
	{
		String json = getJson(path + "FetchCardStrings.json");
		Map<String, CardStrings> fetchCards = (Map<String, CardStrings>)BaseMod.gson.fromJson(json, getTrueType(CardStrings.class));
		return fetchCards.get(card);
	}
	
	@SuppressWarnings("rawtypes")
	private Type getTrueType(Type type)
	{
		 HashMap TypeTokens = (HashMap)ReflectionHacks.getPrivateStatic(BaseMod.class, "typeTokens");
		 return (Type)TypeTokens.get(type);
	}
	
	public String getLocalizedPath()
	{
		switch(Settings.language.toString())
		{
			default:
				return PATH + "eng/";
		}
	}
	
	public String getJson(String path)
	{
		return Gdx.files.internal(path).readString(String.valueOf(StandardCharsets.UTF_8));
	}
}
