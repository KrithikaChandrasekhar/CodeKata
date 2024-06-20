public enum Coin {
    NICKEL(5),
    QUARTER(25),
    DIME(10),
    PENNY(1);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
