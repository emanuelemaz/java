import java.util.Scanner; //Per riceve input da Utente

public class MaggioreMinore {

	public static void main(String[] args) {

		System.out.println("Inserisci il primo numero (a): ");
		Double a = new Scanner(System.in).nextDouble();

		System.out.println("Inserisci il secondo numero (b): ");
		Double b = new Scanner(System.in).nextDouble();

		if (a > b) {
			System.out.println("a è maggiore di b");
		}

		else if (b > a) {
			System.out.println("b è maggiore di a");
		}
	}
}