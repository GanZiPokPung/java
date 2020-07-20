import javax.swing.JOptionPane;
public class Project1 {

	public static void main(String[] args) {
		
		String buyer = JOptionPane.showInputDialog("Input a cost");
		int buyerCost = Integer.parseInt(buyer);
		
		int supplyCost = 10000;
		
		// 국세청 세금
		int vat = supplyCost / 10;
		int sellerCost = buyerCost - vat;
		System.out.println("VAT : " + vat + "\n");
		
		double expense = sellerCost * (3.0 / 10.0);
		int income = sellerCost - (int)expense;
		System.out.println("Expense : " + expense + ", Income : " + income + "\n");
		
		int divide_slide_value = income / 10;
		
		int divide_to_five = divide_slide_value * 5;
		int divide_to_three = divide_slide_value * 3;
		int divide_to_two = divide_slide_value * 2;
		
		System.out.println("Output\nFive : " + divide_to_five + 
				", Three : " + divide_to_three + ", Two : " + divide_to_two);
	}

}
