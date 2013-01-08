package com.andrucz.predicate;

public final class NotPredicate<E> extends DelegatePredicate<E> {

	public NotPredicate(Predicate<E> predicate) {
		super(predicate);
	}

	@Override
	public boolean accept(E element) {
		return !delegate.accept(element);
	}
	
	
	
}
