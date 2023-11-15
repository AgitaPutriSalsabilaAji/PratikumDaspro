import java.util.Scanner;
public class Triangle02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 0;

    System.out.print("Masukkan jumlah *: ");
    int n = sc.nextInt();
    
    while (i <= 5) {
        int j = 1;
        
        while (j <= i) {
            System.out.print("*");
            j++;
        }
        System.out.println("*");
        i++;
    }
    }
}