import java.util.Scanner;

public class Lulus_TidakLulus {
    public static void main(String[] args) {
        int Nilai;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        Nilai = sc.nextInt();

        if (Nilai > 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }

        sc.close();


    }
    
}
