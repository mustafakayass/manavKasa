import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut_kg,elma_kg,domates_kg,muz_kg,patlican_kg;

        double armut_kg_fiyat = 2.14;
        double elma_kg_fiyat = 3.67;
        double domates_kg_fiyat = 1.11;
        double muz_kg_fiyat = 0.95;
        double patlican_kg_fiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilogram Armut aldınız ? : " );
        armut_kg = input.nextDouble();
        System.out.println("Kaç kilogram Elma aldınız ? : " );
        elma_kg = input.nextDouble();
        System.out.println("Kaç kilogram Domates aldınız ? : " );
        domates_kg = input.nextDouble();
        System.out.println("Kaç kilogram Muz aldınız ? : " );
        muz_kg = input.nextDouble();
        System.out.println("Kaç kilogram Patlıcan aldınız ? : " );
        patlican_kg = input.nextDouble();

        double armut_fiyat = armut_kg * armut_kg_fiyat;
        double elma_fiyat = elma_kg * elma_kg_fiyat;
        double domates_fiyat = domates_kg * domates_kg_fiyat;
        double muz_fiyat = muz_kg * muz_kg_fiyat;
        double patlican_fiyat = patlican_kg * patlican_kg_fiyat;

        double total = armut_fiyat + elma_fiyat + domates_fiyat + muz_fiyat + patlican_fiyat;

        System.out.println("Toplam Tutar : " +total);

    }
}
