package com.andrucz.predicate;

import static com.andrucz.commons.check.Checks.checkNotNull;

public abstract class DelegatePredicate<E> extends Predicate<E> {
	
	protected final Predicate<E> delegate;
	
	protected DelegatePredicate(Predicate<E> delegate) {
		checkNotNull(delegate, "delegate");
		this.delegate = delegate;
	}

}
