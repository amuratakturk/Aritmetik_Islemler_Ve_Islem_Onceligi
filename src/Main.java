import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner inp = new Scanner(System.in);



        System.out.println("1. Sayıyı Giriniz :");
        a = inp.nextDouble();


        System.out.println("2. Sayıyı Giriniz : ");
        b= inp.nextDouble();

        System.out.println("3.Sayıyı Giriniz : ");
        c= inp.nextDouble();


        double Sonuc = (a+b*c-b);
        System.out.println("Sonucunuz :" + Sonuc);
    }
}
