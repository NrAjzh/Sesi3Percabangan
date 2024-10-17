import java.util.Scanner;

public class UangPecahan {
    public static void main(String[] args) {
        int sisaUang, jumlahUang, uang1000an, uang500an, uang200an, uang100an, uang50an, uang20an, uang10an, uang5an, uang2an, uang1an;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah uang: ");
        jumlahUang = sc.nextInt();

        uang1000an = jumlahUang/ 1000;
        sisaUang = jumlahUang % 1000;
        if (uang1000an > 0)
            System.out.println(uang1000an + " lembar 1000");

        uang500an = sisaUang/ 500;
        sisaUang = sisaUang % 500;
        if (uang500an > 0)
            System.out.println(uang500an + " keping 500");

        uang200an = sisaUang/ 200;
        sisaUang = sisaUang % 200;
        if (uang200an > 0)
            System.out.println(uang200an + " keping 200");

        uang100an = sisaUang/ 100;
        sisaUang = sisaUang % 100;
        if (uang100an > 0)
            System.out.println(uang100an + " keping 100");
        
        uang50an = sisaUang/ 50;
        sisaUang = sisaUang % 50;
        if (uang50an > 0)
            System.out.println(uang50an + " keping 50");

        uang20an = sisaUang/ 20;
        sisaUang = sisaUang % 20;
        if (uang20an > 0)
            System.out.println(uang20an + " keping 20");

        uang10an = sisaUang/ 10;
        sisaUang = sisaUang % 10;
        if (uang10an > 0)
            System.out.println(uang10an + " keping 10");

        uang5an = sisaUang/ 5;
        sisaUang = sisaUang % 5;
        if (uang5an > 0)
            System.out.println(uang5an + " keping 5");

        uang2an = sisaUang/ 2;
        sisaUang = sisaUang % 2;
        if (uang2an > 0)
            System.out.println(uang2an + " keping 2");

        uang1an = sisaUang/ 1;
        sisaUang = sisaUang % 1;
        if (uang1an > 0)
            System.out.println(uang1an + " keping 1");

        sc.close();


        
    }
}
