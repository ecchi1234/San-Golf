import java.util.ArrayList;

public class CardList {
    private static ArrayList<Card> cards = new ArrayList<Card>();

    public static void addFeeToCard(String memberName, double serviceFee) {
        for(Card c : cards) {
            if (c.getMemberName().equals(memberName)) {
                c.useService(serviceFee);
            }
        }
    }

    // In ra cac the co ngay su dung lon hon 1 nam va chuyen doi the theo dieu kien da quy dinh
    public static void printCardNotUsedInOneYear() {
        for (Card c : cards) {
            c.getInformation();
            System.out.println("The sau khi da chuyen doi: ");
            if (c instanceof MemberCard) {
                c.resetTotalMoney();
            }
            c.convertCard().getInformation();
        }
    }

    public static void addCard(Card c) {
        cards.add(c);
    }

}