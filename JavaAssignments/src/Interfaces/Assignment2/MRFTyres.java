package Assignment2;

import java.util.Scanner;

public class MRFTyres implements TyresInterface {
	

	@Override
	public void rimSize() {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Select the rim size required \n 1.11inches \n 2.15inches \n 3.20inches");
		
		int selectedRimSize = scanner.nextInt();
		
		if(selectedRimSize==1) {
		
			System.out.println("Price for 11 inches is 2900");
		}
		
		else if(selectedRimSize==2) {
			System.out.println("Price for 15 inches is 3300");
		}
		
		else {
			System.out.println("Price for 20 inches is 8800");
		}			

	}
	
	@Override
	public void brandType() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Select the brand of the vehicle \n 1.Maruti \n 2.Creta \n 3.Tata");
		
		int selectedBrand = scanner.nextInt();
		
		if(selectedBrand==1) {
		
			System.out.println("Your brand is Maruti");
		}			
		else if(selectedBrand == 2) {
			System.out.println("Your brand is Creta");
		}
		else {
			System.out.println("Your brand is Tata");
		}
	
	}
	
	@Override
	public void noOftyres() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of tyres to order");
		
		int selectedNumberOfTyres = scan.nextInt();
		System.out.println("No of tyres are "+selectedNumberOfTyres);
		
	}
	
	@Override
	public void totalAmount(int rimSize,int noOftyres,int price) {

		System.out.println("total Amount of your order = "+rimSize*noOftyres*price);
	}	
	
}
