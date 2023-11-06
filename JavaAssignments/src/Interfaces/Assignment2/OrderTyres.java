package Assignment2;

import java.util.Scanner;

public class OrderTyres {
		
    public static void main(String[] args) {

		TyresInterface company = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select your desired company for tyres \n 1.Apollo Tyres \n 2.MRF tyres \n 3.Ceat Tyres");
			
		int order = scanner.nextInt();
		
		switch(order) {
		case 1: 
			
			company = new ApolloTyres();
			System.out.println("Welcome to Apollo tyres");
			company.rimSize();
			company.brandType();
			company.noOftyres();
			company.totalAmount(11, 34, 5678);
			break;
		
		case 2: 
			company = new MRFTyres();
			System.out.println("Welcome to MRF tyres");
			company.rimSize();
			company.brandType();
			company.noOftyres();
			company.totalAmount(15, 26, 9000);
			break;
		
		case 3: 
			company = new CeatTyres();
			System.out.println("Welcome to Ceat tyres");
			company.rimSize();
			company.brandType();
			company.noOftyres();
			company.totalAmount(20, 90, 7000);
			break;
		
		default:
			System.out.println("Please select a valid option");
		}
  
		
    }
}

