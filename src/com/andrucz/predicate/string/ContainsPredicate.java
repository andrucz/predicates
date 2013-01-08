package com.andrucz.predicate.string;

import com.andrucz.predicate.ParameterizedPredicate;

public final class ContainsPredicate extends ParameterizedPredicate<String, String> {

	public ContainsPredicate(String arg) {
		super(arg);
	}

	@Override
	public boolean accept(String element) {
		return element.contains(arg);
	}

}
