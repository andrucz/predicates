package com.andrucz.predicate.comparable;

import com.andrucz.predicate.ParameterizedPredicate;

public final class GreaterThanPredicate<E extends Comparable<E>> extends ParameterizedPredicate<E, E> {

	public GreaterThanPredicate(E arg) {
		super(arg);
	}

	@Override
	public boolean accept(E element) {
		return element.compareTo(arg) > 0;
	}

}
