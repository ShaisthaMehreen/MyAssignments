package Interfaces;

public class UPI implements Payment {

	@Override
	public void pay(int totalAmount) {
		
		System.out.println("Total amount to be payed = "+totalAmount);
	
	}

}
