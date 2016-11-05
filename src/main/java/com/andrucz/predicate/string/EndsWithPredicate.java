package com.andrucz.predicate.string;

import com.andrucz.predicate.ParameterizedPredicate;

public final class EndsWithPredicate extends ParameterizedPredicate<String, String> {

	public EndsWithPredicate(String arg) {
		super(arg);
	}

	@Override
	public boolean accept(String element) {
		return element.endsWith(arg);
	}

}
