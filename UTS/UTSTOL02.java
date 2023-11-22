import java.util.Scanner;
public class UTSTOL02 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
    String tujuan, jenisKendaraan;
    
    double[][] tarifTol = {
        {14000, 21000, 21000, 28000, 28000}, // Tujuan Purwodadi
        {21000, 31500, 31500, 42500, 42500}, // Tujuan Lawang
    };
    
    if (tujuan.equals("purwodadi") || tujuan.equals("lawang")) {
        int tujuanKota = tujuan.equals("purwodadi") ? 0 : 1;
        System.out.print("Tujuan (purwodadi/lawang): ");
        tujuan = input.nextLine().toLowerCase();
    
    if (jenisKendaraan.equals("bus") || jenisKendaraan.equals("mobil"));
        System.out.print("Jenis Kendaraan: ");
        jenisKendaraan = input.nextLine();
        int golongan = input.nextInt();
        int jumlahGandar = 0;
        if (golongan == 1) {
            jenisKendaraan = "Mobil dan Bus";
            } else {
            jenisKendaraan = "Truk " + jumlahGandar + "gandar";

        if (golongan >= 1 && golongan <= 5) {
            System.out.print("Apakah kendaraan Dinas? (y/n): ");
            String kendaraanDinas = input.next().toLowerCase();
            double tarif = tarifTol[tujuanKota][golongan - 1];

        if (golongan > 1) {
            System.out.print("Masukkan jumlah gandar: ");
        }

        if (!kendaraanDinas.equals("y")) {
            tarif +=  tarif * 0.3; // Kendaraan Dinas
        }
            System.out.println("tarif tol ke " + tujuan + " untuk golongan " + golongan + " adalah: Rp." + tarifTol);
        }
                 
        } 
    } else {
        System.out.println("Tujuan Tidak Terdaftar");
    }
        System.out.print("Apakah ingin cek tarif kendaraan lainnya? (y/n): ");
        String lanjut = input.next().toLowerCase();

    if (lanjut.equals("y")) {
        main(args);
    } else {
        System.out.println("Terimaksih");
    }
    } 
}
