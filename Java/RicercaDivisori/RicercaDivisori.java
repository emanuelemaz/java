import java.util.ArrayList;
import java.util.Scanner; //Per riceve input da Utente

public class RicercaDivisori {

    public static void main(String[] args) {

        System.out.print("Digita il numero POSITIVO di cui vuoi trovare i divisori: ");

        int a = new Scanner(System.in).nextInt();

        int d = (a - 1);

        if (a == 1) {

            System.out.println("[1]");
            System.exit(0);
        }

        ArrayList<Integer> divisori = new ArrayList<Integer>();
        //System.out.println(d);


        while (a % d != 0) {

            d--;
            
            if (a % d == 0) {

                divisori.add(d);

                while ((a - 1) % d != 0) {

                    d--;

                    if (a % d == 0) {

                        divisori.add(d);

                    }

                }

            }

        }

        System.out.println(divisori);

    }    
}