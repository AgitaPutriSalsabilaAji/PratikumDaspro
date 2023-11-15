import java.util.Scanner;

public class AngkaIndividu02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (n > 2): ");
        int n = scanner.nextInt();

        if (n > 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                System.out.println(); 
            }
        } else {
            System.out.println("Masukkan nilai n yang lebih besar dari 2.");
        }
    }
}
