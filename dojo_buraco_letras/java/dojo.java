import java.util.Scanner;
import java.util.Map;
import java.util.Scanner;

public class DOJO_Buracos {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		Map<String,Integer> letras = new HashMap <String,Integer>();
		letras.put("A", new Integer(1));
		letras.put("B", new Integer(2));
		letras.put("D", new Integer(1));
		letras.put("O", new Integer(1));
		letras.put("P", new Integer(1));
		letras.put("Q",new Integer(1));
		letras.put("R", new Integer(1));
		
		System.out.println("Informe uma palavra:");
		String palavra = input.next();
		palavra = palavra.toUpperCase
		
		int Contador_Buracos = 0;
	
		for(String letra : palavra.split("")){
			if(letras.containsKey(letra)){
				Contador_Buracos += letras.get(letra);
			}
		}
		
		System.out.println(Contador_Buracos);
	}
}
