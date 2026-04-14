package Sesi4Tugas;

class Bank {
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer uang sebesar " + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer uang sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer uang sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan catatan: " + berita);
    }

    void sukubunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }
}

class BankBCA extends Bank {
    @Override
    void sukubunga() {
        System.out.println("Suku bunga BCA adalah 4.5%");
    }
    
    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer uang sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " melalui BCA");
    }
}

class BankBNI extends Bank {
    @Override
    void sukubunga() {
        System.out.println("Suku bunga BNI adalah 4%");
    }
    
    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer uang sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " melalui BNI");
    }
}