public class Item {

    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetail() {
        System.out.println("The name: " + name + ";");
        System.out.println("The price: " + price + ";");
    }
}
