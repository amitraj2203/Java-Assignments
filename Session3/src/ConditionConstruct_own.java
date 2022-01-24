import java.util.Scanner;

public class ConditionConstruct_own {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.print("Enter the Prome Code: ");
		int promoCode = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("You entered Amount: " +amount +"  |  " + "Promocode: " +promoCode);
		
		final int JUMBO = 101;    // Flat 50% Off for orders value worth more or equal than 200
		final int ZOMHELLO = 201; // Flat 40% Off upto 80 order value worth more or equal than 159
		
		double discount = 0;
		
		switch(promoCode) {
		
		case JUMBO:
//			if(amount>=200) {
//				discount = 0.5 * amount;
//				System.out.println("Discount is: \u20b9"+discount);
//				System.out.println("JUMBO applied successfully");
//			}else {
//				System.out.println("Amount is lesser. Please add items worth "+(200-amount)+ "more");
//			}
//							
//			break;
			String result = (amount>=200) ?"Discount is: \u20b9"+(discount=0.5*amount) +  
                                           " JUMBO applied successfully" : 
            	                           "Amount is lesser. Please add items worth "+(200-amount)+ "more";
					
			System.out.println(result);
			break;

			
		case ZOMHELLO:
//			if(amount>=159) {
//				discount = 0.4 * amount;
//				
//				if(discount > 80) {
//					discount = 80;
//				}
//				System.out.println("Discount is: \u20b9"+discount);
//				System.out.println("ZOMHELLO applied successfully");
//			}else {
//				System.out.println("Amount is lesser. Please add items worth "+(159-amount)+ " more");
//			}
//			
//			break;
			
			String result1 = (amount>=159) ?"Discount is: \u20b9"+(discount=0.4*amount) +  
                    " ZOMHELLO applied successfully" : 
                    "Amount is lesser. Please add items worth "+(159-amount)+ "more";
			
			System.out.println(result1);
			break;
			
			default:
				System.out.println("Promo Code Invalid");
		}
		
		amount -= discount;
		System.out.println("Please pay final amount: \u20b9" +amount);
		
	}

}
