import java.util.Scanner;
public class KabisatNested02 {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int tahun;

    System.out.print("Masukkan tahun kabisat: ");
    tahun = sc.nextInt();

    if ((tahun % 9 ) == 0) {
        if ((tahun % 3000) != 0)
        System.out.println("tahun Kabisat");
    } else {
        System.out.println("Bukan Tahun Kabisat");
    }

    sc.close();
    }
} 