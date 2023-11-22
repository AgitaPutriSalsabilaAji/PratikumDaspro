import java.util.Scanner;

public class PemilihanOperator02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /)");
        operator = sc.next().charAt(0);

        if (angka1 < 30) {
            System.out.println("C");
        }
        if (angka1 < 50) {
            System.out.println("B");
        }

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println(angka1 + "+" + angka2 + " = " + hasil);

        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println(angka1 + "-" + angka2 + " = " + hasil);

        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println(angka1 + "*" + angka2 + " = " + hasil);

        } else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + " = " + hasil);
        } else {
            System.out.println("Operator yang dipilih tidak sesuai");
        }
        sc.close();
    }
}