package com.andrucz.predicate;

public abstract class ParameterizedPredicate<E, A> extends Predicate<E> {

	protected final A arg;
	
	protected ParameterizedPredicate(A arg) {
		this.arg = arg;
	}
	
	public A getArg() {
		return arg;
	}
	
}
