package Interfaces;

public class CashOnDelivery implements Payment {

	public void pay(int totalAmount) {

		System.out.println("Total amount to be payed = "+totalAmount);
	}

}
