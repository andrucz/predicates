package com.andrucz.predicate.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.andrucz.predicate.ParameterizedPredicate;

public final class MatchesPredicate extends ParameterizedPredicate<String, String> {

	private final Pattern pattern;
	
	public MatchesPredicate(String arg) {
		super(arg);
		this.pattern = Pattern.compile(arg);
	}

	@Override
	public boolean accept(String element) {
		Matcher matcher = pattern.matcher(element);
		return matcher.matches();
	}

}
