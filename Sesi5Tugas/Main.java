import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Student
        System.out.print("Masukkan nama mahasiswa: ");
        String sName = input.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String sAddress = input.nextLine();

        Student student = new Student(sName, sAddress);

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();

            student.addCourseGrade(mk, nilai);
        }

        System.out.println("\n" + student.toString());
        student.printGrades();
        System.out.println("Rata-rata: " + student.getAverageGrade());

        // Input Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String tName = input.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String tAddress = input.nextLine();

        Teacher teacher = new Teacher(tName, tAddress);

        System.out.print("Jumlah MK yang diajar: ");
        int mkDosen = input.nextInt();
        input.nextLine();

        for (int i = 0; i < mkDosen; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();
            teacher.addCourse(mk);
        }

        System.out.println("\n" + teacher.toString());

        input.close();
    }
}