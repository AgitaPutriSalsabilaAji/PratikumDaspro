import java.util.Scanner;
public class WhileKelipatan02 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int bilangan, total, counter;
    total = 0;
    counter = 0;

    System.out.println("Masukkan bilangan 1-9 : ");
    bilangan = input.nextInt();

    int i = 0;

    while (i < 50){
        if (i % bilangan == 0)
        total += i;
    }
    input.close();
    }
}