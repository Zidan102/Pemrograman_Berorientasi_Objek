package produk;

class Minuman extends Produk implements Diskon {
    
    public int hitungDiskon() {
        if (qty > 5) {
            return harga * qty / 10;
        }
        return 0;
    }

    public int hitungTotal(){
        return (harga * qty) - hitungDiskon();
    }
}