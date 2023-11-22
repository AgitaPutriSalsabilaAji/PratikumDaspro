import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] tarifTol = {
                { 14000, 21000, 21000, 28000, 28000 }, // Tujuan Purwodadi
                { 21000, 31500, 31500, 42500, 42500 } // Tujuan Lawang
        };

        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan tujuan (purwodadi/lawang): ");
            String tujuan = input.nextLine().toLowerCase();
            int golongan;

            if (tujuan.equals("purwodadi") || tujuan.equals("lawang")) {
                int tujuanIndex = tujuan.equals("purwodadi") ? 0 : 1;

                System.out.print("Masukkan golongan kendaraan (1/2/3/4/5): ");
                while (!input.hasNextInt()) {
                    System.out.println("Masukan tidak valid. Harap masukkan angka.");
                    input.next();
                }
                golongan = input.nextInt();

                if (golongan >= 1 && golongan <= 5) {
                    System.out.print("Apakah kendaraan dinas? (y/n): ");
                    String kendaraanDinas = input.next().toLowerCase();
                    double tarif = tarifTol[tujuanIndex][golongan - 1];

                    if (kendaraanDinas.equals("n")) {
                        tarif += tarif * 0.3;
                    }

                    System.out.println("Tujuan: " + tujuan);
                    System.out.println("Jenis Kendaraan: Golongan " + golongan);
                    System.out.println("Apakah kendaraan dinas?: " + (kendaraanDinas.equals("n") ? "Ya" : "Tidak"));
                    System.out.println("Jumlah Tarif: " + tarif);

                    if (golongan == 1) {
                        System.out.println("Golongan 1 tidak memiliki gandar.");
                    } else {
                        System.out.println("Jumlah Gandar: " + golongan);
                    }
                } else {
                    System.out.println("Golongan kendaraan tidak valid.");
                }
            } else {
                System.out.println("Tujuan tidak terdaftar.");
            }

            System.out.print("Apakah Anda ingin mengecek tarif kendaraan lainnya? (ya/tidak): ");
            String inputLanjut = input.next().toLowerCase();
            while (!inputLanjut.equals("ya") && !inputLanjut.equals("tidak")) {
                System.out.println("Masukan tidak valid. Harap masukkan 'ya' atau 'tidak'.");
                inputLanjut = input.next().toLowerCase();
            }
            lanjut = inputLanjut.equals("ya");
            input.nextLine();
        }

        System.out.println("Terima kasih!");
    }
}