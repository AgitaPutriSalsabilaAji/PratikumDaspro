import java.util.Scanner;
public class KabisatNested02 {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int tahun;

    System.out.print("Masukkan tahun kabisat: ");
    tahun = sc.nextInt();

    if ((tahun % 400 ) == 0) {
        System.out.println("tahun Kabisat");
    } else if ((tahun % 100 )== 0){
        System.out.println("Bukan Tahun Kabisat");
    } else if ((tahun %4)== 0){
        System.out.println("Tahun Kabisat");
    } else 
        System.out.println("Bukan Tahun Kabisat");

    sc.close();
    }
} 