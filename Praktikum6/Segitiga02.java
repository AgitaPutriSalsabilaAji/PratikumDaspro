import java.util.Scanner;
public class Segitiga02 {
    public static void main(String []args) {
    Scanner sc = new Scanner (System.in);
    int sudut1, sudut2, sudut3;
    double totalSudut;

    System.out.print("Masukkan sudut1: ");
    sudut1 = sc.nextInt();
    System.out.print("Masukkan sudut2: ");
    sudut2 = sc.nextInt();
    System.out.print("Masukkan sudut3: ");
    sudut3 = sc.nextInt();

    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if ((sudut1 == 90 ) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        else 
            System.out.println("Segitiga tersebut adlah bukan segitiga siku-siku");
    } else 
        System.out.println("Bukan Segitiga");

    sc.close();
    }

}