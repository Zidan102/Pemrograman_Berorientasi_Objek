class Mahasiswa {
    // ====== Atribut (property) ======
    // "private" artinya hanya bisa diakses di dalam kelas ini saja
    private String nama;
    private int umur;

    // ====== Constructor ======
    // Constructor adalah method khusus yang dipanggil saat objek dibuat
    Mahasiswa(String nama, int umur) {
        // Kata kunci "this" dipakai untuk membedakan
        // antara atribut class (this.nama) dengan parameter method (namacon)
        this.nama = nama;
        this.umur = umur;
    }

    // ======= Getter ========
    // Getter dipakai untuk "membaca"/mengambil nilai atribut
    public String getNama() {
        return this.nama; // "this.nama" merujuk pada atribut nama di class
    }

    public int getUmur() {
        return this.umur; // "this.umur" merujuk pada atribut umur di class
    }

    // ======= Setter ========
    // Setter dipakai untuk "menulis"/mengubah nilai atribut

    public void setNama(String nama) {
        // Gunakan "this" agar jelas bahwa yang kiri adalah atribut
        // yang kanan adalah parameter method
        this.nama = nama;
    }

    public void setUmur(int umur) {
        // Bisa ditambahkan logika sederhana (misalnya validasi)
        if (umur > 0) {
            this.umur = umur;
        }
    }

    // Method thambahan untuk menampilkan info mahasiswa
    public void tampilkaninfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur + " tahun");
    }
}

// Class utama yang memiliki method main (titik awal program java)
public class DemoMahasiswa {
    public static void main(String[] args) {
        // ===== Membuat objek ======
        Mahasiswa mhs1 = new Mahasiswa("Zidan", 21);
        Mahasiswa mhs2 = new Mahasiswa("Alya", 22);

        // ===== Menggunakan method getter untuk menampilkan info ======
        System.out.println("Data awal:");
        System.out.println("Mahasiswa 1: " + mhs1.getNama() + ", Umur: " + mhs1.getUmur());
        System.out.println("Mahasiswa 2: " + mhs2.getNama() + ", Umur: " + mhs2.getUmur());

        // ===== Menggunakan method setter untuk mengubah data ======
        mhs1.setNama("Zidan Alfikri");
        mhs1.setUmur(22);

        mhs2.setNama("Alya Putri");
        mhs2.setUmur(23);

        // ===== Memanggil method lain di class =======
        System.out.println("\nData setelah diubah:");
        mhs1.tampilkaninfo();
        mhs2.tampilkaninfo();

    }
}