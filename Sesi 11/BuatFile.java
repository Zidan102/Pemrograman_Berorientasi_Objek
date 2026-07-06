import java.io.*;

public class BuatFile {
    public static void main(String[] args) {
        try {

            File F = new File("contoh.txt");
            if (F.createNewFile()) {
                System.out.println("File berhasil dibuat: " + F.getName());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}   