import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nilaiAkhir = new int [10];
    int totalNilai = 0;
    int nilaiTertinggi = 0;
    int nilaiTerendah = 100;

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir mahasiswa ke- " + (i+1) + ":");
        nilaiAkhir[i] = input.nextInt();
        totalNilai += nilaiAkhir[i];
    }
    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke- " + (i+1) + " Lulus");
        }
        if (nilaiAkhir[i] < 70) {
            System.out.println("Mahasiswa ke- " + (i+1) + " Tidak Lulus");
        }
    }
}
}