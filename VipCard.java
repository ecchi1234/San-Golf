import java.time.LocalDate; // import the LocalDate class

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
        LocalDate myDate = LocalDate.now();
        if(myDate.getYear() != this.getYearLastUse()) {
            return new MemberCard(this.getMemberCode(), this.getMemberName(), this.getLastDayUsing(), 0);
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
