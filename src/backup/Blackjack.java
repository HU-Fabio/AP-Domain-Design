package backup;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    private ArrayList<String> dealerCards;
    private ArrayList<String> playerCards;
    private ArrayList<Integer> bets;

    /*
    Ask the player what they wanna bet
    then load all the cards after all the bets are collected
     */

    public Blackjack() {
        this.dealerCards = new ArrayList<String>();
        this.playerCards = new ArrayList<String>();
        this.bets = new ArrayList<Integer>();
    }

    public ArrayList<String> getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(ArrayList<String> dealerCards) {
        this.dealerCards = dealerCards;
    }

    public ArrayList<String> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<String> playerCards) {
        this.playerCards = playerCards;
    }

    public ArrayList<Integer> getBets() {
        return bets;
    }

    public void askBets(int playerCount) {
        for(int i = 0; i < playerCount; i++) {
            Scanner betAmount = new Scanner(System.in);
            System.out.println("Hoeveel wil je bieden?");

            Integer amount = betAmount.nextInt();

            this.addBet(amount);
        }
    }

    public void addBet(Integer amount) {
        this.bets.add(amount);
    }

    @Override
    public String toString() {
        return "backup.Blackjack{" +
                "dealerCards=" + dealerCards +
                ", playerCards=" + playerCards +
                ", bets=" + bets +
                '}';
    }
}
