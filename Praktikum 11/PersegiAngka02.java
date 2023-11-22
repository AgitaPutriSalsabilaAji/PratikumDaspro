import java.util.Scanner;
public class PersegiAngka02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        if (n % 2 == 0 || n <= 2) {
            System.out.println("input tidk valid");
        } 
    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n && j > 1 && j < n) {
                    System.out.print("  ");
                } else {
                    System.out.print(n + " ");
                }
            }System.out.println();
        }
    }
}