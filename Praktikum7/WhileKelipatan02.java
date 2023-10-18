import java.util.Scanner;
public class WhileKelipatan02 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int bilangan, total, counter;
    total = 0;
    counter = 0;

    int i = 1;

    System.out.println("Masukkan bilangan 1-9 : ");
    bilangan = input.nextInt();

        while (i < 50) {
            if (i% bilangan == 0)
                total += i;
                ++counter;
                ++i;
        }
        System.out.printf("pada rentang 1-5 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    
        input.close();
    }
    
    }