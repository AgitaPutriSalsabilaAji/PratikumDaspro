import java.util.Scanner;
public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    // Cek apakah baris dan kolom valid
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    } else {
                        System.out.println("Kursi tidak tersedia, Silahkan pilih yang lain");
                    }
                    break;
        
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i+1) + ", Kolom" + (j + 1) + ": ***");
                        }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }

            System.out.print("Lanjut ke menu lain? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih.");
                break;
            }
        }
    }
}
