public class Main {
    public static void main(String args[]) {
        Card card1 = new MemberCard("112", "Chi", "09/10/2020", 150);
        Card card2 = new VipCard("113", "Nam", "10/10/2018", 150, 3);
        CardList.addCard(card1);
        CardList.addCard(card2);
        CardList.addFeeToCard("Chi", 250);
        CardList.printCardNotUsedInOneYear();
    }
}
