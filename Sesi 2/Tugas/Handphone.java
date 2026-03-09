package Tugas;

public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public Handphone(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    String getJenisHp() {
        return this.jenis_hp;
    }

    String getTahunPembuatan() {
        return this.tahun_pembuatan + "";
    }

    public static void main(String[] args) {
        Handphone hp1 = new Handphone("Samsung", 2020);
        Handphone hp2 = new Handphone("Apple", 2021);

        System.out.println("Handphone 1:");
        System.out.println("Jenis: " + hp1.getJenisHp());
        System.out.println("Tahun Pembuatan: " + hp1.getTahunPembuatan());

        System.out.println("\nHandphone 2:");
        System.out.println("Jenis: " + hp2.getJenisHp());
        System.out.println("Tahun Pembuatan: " + hp2.getTahunPembuatan());
    }
}