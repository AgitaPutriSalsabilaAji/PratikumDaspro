import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nilaiAkhir = new int[11];
    for (int i = 1; i < 11; i++) {
        System.out.print("Masukkan nilai akhir mahsiswa ke-" + (i) + ": ");
    int[] nilaiAkhir = new int[10];
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir mahsiswa ke-" + (i+1) + ": ");
        nilaiAkhir[i] = sc.nextInt();
    }
    for (int i = 1; i < 11; i++) {
        System.out.println("Nilai akhir mahasiswa ke-" + (i) + "adalah" + nilaiAkhir[i]);
    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + (i+1) + " lulus ");
        } else if (nilaiAkhir[i] < 70) {
            System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus ");
        }
    }
    }
}
    }
}