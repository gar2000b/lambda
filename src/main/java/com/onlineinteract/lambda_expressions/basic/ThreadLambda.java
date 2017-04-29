package com.onlineinteract.lambda_expressions.basic;

/**
 * Creating threads with Lambdas.
 * 
 * @author Digilogue
 *
 */
public class ThreadLambda {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Declare and implement type using a lambda
		 */
		Runnable runnableLambda = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};

		/**
		 * Pass the type as normal into method.
		 */
		Thread t1 = new Thread(runnableLambda);
		t1.start();
		t1.join();

		/**
		 * Or simply declare and implement type in-line using lambda.
		 */
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		});
		t2.start();
		t2.join();

		/**
		 * Or be even more crazy and just spawn off a thread with one
		 * statement
		 */
		new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}).start();

	}
}
