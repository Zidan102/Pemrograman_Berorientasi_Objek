public class Arithmetic1 {
    public static void main(String[] args) {


        try {
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi nol");
        }
        System.out.println("Program selesai");
    }
}