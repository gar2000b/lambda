package com.onlineinteract.lambda_expressions.full;

import java.util.List;

import com.onlineinteract.lambda_expressions.full.model.Customer;

public class PurchaseEngine {
	List<Customer> customers;

	public PurchaseEngine(List<Customer> customers) {
		this.customers = customers;
	}

	public void initiatePurchases() {
		for (Customer customer : customers) {
			/**
			 * The way I think on it is: you are passing in a reference to a functional
			 * interface, where that single function gets invoked.
			 * 
			 * The functionality/function/lambda expression itself that is passed in is
			 * actually what is being invoked.
			 * 
			 * The expression itself conforms to that single functional interface - you can
			 * see that it takes in a single argument, namely (csr), which is a Customer
			 * type. As this functional interface method expects a return value of boolean,
			 * we can leave it as is as we know the isPurchasedFlag() from Customer yields a
			 * boolean and because this is a single line expression, it infers that this is
			 * the return type.
			 */
			purchase(customer, csr -> csr.isPurchaseFlag());
		}

		System.out.println();
		for (Customer customer : customers) {
			/**
			 * If this, however, was a multi-line lambda expression (like the following
			 * where in this case, we are simply negating the response of our determine()
			 * implementation), then we would need to explicitly return the boolean.
			 */
			purchase(customer, csr -> {
				boolean purchaseFlag = csr.isPurchaseFlag();
				return !purchaseFlag;
			});
		}

	}

	private void purchase(Customer customer, Determination<Customer> determination) {
		boolean result = determination.determine(customer);
		if (result)
			System.out.println(customer.getName() + " made a purchase");
		else
			System.out.println(customer.getName() + " did not make a purchase");
	}
}
