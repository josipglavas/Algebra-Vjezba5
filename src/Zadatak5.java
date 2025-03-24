import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi OIB");

        String oib = input.nextLine();

        input.close();
        if(oib.length() == 11){
            int kontrolniBroj = Character.getNumericValue(oib.charAt(10));
            int rezultat = 10;

            for (int i = 0; i < 10; i++) {
                int znamenka = Character.getNumericValue(oib.charAt(i));
                rezultat = rezultat + znamenka;
                rezultat = rezultat % 10;
                if (rezultat == 0) {
                    rezultat = 10;
                }
                rezultat *= 2;
                rezultat = rezultat % 11;
            }

            int izracunatiKontrolni = 11 - rezultat;
            if (izracunatiKontrolni == 10) izracunatiKontrolni = 0;

            if(kontrolniBroj == izracunatiKontrolni){
                System.out.println("Ispravan OIB.");
            } else {
                System.out.println("Neispravan OIB.");
            }
        } else {
            System.out.println("OIB treba sazdravati 11 znamenki");
        }
    }
}
