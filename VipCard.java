import java.time.*; // import the LocalDate class

public class VipCard extends Card{
    private int vipYear;

    public VipCard() {

    }

    public VipCard(String memberCode, String memberName, String lastDayUsing, double totalMoney, int vipYear) {
        super(memberCode, memberName, lastDayUsing, totalMoney);
        this.vipYear = vipYear;
    }

    public double getDiscount() {
        return Math.max(vipYear * 0.02, 0.2); 
    }

    public void useService(double serviceFee) {
        this.setTotalMoney(this.getTotalMoney() + (serviceFee * getDiscount())); 
    }

    public Card convertCard() { 
        if(!this.checkUseInOneYear()) {
            this.resetTotalMoney();
            return new MemberCard(this.getMemberCode(), this.getMemberName(), this.getLastDayUsing(), this.getTotalMoney());
        }
        else {
            return this;
        }
    }

    public void getInformation() {
        System.out.println("The loai VIP");
        super.getInformation();
        System.out.printf("So nam lam VIP: %d\n", this.vipYear);
    }
}
