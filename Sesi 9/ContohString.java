public class ContohString {
    
    public static void main(String[] args) {
        String kalimat = "Saya sedang belajar Java";
        
        // 1. Menghitung panjang string
        System.out.println("Panjang string: " + kalimat.length());

        // 2. Mengambil karakter pada indeks tertentu
        System.out.println("Karakter pada indeks 5: " + kalimat.charAt(5));

        // 3. Mengambil substring
        System.out.println("Substring (0-3): " + kalimat.substring(0, 3));

        // 4. Mengubah huruf menjadi kapital
        System.out.println("Huruf kapital: " + kalimat.toUpperCase());
        // 5. Mengubah huruf menjadi kecil
        System.out.println("Huruf kecil: " + kalimat.toLowerCase());

        // 6. Menghapus spasi di awal dan akhir
        String kalimat2 = "   Belajar Java   ";
        System.out.println("Sebelum trim: '" + kalimat2 + "'");
        System.out.println("Setelah trim: '" + kalimat2.trim() + "'");

        // 7. Mengecek apakah string mengandung kata tertentu
        System.out.println("Mengandung 'sedang': " + kalimat.contains("sedang"));
    }
}
