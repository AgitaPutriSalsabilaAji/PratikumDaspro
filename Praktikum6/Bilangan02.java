import java.util.Scanner;
public class Bilangan02 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int bil1, bil2, bil3;

    System.out.print("Masukkan bil 1: ");
    bil1 = sc.nextInt();
    System.out.print("Masukkan bil 2: ");
    bil2 = sc.nextInt();
    System.out.print("Masukkan bil 3: ");
    bil3 = sc.nextInt();

    int max = Math.max(bil1, Math.max(bil2, bil3));

    int min = Math.min(bil1, Math.min(bil2, bil3));

    int middle = bil1 + bil2 + bil3 - max - min;
    
    System.out.println("Bilangan maksimum : " + max);
    System.out.println("Bilangan minimum : " + min);
    System.out.println("Bilangan middle : " + middle);

    sc.close();
    }
}