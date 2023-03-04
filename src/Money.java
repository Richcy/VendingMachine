public class Money {
    public int id;
    public int currency;

    public Money() {
    }

    public Money(int id, int currency) {
        this.id = id;
        this.currency = currency;
    }

    public static void money(){
        System.out.println("Uang Kertas yang dapat diterima oleh Vending Machine: ");

        Money money1 = new Money(1, 2000);
        money1.showMoney();

        Money money2 = new Money(2, 5000);
        money2.showMoney();

        Money money3 = new Money(3, 10000);
        money3.showMoney();

        Money money4 = new Money(4, 20000);
        money4.showMoney();

        Money money5 = new Money(5, 50000);
        money5.showMoney();

        System.out.println();
    }

    public void showMoney(){
        System.out.println("Money Id: "+ id +"\t, Currency: "+ currency);
    }
}
