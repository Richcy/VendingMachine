import java.util.Scanner;

public class Buy {
    public static void buy(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih item yang ingin dibeli: ");
        int inputItem = input.nextInt();
        if(inputItem == 1){
            System.out.println("Anda membeli Biskuit dengan harga Rp. 6000");
        }else if(inputItem == 2){
            System.out.println("Anda membeli Chips dengan harga Rp. 8000");
        }else if(inputItem == 3){
            System.out.println("Anda membeli Oreo dengan harga Rp. 10000");
        }else if (inputItem == 4){
            System.out.println("Anda membeli Tango dengan harga Rp. 12000");
        }else if (inputItem == 5){
            System.out.println("Anda membeli Cokelat dengan harga Rp. 15000");
        }
        System.out.println();
    }
}
