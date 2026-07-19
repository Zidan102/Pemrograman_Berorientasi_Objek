import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TulisCSV {
    public static void main(String[] args) {
        String csvFile = "D:\\new_students.csv";
        String[] data = {
            "4, David, 23, TI",
            "5, Eva, 22, TE",
            "6, Ferdi, 21, TI"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine(); // Membuat baris baru setelah menulis data
            }
            System.out.println("Data berhasil ditulis ke file: " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}