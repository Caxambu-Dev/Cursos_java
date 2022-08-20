import java.util.Iterator;

//Escreva um for encadeado que imprima a tabuada de cada número
public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador1 =1; multiplicador1 <= 10; multiplicador1++) {
			for(int multiplicador2 = 1; multiplicador2 <=10; multiplicador2 ++) {
				System.out.println(multiplicador1 + " X " + multiplicador2 + " = " + (multiplicador1 * multiplicador2));
				System.out.println(" ");
			}
			System.out.println();
		}

	}

}
