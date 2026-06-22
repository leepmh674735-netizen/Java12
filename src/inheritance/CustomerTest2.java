package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		
		System.out.println(vc.getCustomerName() + "님의 지불해야 하는 금액은 " 
		+ vc.calcPrice(10000) + "원입니다.");
		
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
