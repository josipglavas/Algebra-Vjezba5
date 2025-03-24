import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi koliko brojeva zelimo upisati:");
        int kolicinaBrojeva = Integer.parseInt(input.nextLine());

        int[] brojevi = new int [kolicinaBrojeva];

        for (int i = 0; i < kolicinaBrojeva; i++) {
            System.out.println("Unesi broj " + (i + 1) + ":");
            brojevi[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        int min = brojevi[0];
        int max = brojevi[0];

        for (int i = 1; i < kolicinaBrojeva; i++) {
            if (brojevi[i] < min) {
                min = brojevi[i];
            }
            if (brojevi[i] > max) {
                max = brojevi[i];
            }
        }

        System.out.println("Najmanji broj je: " + min);
        System.out.println("Najveći broj je: " + max);
    }
}
