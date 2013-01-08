package com.andrucz.predicate.composite;

import java.util.Collection;

import com.andrucz.predicate.Predicate;

public final class AcceptCountPredicate<E> extends CompositePredicate<E> {

	private final int minAccepts;
	
	public AcceptCountPredicate(Collection<Predicate<E>> predicates, int minAccepts) {
		super(predicates);
		
		if (minAccepts < 1) {
			throw new IllegalArgumentException("minAccepts must be at least 1.");
		}
		
		if (minAccepts > predicates.size()) {
			throw new IllegalArgumentException("minAccepts cannot be greater than predicates size.");
		}
		this.minAccepts = minAccepts;
	}
	
	@Override
	public boolean accept(E element) {
		int accepts = 0;
		
		for (Predicate<E> predicate : predicates) {
			if (predicate.accept(element)) {
				accepts++;
				
				if (accepts == minAccepts) {
					return true;
				}
			}
		}
		return false;
	}

}
