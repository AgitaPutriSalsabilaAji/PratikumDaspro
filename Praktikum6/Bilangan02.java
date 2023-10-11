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

    if (bil1 >= bil2){
        if (bil1 >= bil2){
            System.out.print("Bilangan Terbesar " + bil1);
        }else {
            System.out.print("Bilangan Terbesar " + bil3);
        }
    } else {
        if (bil1 >= bil3){
            System.out.print("Bilangan Terbesar " + bil2);
        } else {
            System.out.println("Bilangan Terbesar " + bil3);
        }
    }
    sc.close();
    }
}