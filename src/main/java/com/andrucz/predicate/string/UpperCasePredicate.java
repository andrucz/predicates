package com.andrucz.predicate.string;

import com.andrucz.predicate.Predicate;

public final class UpperCasePredicate extends Predicate<String> {

	@Override
	public boolean accept(String element) {
		for (int i = 0; i < element.length(); i++) {
			char ch = element.charAt(i);
			
			if (!Character.isUpperCase(ch)) {
				return false;
			}
		}
		
		return true;
	}

}
