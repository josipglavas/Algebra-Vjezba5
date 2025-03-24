import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args){
        double povrsina = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi duljinu pravokutnika:");
        Double duljina = Double.parseDouble(input.nextLine());

        System.out.println("Unesi širinu pravokutnika:");
        Double sirina = Double.parseDouble(input.nextLine());

        input.close();

        povrsina = duljina * sirina;

        System.out.println("površina pravokutnika je " + povrsina);
    }
}
