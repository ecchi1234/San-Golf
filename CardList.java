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

    public static void printAll() {
        for (Card c : cards) {
            c = c.convertCard();
            c.getInformation();
        }
    }


}