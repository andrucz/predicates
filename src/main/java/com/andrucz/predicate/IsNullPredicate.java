package com.andrucz.predicate;

public final class IsNullPredicate<E> extends Predicate<E> {

	@Override
	public boolean accept(E element) {
		return element == null;
	}

}
