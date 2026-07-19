import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "D:\\students.csv";
        String destFile = "D:\\students_copy.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Penyalinan selesai! File disimpan ke: " + destFile);
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyalin file.");
            e.printStackTrace();
        }
    }
}