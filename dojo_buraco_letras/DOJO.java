import java.util.Scanner;

public class DOJO_Buracos {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe uma palavra:");
		String palavra = input.next();
		palavra = palavra.toUpperCase();
		int Contador_Buracos = 0;
		char aux;
		for (int i = 0; i < palavra.length(); i++) {
			aux = palavra.charAt(i);
			if (aux == 'A') {
				Contador_Buracos = Contador_Buracos + 1;
			} else if (aux == 'B') {
				Contador_Buracos = Contador_Buracos + 2;
			} else if (aux == 'D') {
				Contador_Buracos = Contador_Buracos + 1;
			} else if (aux == 'O') {
				Contador_Buracos = Contador_Buracos + 1;
			} else if (aux == 'P') {
				Contador_Buracos = Contador_Buracos + 1;
			} else if (aux == 'Q') {
				Contador_Buracos = Contador_Buracos + 1;
			} else if (aux == 'R') {
				Contador_Buracos = Contador_Buracos + 1;
			}
		}
		System.out.println(Contador_Buracos);
	}
}
