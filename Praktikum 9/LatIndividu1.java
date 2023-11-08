import java.util.Scanner;
public class LatIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] Array1 = {1,2,3,4,5};
        int[] Array2 = new int[Array1.length];

        for (int i = 0; i < Array1.length; i++) {
            Array2[i] = Array1[i];
        }
        System.out.print("Array Kedua: ");
        for (int i = 0; i < Array2.length; i++) {
            System.out.print(Array2[i] + " ");
        }
    }
}