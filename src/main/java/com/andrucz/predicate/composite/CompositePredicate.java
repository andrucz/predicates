package com.andrucz.predicate.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.andrucz.predicate.Predicate;

public abstract class CompositePredicate<E> extends Predicate<E> {

	protected final List<Predicate<E>> predicates;

	public CompositePredicate(Collection<Predicate<E>> predicates) {
		if (predicates == null) {
			throw new NullPointerException("predicates");
		}
		if (predicates.isEmpty()) {
			throw new IllegalArgumentException("predicates cannot be empty");
		}
		if (predicates.size() == 1) {
			throw new IllegalArgumentException("at least two predicates are required to build a composite predicate.");
		}

		this.predicates = new ArrayList<Predicate<E>>(predicates.size());

		for (Predicate<E> predicate : predicates) {
			addPredicate(predicate);
		}
	}

	public CompositePredicate(Predicate<E> first, Predicate<E>... predicates) {
		if (first == null) {
			throw new NullPointerException("first");
		}
		if (predicates == null || predicates.length == 0) {
			throw new IllegalArgumentException("at least two predicates are required to build a composite predicate.");
		}

		this.predicates = new ArrayList<Predicate<E>>(1 + predicates.length);
		this.predicates.add(first);

		for (Predicate<E> predicate : predicates) {
			addPredicate(predicate);
		}
	}

	private final void addPredicate(Predicate<E> predicate) {
		if (predicate == null) {
			throw new NullPointerException("predicate");
		}
		predicates.add(predicate);
	}

}
