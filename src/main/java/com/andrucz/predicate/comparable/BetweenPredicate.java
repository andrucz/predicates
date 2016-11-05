package com.andrucz.predicate.comparable;

import com.andrucz.predicate.Predicate;

public final class BetweenPredicate<E extends Comparable<E>> extends Predicate<E> {

	private final E left;
	private final E right;

	public BetweenPredicate(E left, E right) {
		if (left == null) {
			throw new NullPointerException("left");
		}
		if (right == null) {
			throw new NullPointerException("right");
		}
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean accept(E element) {
		return element.compareTo(left) >= 0 && element.compareTo(right) <= 0;
	}

}
