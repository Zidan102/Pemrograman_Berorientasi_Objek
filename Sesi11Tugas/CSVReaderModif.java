import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderModif {
    public static void main(String[] args) {
        String csvFile = "D:\\students.csv";
        String line;
        int totalBarisData = 0;
        int indeks = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                if (indeks > 1) { // Hanya menghitung baris setelah header
                    totalBarisData++;
                }
            }
            System.out.println("Jumlah baris data dalam file (tanpa header): " + totalBarisData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}