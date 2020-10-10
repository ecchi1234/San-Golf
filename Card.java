import java.time.*; // import the LocalDate class
public abstract class Card{
    private String memberCode;
    private String memberName;
    private String lastDayUsing;
    private double totalMoney;

    public Card() {

    }

    public Card(String memberCode, String memberName, String lastDayUsing, double totalMoney) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.lastDayUsing = lastDayUsing;
        this.totalMoney = totalMoney;
    }

    public String getMemberCode() {
        return this.memberCode;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public String getLastDayUsing() {
        return this.lastDayUsing;
    }

    public double getTotalMoney() {
        return this.totalMoney;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setLastDayUsing (String lastDayUsing) {
        this.lastDayUsing = lastDayUsing;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void useService(double serviceFee) {
        this.totalMoney += serviceFee;
    }

    public void getInformation() {
        System.out.printf("Ma the: %s\n", memberCode);
        System.out.printf("Ten thanh vien: %s\n", memberName);
        System.out.printf("Lan cuoi su dung dich vu: %s\n", lastDayUsing);
        System.out.printf("Tong tien da su dung dich vu: %.2f\n", totalMoney);
    }

    public int getYearLastUse() {
        return Integer.parseInt(lastDayUsing.substring(6));
    }

    public int getMonthLastUse() {
        return Integer.parseInt(lastDayUsing.substring(3, 5));
    }

    public int getDayLastUse() {
        return Integer.parseInt(lastDayUsing.substring(0, 2));
    }

    public abstract Card convertCard();

    public boolean checkUseInOneYear() {
        LocalDate myDate = LocalDate.now();
        LocalDate lastUse = LocalDate.of(this.getYearLastUse(), this.getMonthLastUse(), this.getDayLastUse());
        Period diff = Period.between(lastUse, myDate); 
        return (diff.getYears() >= 1);
    }

    public void resetTotalMoney() {
        if (!this.checkUseInOneYear()) {
            this.setTotalMoney(0);
        }
    }
}