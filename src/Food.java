public class Food {
    public int id;
    public String name;
    public int price;
    public int stock;

    public Food() {
    }

    public Food(int id, String name, int price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void showPrice() {
        System.out.println("Food Id: " + id + "\t, Name: " + name + "\t, Price: " + price + "\t, Stock: "+ stock);
    }

    public static void food(){
        System.out.println("List Makanan dan Minuman di dalam Vending Machine ini: ");

        Food food1 = new Food(1, "Biskuit", 6000, 50);
        food1.showPrice();

        Food food2 = new Food(2, "Chips", 8000, 50);
        food2.showPrice();

        Food food3 = new Food(3, "Oreo", 10000, 50);
        food3.showPrice();

        Food food4 = new Food(4, "Tango", 12000, 50);
        food4.showPrice();

        Food food5 = new Food(5, "Cokelat", 15000, 50);
        food5.showPrice();

        System.out.println();
    }
}
