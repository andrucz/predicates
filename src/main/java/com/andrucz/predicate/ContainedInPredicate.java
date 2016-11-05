package com.andrucz.predicate;

import java.util.Collection;

public final class ContainedInPredicate<E> extends ParameterizedPredicate<E, Collection<E>> {

	public ContainedInPredicate(Collection<E> arg) {
		super(arg);
	}

	@Override
	public boolean accept(E element) {
		return arg.contains(element);
	}

}
