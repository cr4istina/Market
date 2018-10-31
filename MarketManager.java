public class MarketManager {

    //1.most expensive item
    static Item mostExpensivePrice(Market market) {
        Item max = market.items[0];
        for (int i = 0; i < market.itemsLength; i++) {
            if (max.price < market.items[i].price) {
                max = market.items[i];
            }
        }
        return max;
    }

    //2.A method that takes as parameter a Market and returns the average price of Items from the market
    static int averagePrice(Market market) {
        double sum = 0;
        double average;
        int x = 0;
        for (int i = 0; i < market.itemsLength; i++) {
            sum = sum + market.items[i].price;
            average = sum / market.itemsLength;
            x = (int) average;
        }
        return x;
    }

    //3.inlocuim itemul din market de pe pozitia data in metoda
    static void replaceItem(Market market, Item newItem, int index) {
        if (index <= market.itemsLength) {
            market.items[index] = newItem;
        }
        newItem.displayDetail();
    }

}
