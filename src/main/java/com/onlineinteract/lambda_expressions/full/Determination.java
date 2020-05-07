package com.onlineinteract.lambda_expressions.full;

@FunctionalInterface
public interface Determination<T> {
	boolean determine(T t);
}
