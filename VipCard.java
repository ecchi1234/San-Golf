public class VipCard extends Card{
    private int vipYear;

    public double getDiscount() {
        return Math.max(vipYear * 0.02, 0.2); 
    }

    public void useService(double serviceFee) {
        this.totalMoney += serviceFee * getDiscount();
    }
}
