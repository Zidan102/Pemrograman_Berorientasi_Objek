import java.util.ArrayList;
import java.util.ArrayDeque;

public class ContohCollection {
    public static void main(String[] args) {
        
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("Ferdi");
        daftarMahasiswa.add("Yuna");
        daftarMahasiswa.add("Andri");

        System.out.println("Daftar Mahasiswa (ArrayList): " + daftarMahasiswa);

        ArrayDeque<String> antrianKantin = new ArrayDeque<>();
        antrianKantin.addLast("Antrian 1");
        antrianKantin.addLast("Antrian 2");
        antrianKantin.addFirst("Antrian Prioritas");

        System.out.println("Antrian Kantin (ArrayDeque): " + antrianKantin);

        String dilayani = antrianKantin.pollFirst();
        System.out.println("Sedang melayani: " + dilayani);
        System.out.println("Sisa antrian: " + antrianKantin);
    }
}