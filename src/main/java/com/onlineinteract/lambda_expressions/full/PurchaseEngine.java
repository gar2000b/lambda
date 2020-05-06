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
			purchase(customer, csr -> {
				return csr.isPurchaseFlag();
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
