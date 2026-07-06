import javax.swing.*;
import java.awt.*;

public class MyForm3 extends JFrame {
    
    JButton b1 = new JButton("Tombol 1");
    JButton b2 = new JButton("Tombol 2");
    JButton b3 = new JButton("Tombol 3");
    JButton b4 = new JButton("Tombol 4");
    JButton b5 = new JButton("Tombol 5");

    MyForm3() {
        setTitle("Belajar GUI");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);
        setLocationRelativeTo(null);
        BorderLayout g1 = new BorderLayout();
        setLayout(g1);
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyForm3 form = new MyForm3();
    }
}
