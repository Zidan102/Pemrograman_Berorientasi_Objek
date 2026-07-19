import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BacaCSV {
    public static void main(String[] args) {
        // Sesuaikan path file sesuai dengan sistem operasi atau letak file kamu
        String csvFile = "students.csv"; 
        String line;
        String csvSplitBy = ",";
        int indeks = 0;

        System.out.println("NIM, NAMA, UMUR, PRODI");
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                // Skip baris pertama jika itu adalah header (NIM, NAMA, dll)
                if (indeks > 1) {
                    String[] student = line.split(csvSplitBy);
                    // Menampilkan data kolom 1, 2, 3, dan 4 jika lengkap
                    System.out.println(student[0].trim() + ", " + student[1].trim() + ", " + 
                                       student[2].trim() + ", " + student[3].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}