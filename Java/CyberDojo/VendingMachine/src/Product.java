public enum Product {
    CHIPS(50, 10),
    CANDY(65, 5),
    COLA(1, 2);

    private final int price;
    private int quantity;

    Product(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getInventory() {
        return quantity;
    }

    public void decrementInventory() {
        if (quantity > 0)
            quantity--;
    }

    public void setInventory(int quantity) {
        this.quantity = quantity;
    }
}
