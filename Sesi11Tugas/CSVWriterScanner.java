import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriterScanner {
    public static void main(String[] args) {
        String csvFile = "D:\\new_students_input.csv";
        
        // Menggunakan FileWriter dengan parameter true agar data baru ditambahkan di akhir (append)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true));
             Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("=== Input Data Mahasiswa ===");
            System.out.println("Format input: NIM, NAMA, UMUR, PRODI");
            System.out.println("Ketik 'keluar' untuk menyudahi program.\n");

            while (true) {
                System.out.print("Masukkan data: ");
                String input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("keluar")) {
                    break;
                }
                
                bw.write(input);
                bw.newLine();
            }
            System.out.println("Data berhasil disimpan ke file: " + csvFile);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}