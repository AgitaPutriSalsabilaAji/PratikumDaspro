import java.util.Scanner;
public class Segitiga02 {
    public static void main(String []args) {
    Scanner sc = new Scanner (System.in);
    int sudut1, sudut2, sudut3;

    System.out.print("Masukkan sudut1: ");
    sudut1 = sc.nextInt();
    System.out.print("Masukkan sudut2: ");
    sudut2 = sc.nextInt();
    System.out.print("Masukkan sudut3: ");
    sudut3 = sc.nextInt();

    if (sudut1 == sudut2 && sudut2 == sudut3) {
        System.out.println("Segitiga Sama Sisi");
    } else if (sudut1 == sudut2 || sudut2 == sudut3) {
        System.out.println("Segitiga Sama Kaki");
    } else {
        System.out.println("Segitiga Sembarang");
    }
    sc.close();
    }

}