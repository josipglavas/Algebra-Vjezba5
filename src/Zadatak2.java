import java.util.Scanner;
public class Zadatak2 {
    public static void main(String[] args){
            double temperaturaC = 0;
            double temperaturaF = 0;
            double temperaturaK = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Unesi temperaturu u stupnjevima celzijusa:");
            temperaturaC = Double.parseDouble(input.nextLine());

            input.close();

            temperaturaF = (temperaturaC * (9.0/5.0)) + 32;
            temperaturaK = (temperaturaC + 273.15);

            System.out.println("temperatura u Kelvinima je " + temperaturaK);
            System.out.println("temperatura u Faranheitima je " + temperaturaF);

    }
}
