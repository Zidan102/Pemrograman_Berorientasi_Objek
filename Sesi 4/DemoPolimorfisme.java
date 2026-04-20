// SUPER CLASS
class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String tampilInfo() {
        return "Nama Produk: " + nama + ", Harga: " + harga;
    }
}

// SUB CLASS 1
class ProdukFisik extends Produk {
    protected double beratKg;
    
    public ProdukFisik(String nama, int harga, double beratKg) {
        super(nama, harga);
        this.beratKg = beratKg;
    }

    @Override
    public String tampilInfo() {
        return "[FISIK] " + super.tampilInfo() + ", Berat: " + beratKg + " kg";
    }
}

// SUB CLASS 2
class ProdukDigital extends Produk {
    protected String masaAktif;

    public ProdukDigital(String nama, int harga, String masaAktif) {
        super(nama, harga);
        this.masaAktif = masaAktif;
    }

    @Override
    public String tampilInfo() {
        return "[DIGITAL] " + super.tampilInfo() + ", Masa Aktif: " + masaAktif;
    }
}

// CLASS KASIR (OVERLOADING)
class Kasir {
    // OVERLOAD 1
    public int hitungBayar(int harga, int qty) {
        return harga * qty;
    }

    // OVERLOAD 2
    public int hitungBayar(int harga, int qty, int diskonPersen) {
        int total = harga * qty;
        return (int) (total - (total * diskonPersen / 100));
    }
}

//PROGRAM UTAMA
public class DemoPolimorfisme {
    public static void main(String[] args) {
        
        System.out.println("=== DEMO OVERLOADING ===");
        System.out.println("Memanggil tampilInfo() dari masing-masing objek:\n");

        Produk p1        = new Produk("Kaos Polos", 85000);
        ProdukFisik p2   = new ProdukFisik("Sepatu Lari", 350000, 0.8);
        ProdukDigital p3 = new ProdukDigital("Microsoft 365", 600000, "1 Tahun");

        System.out.println(p1.tampilInfo());
        System.out.println(p2.tampilInfo());
        System.out.println(p3.tampilInfo());

        System.out.println("\n=== DEMO OVERLOADING ===");
        System.out.println("Memanggil hitungBayar() dengan argumen berbeda:\n");

        Kasir kasir = new Kasir();

        int total1 = kasir.hitungBayar(350000, 2);
        int total2 = kasir.hitungBayar(350000, 2, 15);

        System.out.println("Total bayar tanpa diskon: " + total1);
        System.out.println("Total bayar dengan diskon 15%: " + total2);
    }       
}