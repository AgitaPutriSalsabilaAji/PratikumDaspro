import java.util.Scanner;

public class PersegiAngka02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (ganjil, n > 2): ");
        int n = scanner.nextInt();

        if (n > 2 && n % 2 == 1) {
            int[][] kotak = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    kotak[i][j] = 3;
                }
            }

            for (int i = 1; i < n / 2; i++) {
                for (int j = i; j < n - i; j++) {
                    kotak[i][j] = 5;
                    kotak[n - 1 - i][j] = 5;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(kotak[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai n yang ganjil dan lebih besar dari 2.");
        }
    }
}
