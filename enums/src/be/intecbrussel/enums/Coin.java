package be.intecbrussel.enums;

public enum Coin {
    ONE_CENT(.01), TWO_CENT(.02), FIVE_CENT(.05), TEN_CENT(.1), TWENTY_CENT(.2), FIFTY_CENT(.5), ONE_EURO(1), TWO_EURO(2);

    private double value;

    private Coin(){

    }

    private Coin(double value){
        this.value = value;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
