public class Generic {

    static class DataStore<T> {
        private T data;

        public void simpan(T data) {
            this.data = data;
        }
        public T ambil() {
            return data;
        }
    }

    public static void main(String[] args) {
        DataStore<String> KodePromo = new DataStore<>();
        KodePromo.simpan("HEMAT10");

        DataStore<Integer> poin = new DataStore<>();
        poin.simpan(250);

        System.out.println("Kode Promo Aktif: " + KodePromo.ambil());
        System.out.println("Poin Loyalti: " + poin.ambil());
    }
}