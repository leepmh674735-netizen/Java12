package witharraylist;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}