import java.util.Scanner;

public class PenggajianGuru{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hariSia, hariMasuk;
        double gajiHarian, totalGaji, gajiMasuk, gajiSia;

        gajiHarian = 150000;

        System.out.println("Masukkan gaji Harian: ");
        gajiHarian = sc.nextInt();
        System.out.println("Masukkan jumlah hari masuk: ");
        hariMasuk = sc.nextInt();
        System.out.println("Masukkan jumlah hari SIA: ");
        hariSia = sc.nextInt();

        gajiMasuk = hariMasuk * gajiHarian;
        gajiSia = hariSia * gajiHarian / 2;
        totalGaji = gajiMasuk + gajiSia;

        System.out.println("Gaji harian anda: " + gajiHarian);
        System.out.println("Total gaji anda: " + totalGaji);

        sc.close();
    }
}