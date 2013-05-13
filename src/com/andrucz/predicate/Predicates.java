package com.andrucz.predicate;

import java.util.Collection;

import com.andrucz.predicate.comparable.BetweenPredicate;
import com.andrucz.predicate.comparable.EqualsToPredicate;
import com.andrucz.predicate.comparable.GreaterThanPredicate;
import com.andrucz.predicate.comparable.LessThanPredicate;
import com.andrucz.predicate.composite.AcceptCountPredicate;
import com.andrucz.predicate.composite.AnyPredicate;
import com.andrucz.predicate.composite.EveryPredicate;
import com.andrucz.predicate.string.ContainsPredicate;
import com.andrucz.predicate.string.EndsWithPredicate;
import com.andrucz.predicate.string.LowerCasePredicate;
import com.andrucz.predicate.string.MatchesPredicate;
import com.andrucz.predicate.string.StartsWithPredicate;
import com.andrucz.predicate.string.UpperCasePredicate;

public final class Predicates {
	
	private Predicates() {
	}
	
	public static <E> AcceptAllPredicate<E> acceptAll() {
		return new AcceptAllPredicate<E>();
	}
	
	public static <E> ContainedInPredicate<E> containedIn(Collection<E> arg) {
		return new ContainedInPredicate<E>(arg);
	}
	
	public static <E> EqualsPredicate<E> equalsTo(E arg) {
		return new EqualsPredicate<E>(arg);
	}
	
	public static <E> IsNullPredicate<E> isNull() {
		return new IsNullPredicate<E>();
	}
	
	public static <E> NotPredicate<E> not(Predicate<E> predicate) {
		return new NotPredicate<E>(predicate);
	}
	
	/*
	 * Comparable
	 */
	
	public static <E extends Comparable<E>> EqualsToPredicate<E> equalsTo(E arg) {
		return new EqualsToPredicate<E>(arg);
	}
	
	public static <E extends Comparable<E>> GreaterThanPredicate<E> greaterThan(E arg) {
		return new GreaterThanPredicate<E>(arg);
	}

	public static <E extends Comparable<E>> LessThanPredicate<E> lessThan(E arg) {
		return new LessThanPredicate<E>(arg);
	}
	
	public static <E extends Comparable<E>> BetweenPredicate<E> between(E left, E right) {
		return new BetweenPredicate<E>(left, right);
	}
	
	/*
	 * Composite
	 */
	
	public static <E> AcceptCountPredicate<E> acceptCount(Collection<Predicate<E>> predicates, int minAccepts) {
		return new AcceptCountPredicate<E>(predicates, minAccepts);
	}
	
	public static <E> AnyPredicate<E> any(Predicate<E> first, Predicate<E>... predicates) {
		return new AnyPredicate<E>(first, predicates);
	}
	
	public static <E> EveryPredicate<E> every(Predicate<E> first, Predicate<E>... predicates) {
		return new EveryPredicate<E>(first, predicates);
	}
	
	/*
	 * String
	 */
	
	public static ContainsPredicate contains(String arg) {
		return new ContainsPredicate(arg);
	}
	
	public static EndsWithPredicate endsWith(String arg) {
		return new EndsWithPredicate(arg);
	}
	
	public static LowerCasePredicate isLower() {
		return new LowerCasePredicate();
	}
	
	public static StartsWithPredicate startsWith(String arg) {
		return new StartsWithPredicate(arg);
	}
	
	public static UpperCasePredicate isUpper() {
		return new UpperCasePredicate();
	}
	
	public static MatchesPredicate matches(String arg) {
		return new MatchesPredicate(arg);
	}
}
