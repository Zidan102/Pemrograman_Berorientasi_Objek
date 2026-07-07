import java.sql.*;
import java.util.Scanner;

public class AplikasiTokoRetail {
    // Sesuaikan konfigurasi database kamu di sini
    private static final String URL = "jdbc:mysql://localhost:3306/toko_retail";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conn;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Koneksi ke database
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            int pilihan;
            do {
                tampilkanMenu();
                System.out.print("Pilihan : ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer

                switch (pilihan) {
                    case 1:
                        tampilSemuaData();
                        break;
                    case 2:
                        tambahData();
                        break;
                    case 3:
                        cariData();
                        break;
                    case 4:
                        ubahData();
                        break;
                    case 5:
                        hapusData();
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan aplikasi!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
                System.out.println();
            } while (pilihan != 0);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal: " + e.getMessage());
        }
    }

    private static void tampilkanMenu() {
        System.out.println("+---------------------------------------+");
        System.out.println("|           MENU TOKO RETAIL            |");
        System.out.println("+---------------------------------------+");
        System.out.println("|  1. Tampil Semua Data                 |");
        System.out.println("|  2. Tambah Data                       |");
        System.out.println("|  3. Cari Data                         |");
        System.out.println("|  4. Ubah Data                         |");
        System.out.println("|  5. Hapus Data                        |");
        System.out.println("|  0. Keluar                            |");
        System.out.println("+---------------------------------------+");
    }

    // MENU 1: TAMPIL SEMUA DATA
    private static void tampilSemuaData() {
        String query = "SELECT * FROM tbl_barang";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n+-------------------------------------------------------------+");
            System.out.println("|                  DAFTAR BARANG TOKO RETAIL                  |");
            System.out.println("+-----+------------+---------------------------+-------+------+");
            System.out.println("|  #  | Kode       | Nama Barang               | Harga | Stok |");
            System.out.println("+-----+------------+---------------------------+-------+------+");

            int no = 1;
            while (rs.next()) {
                System.out.printf("| %-3d | %-10s | %-25s | %-5d | %-4d |\n",
                        no++,
                        rs.getString("kode_barang"),
                        rs.getString("nama_barang"),
                        rs.getInt("harga_barang"),
                        rs.getInt("stok_barang"));
            }
            System.out.println("+-----+------------+---------------------------+-------+------+");
            System.out.println("Total: " + (no - 1) + " barang");

        } catch (SQLException e) {
            System.out.println("Gagal memuat data: " + e.getMessage());
        }
    }

    // MENU 2: TAMBAH DATA
    private static void tambahData() {
        System.out.println("\n--- TAMBAH DATA BARANG ---");
        System.out.print("Kode Barang : ");
        String kode = scanner.nextLine();
        System.out.print("Nama Barang : ");
        String nama = scanner.nextLine();
        System.out.print("Harga       : ");
        int harga = scanner.nextInt();
        System.out.print("Stok        : ");
        int stok = scanner.nextInt();

        String query = "INSERT INTO tbl_barang (kode_barang, nama_barang, harga_barang, stok_barang) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, kode);
            pstmt.setString(2, nama);
            pstmt.setInt(3, harga);
            pstmt.setInt(4, stok);

            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }

    // MENU 3: CARI DATA
    private static void cariData() {
        System.out.println("\n--- CARI DATA BARANG ---");
        System.out.print("Masukkan Kode atau Nama Barang: ");
        String keyword = scanner.nextLine();

        String query = "SELECT * FROM tbl_barang WHERE kode_barang = ? OR nama_barang LIKE ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, keyword);
            pstmt.setString(2, "%" + keyword + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\nHasil Pencarian:");
                System.out.println("+------------+---------------------------+-------+------+");
                System.out.println("| Kode       | Nama Barang               | Harga | Stok |");
                System.out.println("+------------+---------------------------+-------+------+");
                boolean ditemukan = false;
                while (rs.next()) {
                    ditemukan = true;
                    System.out.printf("| %-10s | %-25s | %-5d | %-4d |\n",
                            rs.getString("kode_barang"),
                            rs.getString("nama_barang"),
                            rs.getInt("harga_barang"),
                            rs.getInt("stok_barang"));
                }
                System.out.println("+------------+---------------------------+-------+------+");
                if (!ditemukan) System.out.println("Barang tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mencari data: " + e.getMessage());
        }
    }

    // MENU 4: UBAH DATA
    private static void ubahData() {
        System.out.println("\n--- UBAH DATA BARANG ---");
        System.out.print("Masukkan Kode Barang yang ingin diubah: ");
        String kode = scanner.nextLine();

        System.out.print("Nama Barang Baru : ");
        String nama = scanner.nextLine();
        System.out.print("Harga Baru       : ");
        int harga = scanner.nextInt();
        System.out.print("Stok Baru        : ");
        int stok = scanner.nextInt();

        String query = "UPDATE tbl_barang SET nama_barang = ?, harga_barang = ?, stok_barang = ? WHERE kode_barang = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nama);
            pstmt.setInt(2, harga);
            pstmt.setInt(3, stok);
            pstmt.setString(4, kode);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Data sukses diperbarui!");
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengubah data: " + e.getMessage());
        }
    }

    // MENU 5: HAPUS DATA
    private static void hapusData() {
        System.out.println("\n--- HAPUS DATA BARANG ---");
        System.out.print("Masukkan Kode Barang yang ingin dihapus: ");
        String kode = scanner.nextLine();

        String query = "DELETE FROM tbl_barang WHERE kode_barang = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, kode);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }
}