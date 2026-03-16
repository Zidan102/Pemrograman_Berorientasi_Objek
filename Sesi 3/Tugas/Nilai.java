package Tugas;

class Nilai extends Mahasiswa {
    int nilai;
    char grade;

    char hitungGrade() {
        if (nilai >= 85) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 55) {
            grade = 'C';
        } else if (nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }
}
