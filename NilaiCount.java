import java.util.Scanner;

public class NilaiCount {
    public static void main(String[] args) {
        Double angka;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai: (0-100) ");
        angka = sc.nextDouble();

        if (angka >= 85) {
            grade = "A";
        } else if (angka >= 75){
            grade = "B";
        } else if (angka >= 65) {
            grade = "C";
        } else if (angka >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }   

        System.out.println("Grade: " +grade);
        sc.close();
     }
    
}
