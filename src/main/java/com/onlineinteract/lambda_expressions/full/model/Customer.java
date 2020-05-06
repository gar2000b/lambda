package com.onlineinteract.lambda_expressions.full.model;

public class Customer {
	String name;
	boolean purchaseFlag;
	
	public Customer(String name, boolean purchaseFlag) {
		this.name = name;
		this.purchaseFlag = purchaseFlag;
	}

	public boolean isPurchaseFlag() {
		return purchaseFlag;
	}

	public void setPurchaseFlag(boolean purchase) {
		this.purchaseFlag = purchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
