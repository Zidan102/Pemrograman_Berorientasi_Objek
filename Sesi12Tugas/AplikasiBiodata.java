import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiBiodata extends JFrame {

    // Komponen Input
    private JTextField txtNim, txtNama, txtProdi;
    // Komponen Tombol
    private JButton btnTampilkan, btnReset;
    // Komponen Output
    private JTextArea txtOutput;

    public AplikasiBiodata() {
        // Pengaturan Frame Utama
        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- 1. PANEL INPUT ---
        JPanel panelInputUtama = new JPanel(new BorderLayout());
        panelInputUtama.setBorder(BorderFactory.createTitledBorder("Input Data"));
        
        JPanel panelGridInput = new JPanel(new GridLayout(3, 2, 5, 10));
        
        panelGridInput.add(new JLabel("NIM"));
        txtNim = new JTextField();
        panelGridInput.add(txtNim);

        panelGridInput.add(new JLabel("Nama"));
        txtNama = new JTextField();
        panelGridInput.add(txtNama);

        panelGridInput.add(new JLabel("Program Studi"));
        txtProdi = new JTextField();
        panelGridInput.add(txtProdi);
        
        panelInputUtama.add(panelGridInput, BorderLayout.CENTER);

        // --- 2. PANEL TOMBOL ---
        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnTampilkan = new JButton("Tampilkan");
        btnReset = new JButton("Reset");
        
        panelTombol.add(btnTampilkan);
        panelTombol.add(btnReset);

        // Menggabungkan Input dan Tombol di bagian atas (North)
        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelInputUtama, BorderLayout.CENTER);
        panelAtas.add(panelTombol, BorderLayout.SOUTH);

        // --- 3. PANEL OUTPUT ---
        JPanel panelOutput = new JPanel(new BorderLayout());
        panelOutput.setBorder(BorderFactory.createTitledBorder("Output"));
        
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Agar spasi & tanda titik dua sejajar
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        
        panelOutput.add(scrollPane, BorderLayout.CENTER);

        // Menambahkan semua panel utama ke Frame
        add(panelAtas, BorderLayout.NORTH);
        add(panelOutput, BorderLayout.CENTER);

        // --- ACTION LISTENERS (LOGIKA TOMBOL) ---
        
        // Logika Tombol Tampilkan
        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = txtNim.getText();
                String nama = txtNama.getText();
                String prodi = txtProdi.getText();

                // Format teks output sesuai gambar
                String hasil = "========== BIODATA MAHASISWA ==========\n\n"
                             + String.format("%-15s : %s\n", "NIM", nim)
                             + String.format("%-15s : %s\n", "Nama", nama)
                             + String.format("%-15s : %s\n", "Program Studi", prodi);
                
                txtOutput.setText(hasil);
            }
        });

        // Logika Tombol Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Bersihkan input
                txtNim.setText("");
                txtNama.setText("");
                txtProdi.setText("");
                // Bersihkan output
                txtOutput.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Menjalankan GUI di Event Dispatch Thread agar aman
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplikasiBiodata().setVisible(true);
            }
        });
    }
}