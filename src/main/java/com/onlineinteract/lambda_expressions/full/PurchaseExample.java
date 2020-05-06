package com.onlineinteract.lambda_expressions.full;

import java.util.ArrayList;
import java.util.List;

import com.onlineinteract.lambda_expressions.full.model.Customer;

/**
 * This example demonstrates passing in a Lambda expression as an argument.
 * 
 * It creates a collection of customers with a purchaseFlag set to determine
 * whether they eligible to make purchase.
 * 
 * We pass this to a purchase engine, and then invoke the initiatePurchase()
 * against it, which iterates through all customers and attempts to make a
 * purchase.
 * 
 * This in turn calls a private purchase() method, which is where the lambda is
 * passed. The Lambda of course conforms to a functional interface where it's
 * method is invoked as part of the purchase functionality.
 * 
 * @author gar20
 *
 */
public class PurchaseExample {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Gary", true));
		customers.add(new Customer("Barry", false));
		customers.add(new Customer("Larry", false));
		customers.add(new Customer("Harry", true));

		PurchaseEngine purchaseEngine = new PurchaseEngine(customers);
		purchaseEngine.initiatePurchases();
	}
}
