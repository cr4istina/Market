public class Main {
    public static void main(String[] args) {
        Item item = new Item("Black T-Shirt", 34.5);
        Item item1 = new Item("Rammstein T-Shirt", 40.9);
        Item item2 = new Item("Lucifer T-Shirt", 66.6);

        System.out.println("Welcome to the Market!");
        Market market = new Market();
        market.marketName = " - - - Choose your Choice - - - ";
        market.items = new Item[20];
        market.addItem(item);
        market.addItem(item1);
        market.addItem(item2);
        market.displayItems();

        System.out.print("The most expensive item is ");
        System.out.println(MarketManager.biggestPrice(market));
        System.out.println(MarketManager.averagePrice(market));

        MarketManager.replaceItem(market, new Item("Skull T-Shirt", 45.5), 3);
        System.out.println("Hope you enjoyed being with us!  :) ");

    }
}
