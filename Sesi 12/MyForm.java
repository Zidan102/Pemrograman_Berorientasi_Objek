import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
    
    MyForm() {
        setTitle("Belajar GUI");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
    }
}