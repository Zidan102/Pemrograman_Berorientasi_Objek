public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int angka = Integer.parseInt("abc");
            int hitung = 10 / 0;
            int[] array = {1,2,3};
        } catch (NumberFormatException e)
    }
}
