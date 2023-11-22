import java.util.Scanner;
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] tarifTol = {
            {14000, 21000, 21000, 28000, 28000},   // Tujuan Purwodadi
            {21000, 31500, 31500, 42500, 42500}  // Tujuan Lawang
        };

        System.out.print("Masukkan tujuan (purwodadi/lawang): ");
        String tujuan = input.nextLine().toLowerCase();

        System.out.print("Masukkan jenis kendaraan: ");
        String jenisKendaraan = input.next().toLowerCase();
        if (jenisKendaraan.equals("bus") || jenisKendaraan.equals("mobil")) {
            
        }


        System.out.print("Apakah kendaraan dinas? (y/n): ");
        String kendaraanPribadi = input.next().toLowerCase();      


        if (tujuan.equals("purwodadi") || tujuan.equals("lawang")) {
            int tujuanIndex = tujuan.equals("purwodadi") ? 0 : 1;
            int golongan = input.nextInt();

            if (golongan >= 1 && golongan <= 5) {
                double tarif = tarifTol[tujuanIndex][golongan - 1];

                if (!kendaraanPribadi.equals("y")) {
                    tarif += tarif * 0.3;  // Kendaraan dinas
                }

                System.out.println("Tarif tol ke " + tujuan + " untuk Golongan " + golongan + " adalah: Rp" + tarif);
            } else {
                System.out.println("Daftar kendaraan tidak valid.");
            }
        } else {
            System.out.println("Tujuan tidak terdaftar.");
        }
            System.out.print("Apakah Anda ingin mengecek tarif kendaraan lainnya? (ya/tidak): ");
            String lanjut = input.next().toLowerCase();

        if (lanjut.equals("y")) {
            main(args);
        } else {
            System.out.println("Terimaksih");
        }
    }
}