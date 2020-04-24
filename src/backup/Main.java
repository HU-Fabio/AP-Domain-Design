package backup;

public class Main {

    public static void main(String[] args) {
        Casino casino = new Casino("Holland casino");

        Player fabio = new Player(1, "Fabio", 1000);
        Player test = new Player(2, "Test", 1000);

        Blackjack BJGame = new Blackjack();

        Table<Blackjack> blackjack = new Table<Blackjack>(1, BJGame);

        blackjack.addPlayer(fabio);
        blackjack.addPlayer(test);

        blackjack.type.askBets(blackjack.getPlayers().size());

        System.out.println(blackjack);

    }

}
