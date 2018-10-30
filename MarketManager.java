public class MarketManager {

    //1.most expensive item
    static String biggestPrice(Market market) {
        double max;
        String answer = null;
        int len = market.itemsLength;
        max = market.items[0].price;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (market.items[i].price > max) max = market.items[i].price;
                answer = market.items[i].price + " dollars for the " + market.items[i].name;
            }
            if (market.items[i].price > market.items[i + 1].price) {
                if (market.items[i].price > max) max = market.items[i].price;
                answer = market.items[i].price + " dollars for the " + market.items[i].name;
            }
            if (market.items[i].price < market.items[i + 1].price) {
                if (market.items[i + 1].price > max) max = market.items[i + 1].price;
                answer = market.items[i + 1].price + " dollars for the " + market.items[i + 1].name;
            }
        }
        return answer;
    }

    //2.A method that takes as parameter a Market and returns the average price of Items from the market
    static String averagePrice(Market market) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < market.itemsLength; i++) {
            sum = sum + market.items[i].price;
            average = sum / market.itemsLength;
        }
        String answer = "The average of the market is " + average + ".";
        return answer;
    }

    //3.inlocuim itemul din market de pe pozitia data in metoda
    static void replaceItem(Market market, Item newItem, int index) {
        if (index <= market.items.length) {
            market.items[index] = newItem;
        }

        System.out.println("The new item on position " + index + " is: ");
        newItem.displayDetail();
    }

}
