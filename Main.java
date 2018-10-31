public class Main {
    public static void main(String[] args) {
        Item item = new Item("Black T-Shirt", 34.5);
        Item item1 = new Item("Rammstein T-Shirt", 40.9);
        Item item2 = new Item("Lucifer T-Shirt", 66.6);
        Item item3 = new Item("Skull T-Shirt", 59.9);

        Item[] items = new Item[20];

        Market market = new Market("Clothes", items);
        market.addItem(item);
        market.addItem(item1);
        market.addItem(item2);
        market.addItem(item3);
        market.displayItems();

        System.out.println(" ");
        System.out.println("The most expensive item:");
        MarketManager.mostExpensivePrice(market).displayDetail();

        System.out.println(" ");
        System.out.println("The average of prices is:");
        System.out.println(MarketManager.averagePrice(market));

        System.out.println(" ");
        System.out.println("Instead of Skull T-Shirt, we offer");
        MarketManager.replaceItem(market, new Item("Move-On T-Shirt", 99.9), 3);

    }
}
