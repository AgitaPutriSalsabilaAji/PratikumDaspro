import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] nilaiAkhir = new int[11];
    for (int i = 1; i < 11; i++) {
        System.out.print("Masukkan nilai akhir mahsiswa ke-" + (i) + ": ");
        nilaiAkhir[i] = sc.nextInt();
    }
    for (int i = 1; i < 11; i++) {
        System.out.println("Nilai akhir mahasiswa ke-" + (i) + "adalah" + nilaiAkhir[i]);
    }
    }
}