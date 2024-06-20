import java.text.DecimalFormat;

public class VendingMachine {
    private String display;
    private int currentAmount;
    private boolean displayUpdateNeeded;

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0.00");

    public VendingMachine() {
        this.display = "INSERT COIN";
        this.currentAmount = 0;
        this.displayUpdateNeeded = false;
    }

    public void insertCoin(Coin coin) {
        if (coin == Coin.NICKEL || coin == Coin.QUARTER) {
            this.currentAmount += coin.getValue();
            this.display = "Amount: $" + formatAmount(currentAmount);
            this.displayUpdateNeeded = false;
        }
    }

    public void selectProduct(Product product) {
        if (product.getInventory() > 0) {
            if (currentAmount >= product.getPrice()) {
                this.display = "THANK YOU";
                this.currentAmount -= product.getPrice();
                this.displayUpdateNeeded = true;
            } else {
                this.display = "Amount: $" + formatAmount(currentAmount);
                this.displayUpdateNeeded = false;
            }
        } else {
            this.display = "SOLD OUT";
            this.displayUpdateNeeded = true;
        }
    }

    private void resetDisplay() {
        if (currentAmount == 0)
            this.display = "INSERT COIN";
        else
            this.display = "Amount: $" + formatAmount(currentAmount);
    }

    public String getDisplay() {
        if (displayUpdateNeeded) {
            String currentDisplay = display;
            displayUpdateNeeded = false;
            resetDisplay();
            return currentDisplay;
        }
        return display;
    }

    private String formatAmount(int amount) {
        return DECIMAL_FORMAT.format((double) amount / 100);
    }

    public void returnCoins() {
        this.display = "INSERT COIN";
        this.currentAmount = 0;
    }

    public void setInventory(Product product, int quantity) {
        product.setInventory(quantity);
    }
}
