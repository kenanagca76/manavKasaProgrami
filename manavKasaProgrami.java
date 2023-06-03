package manavKasaProgrami;
import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
         */
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double armutTl =2.14, elmaTl =3.67, domatesTl = 1.11, muzTl = 0.95, patlicanTl = 5.0, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextInt();

        total = ((armutTl * armutKg) + (elmaTl * elmaKg) + (domatesTl * domatesKg) + (muzTl * muzKg) + (patlicanTl * patlicanKg));
        System.out.println("Ödenecek Toplam Tutar :" + total + " TL");

    }
}
