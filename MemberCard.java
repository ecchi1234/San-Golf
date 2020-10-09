public class MemberCard extends Card{
    public MemberCard() {

    }

    public MemberCard(String memberCode, String memberName, String lastDayUsing, double totalMoney) {
        super(memberCode, memberName, lastDayUsing, totalMoney);
    }

    public Card convertCard() {
        if (this.getTotalMoney() > 500) {
            return new VipCard(this.getMemberCode(), this.getMemberName(), this.getLastDayUsing(), this.getTotalMoney(), 0);
        }
        else {
            return this;
        }
    }

    public void getInformation() {
        System.out.println("The loai thanh vien");
        super.getInformation();
    }

}
