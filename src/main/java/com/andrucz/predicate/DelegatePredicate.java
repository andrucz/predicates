package com.andrucz.predicate;

public abstract class DelegatePredicate<E> extends Predicate<E> {

	protected final Predicate<E> delegate;

	protected DelegatePredicate(Predicate<E> delegate) {
		if (delegate == null) {
			throw new NullPointerException("delegate");
		}
		this.delegate = delegate;
	}

}
