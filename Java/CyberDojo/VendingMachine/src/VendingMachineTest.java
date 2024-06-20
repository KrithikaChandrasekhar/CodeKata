import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    @Test
    public void testInitialDisplay() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("INSERT COIN", vendingMachine.getDisplay());
    }

    @Test
    public void testInsertNickelAndUpdateDisplay() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(Coin.NICKEL);
        assertEquals("Amount: $0.05", vendingMachine.getDisplay());
    }

    @Test
    public void testSelectChipsWithExactChange() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.selectProduct(Product.CHIPS);
        assertEquals("THANK YOU", vendingMachine.getDisplay());
        assertEquals("INSERT COIN", vendingMachine.getDisplay());
    }

    @Test
    public void testMakeChangeForCandy() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.selectProduct(Product.CANDY);
        assertEquals("THANK YOU", vendingMachine.getDisplay());
        assertEquals("Amount: $0.10", vendingMachine.getDisplay());
    }

    @Test
    public void testReturnCoins() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.returnCoins();
        assertEquals("INSERT COIN", vendingMachine.getDisplay());
    }

    @Test
    public void testProductSoldOut() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setInventory(Product.COLA, 0);
        vendingMachine.selectProduct(Product.COLA);
        assertEquals("SOLD OUT", vendingMachine.getDisplay());
    }
}
