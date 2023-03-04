import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean vm = true;
        while(vm){
            System.out.println("====================");
            System.out.println("Vending Machine!");
            System.out.println("Pilih Menu");
            System.out.println();
            System.out.println("1. List Makanan & Minuman");
            System.out.println("2. Beli");
            System.out.println("3. Keluar");
            System.out.println();
            int inputMenu = input.nextInt();
            if (inputMenu == 1){
                Food.food();
                Money.money();
            }else if(inputMenu == 2) {
                Buy.buy();
            }else if(inputMenu == 3) {
                System.out.println("Terima Kasih!!");
                System.out.println("====================");
                vm = false;
            }else{
                System.out.println("Input Tidak dikenali. Mohon input dengan benar.");
            }
        }
    }
}