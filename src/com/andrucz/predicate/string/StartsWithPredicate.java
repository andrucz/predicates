package com.andrucz.predicate.string;

import com.andrucz.predicate.ParameterizedPredicate;

public final class StartsWithPredicate extends ParameterizedPredicate<String, String> {

	public StartsWithPredicate(String arg) {
		super(arg);
	}

	@Override
	public boolean accept(String element) {
		return element.startsWith(arg);
	}

}
