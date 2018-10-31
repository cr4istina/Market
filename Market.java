public class Market {

    public String marketName;
    public Item[] items;
    public int itemsLength;

    public void addItem(Item item) {
        items[itemsLength] = item;
        itemsLength++;
    }

    void displayItems() {
        System.out.println(marketName);
        System.out.println("For now we have the specials:");
        for (int i = 0; i < itemsLength; i++) {
            if (items[i] != null) {
                items[i].displayDetail();
            }
        }
    }
}
