import java.util.Scanner;
public class LinearSearch02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int[] arrayInt = new int [6];
    int key = 0, hasil = 0, array;

    System.out.print("Masukkan jumlah elemen array :");
    array = sc.nextInt();

    for (int i = 0; i < arrayInt.length; i++) {
        System.out.print("Masukkan elemen array yang ke-" + (i) + ": ");
        arrayInt[i] = sc.nextInt();
        } System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        for(int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.print("Key dalam array pada posisi indeks ke- " + hasil);
                break;
            }else{
                System.out.print("Key tidak ditemukan");
                break;
            }
        }

    }
}