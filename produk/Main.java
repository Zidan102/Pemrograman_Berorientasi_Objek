package produk;

public class Main {
    public static void main(String[] args) {
        Minuman m = new Minuman();

        m.nama = "Teh";
        m.harga = 4000;
        m.qty = 10;

        m.tampil();
        System.out.println("Total : " + m.hitungTotal());
    }
}
