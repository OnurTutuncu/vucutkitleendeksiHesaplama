import java.util.Scanner;


public class vucutkıtleendeksHesaplama {
    public static void main(String[] args) {

        double m , kg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ekrana Boyunuzu Giriniz:");
        m = inp.nextDouble();

        System.out.print("Ekrana Kilonuzu Giriniz:");
        kg = inp.nextDouble();

        double vke = kg / (m * m);
        System.out.println("Vücut Kitle Endeksiniz:" + vke);


    }


}












