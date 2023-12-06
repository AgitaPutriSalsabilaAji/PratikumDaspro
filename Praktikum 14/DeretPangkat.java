public class DeretPangkat {
    public static void main(String[] args) {
        pangkat(2, 5);
    }
    static void pangkat(int x, int y) {
        int hasil = 1;

        for (int i = 0; i < y; i++) {
            hasil = hasil * x ;
            System.out.print(x);

            if (i < y - 1 ) {
                System.out.print("x");
            } else {
                System.out.print("x1");
            }
        }
        System.out.println(" = " + hasil);
    }
}
