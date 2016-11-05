package com.andrucz.predicate;

public final class AcceptAllPredicate<E> extends Predicate<E> {

	@Override
	public boolean accept(E element) {
		return true;
	}

}
