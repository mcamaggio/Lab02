package it.polito.tdp.model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, Word> dictionary;

	public Dictionary() {
		this.dictionary = new HashMap<>();
	}
	
	public void addWord(String alienWord, String translation) {
		if(!dictionary.containsKey(alienWord))
			dictionary.put(alienWord, new Word(alienWord));
		
		dictionary.get(alienWord).addTranslations(translation);
	}
	
	public String translate(String alienword) {
		if(dictionary.containsKey(alienword))
			return dictionary.get(alienword).getTranslations();
		else
			return null;
	}
	
	public String translateWordWildCard(String alienWildCard) {
		alienWildCard = alienWildCard.replaceAll("\\?", ".");
		
		int matchCounter = 0;
		StringBuilder sb =  new StringBuilder();
		
		for (Word w : dictionary.values()) {
			if(w.getAlienword().matches(alienWildCard)) {
				matchCounter++;
				sb.append(w.getTranslations());
			}
		}
		
		if(matchCounter != 0)
			return sb.toString();
		else
			return null;
	}

}
