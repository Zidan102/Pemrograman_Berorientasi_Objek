import java.io.*;

public class InformationFile {
    public static void main(String[] args) {
        File f = new File("contoh.txt");
        if (f.exists()) {
            System.out.println("Nama file: " + f.getName());
            System.out.println("Path file: " + f.getAbsolutePath());
            System.out.println("Apakah file dapat dibaca? " + f.canRead());
            System.out.println("Apakah file dapat ditulis? " + f.canWrite());
            System.out.println("Ukuran file (dalam byte): " + f.length());
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}