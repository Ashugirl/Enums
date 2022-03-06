package be.intecbrussel.enums;

public class CoinApp {
    public static void main(String[] args) {
        Coin[] coins = {Coin.ONE_CENT, Coin.TWO_CENT, Coin.FIVE_CENT, Coin.TEN_CENT, Coin.TWENTY_CENT, Coin.FIFTY_CENT, Coin.ONE_EURO, Coin.TWO_EURO};
        
        double sum = 0;

        for(Coin i : Coin.values()) {
            sum = sum + i.getValue();



            System.out.println("+ Coin:" + i);
            System.out.println(" = " + sum);
        }

    }
}
