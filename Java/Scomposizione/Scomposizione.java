import java.util.Scanner;
import java.util.ArrayList;

public class Scomposizione {
    
    public static void main(String[] args) {

        System.out.println("Digita il numero da scomporre:");

        Integer a = new Scanner(System.in).nextInt();

        Integer d = 2;

        ArrayList<Integer> fattori = new ArrayList<Integer>();

        fattori.add(1);

        while (a >= d) {

            if (a % d == 0) {

                fattori.add(d);

                a = a / d;

            }

            else {

                d++;

            }

        }


        System.out.print("I fattori sono: ");
        System.out.print(fattori);


    }

}