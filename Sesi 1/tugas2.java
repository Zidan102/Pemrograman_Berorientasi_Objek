import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String[] args) {
        
        String jawaban = JOptionPane.showInputDialog(
            null,
            "Anda sedang belajar apa?",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (jawaban != null) {
            JOptionPane.showMessageDialog(
                null,
                "Belajar pemrograman web sangat mudah",
                "Message",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {  
            System.out.println("Input dibatalkan");
        }
    }
}