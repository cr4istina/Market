public class Item {

    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetail() {
        System.out.print("The name: " + name + ", ");
        System.out.println("price: " + price + ";");
    }
}
