package it.polito.tdp.model;

import java.util.HashSet;
import java.util.Set;

public class Word {
	
	private String alienword;
	private Set<String> translations;
	
	public Word(String alienword) {
		super();
		this.alienword = alienword;
		this.translations = new HashSet<String>();
	}

	public String getAlienword() {
		return alienword;
	}

	public void setAlienword(String alienword) {
		this.alienword = alienword;
	}

	public String getTranslations() {
		String s = "";
		for( String a : translations)
			s += a +"\n";
		return s;
	}

	public void addTranslations(String translations) {
		this.translations.add(translations);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienword == null) ? 0 : alienword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienword == null) {
			if (other.alienword != null)
				return false;
		} else if (!alienword.equals(other.alienword))
			return false;
		return true;
	}
	
	
		
}
