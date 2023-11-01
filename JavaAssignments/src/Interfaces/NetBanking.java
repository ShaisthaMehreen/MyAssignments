package Interfaces;

public class NetBanking implements Payment {

	@Override
	public void pay(int totalAmount) {

		System.out.println("Total amount to be payed = "+totalAmount);
	
	}

	
}
