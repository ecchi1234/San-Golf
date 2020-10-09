public class Main {
    public static void main(String args[]) {
        Card card1 = new MemberCard("112", "Chi", "09/10/2020", 150);
        CardList.addCard(card1);
        CardList.addFeeToCard("Chi", 250);
        CardList.printCardNotUsedInOneYear();
    }
}
