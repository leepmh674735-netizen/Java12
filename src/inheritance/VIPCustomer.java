package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;
    
    public VIPCustomer() {
        super(0, "미정");
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer(int, String, int) 호출됨");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
    
    public int getAgentID() {
        return agentID;
    }
    
    @Override
    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}