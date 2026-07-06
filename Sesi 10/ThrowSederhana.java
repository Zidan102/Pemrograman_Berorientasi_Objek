public class ThrowSederhana {
    public static void main(String[] args) {

        int umur = 15;

        if (umur < 17) {

            throw new ArithmeticException("Belum cukup umur");
        }
        System.out.println("Boleh membuat SIM");
    }
}
