package Sesi4Tugas;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.sukubunga();

        // Contoh penggunaan method overriding
        BankBCA bankBCA = new BankBCA();
        bankBCA.sukubunga();
        bankBCA.transferUang(150000, "1234567890", "Bank BNI");

        BankBNI bankBNI = new BankBNI();
        bankBNI.sukubunga();
        bankBNI.transferUang(250000, "0987654321", "Bank BCA");

                // Contoh penggunaan method overloading
        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "0987654321", "Bank BCA");
        bank.transferUang(500000, "1122334455", "Bank BNI", "Pembayaran tagihan listrik");

        // Contoh penggunaan method sukubunga
        bank.sukubunga();
    }
}