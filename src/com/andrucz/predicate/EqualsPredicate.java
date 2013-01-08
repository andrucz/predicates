package com.andrucz.predicate;

public final class EqualsPredicate<E> extends ParameterizedPredicate<E, E> {

	public EqualsPredicate(E arg) {
		super(arg);
	}

	@Override
	public boolean accept(E element) {
		if (element == null) {
			return arg == null;
		}
		return element.equals(arg);
	}

}
