package com.andrucz.predicate.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.andrucz.predicate.Predicate;

import static com.andrucz.commons.check.Checks.*;

public abstract class CompositePredicate<E> extends Predicate<E> {

	protected final List<Predicate<E>> predicates;
	
	public CompositePredicate(Collection<Predicate<E>> predicates) {
		checkNotNull(predicates, "predicates");
		checkNotEmpty(predicates, "predicates");
		
		this.predicates = new ArrayList<Predicate<E>>(predicates.size());
		
		for (Predicate<E> predicate : predicates) {
			addPredicate(predicate);
		}
	}
	
	public CompositePredicate(Predicate<E> first, Predicate<E>... predicates) {
		checkNotEmpty(predicates, "predicates");
		
		this.predicates = new ArrayList<Predicate<E>>(predicates.length);

		addPredicate(first);
		
		for (Predicate<E> predicate : predicates) {
			addPredicate(predicate);
		}
	}
	
	private final void addPredicate(Predicate<E> predicate) {
		checkNotNull(predicate, "predicate");
		predicates.add(predicate);
	}
	
}
