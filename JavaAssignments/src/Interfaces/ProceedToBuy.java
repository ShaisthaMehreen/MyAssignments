package Interfaces;

import java.util.Scanner;

public class ProceedToBuy {

	public static void main(String[] args) {

	Payment buy = null;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please select your payment type = 1.Credit card, 2.UPI, 3.NetBanking, 4.CashonDelivery ");
		
	int payment = scanner.nextInt();
	
	switch(payment) {
	case 1: 
		buy= new CreditCard();
		buy.pay(86329);
		break;
	
	case 2:
		
		buy= new UPI();
		buy.pay(86329);
		break;
	
	case 3: 
		buy= new NetBanking();
		buy.pay(86329);
		break;
		
	case 4:
		
		buy= new CashOnDelivery();
		buy.pay(86329);
		break;
		
	default:
		System.out.println("Please select a valid option");
	
		}
	}

}
