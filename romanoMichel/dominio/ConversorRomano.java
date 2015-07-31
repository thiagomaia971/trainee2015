package br.ivia.romano.dominio;

import java.util.HashMap;
import java.util.Map;

/*
 * Conversor feito por mim se acharam algum erro o implementação melhor podem modificar aki
 * meu português e ruim kkk não reparem.
 * 
 * */

public class ConversorRomano {
	private Map<Character, Integer> conjunto;
	private char[] letras;
	private int valorAlgorismo=0;
	
	public ConversorRomano(){		
		this.conjunto = new HashMap<Character, Integer>();
		
		this.conjunto.put('I', 1);
		this.conjunto.put('V', 5);
		this.conjunto.put('X', 10);
		this.conjunto.put('L', 50);
		this.conjunto.put('C', 100);
		this.conjunto.put('D', 500);
		this.conjunto.put('M', 1000);
	}
	
	/*metodo converter principal atraves dele validamos a string e 
	 * calculamos o valor do algarismo passado com string
	 * 
	 * */
	public int converter(String string) throws Exception {
		letras = string.toCharArray();
		if(validaString(string)){
			throw new Exception("String passa é Ivalida.");
		}
		converte(0);
		return this.valorAlgorismo;
	}
	
	/*
	 * metodo coverte é recurcivo que para de se chamar apos o contador passar do tamanho do array de letras
	 * tratando o array como uma pilha.
	 * 
	 * */
	private int converte(int cont){
		if(cont >= letras.length)
			return 0;
		else
			return this.calculaValor(converte(cont+1), this.conjunto.get(letras[cont]));		
	}
	
	/*
	 * metodo calcularValor recebe o valor do proximo caracter atraves da funçao converte que
	 * usa de recursividade e o valor da letra atual assim ele compara pra saber se soma ou subtrai.
	 * quem quiser melhorar tudo bem.
	 * 
	 * */
	private int calculaValor(int valorLetraProximaretorno, int valorLetraAtual)
	{
		if(valorLetraAtual < valorLetraProximaretorno)
		{
			this.valorAlgorismo -= valorLetraAtual;
			return valorLetraAtual;
		}
		else{
			this.valorAlgorismo += valorLetraAtual;
			return valorLetraAtual;
		}
	}
	
	/*
	 * recebe uma string e valida se as repetições são permitidas
	 * atraves da string regex ele procura por ocorrencias dela
	 * quem souber mexer mais com regular expression tenta
	 * melhorar.
	 * 
	 * */
	private boolean validaString(String string)
	{
		String regex = "I{0,4}|V{0,2}|X{0,4}|L{1,2}|C{1,4}|D{1,2}";
		if(string.length() == 1)
			return false;
		else if(string.matches(regex))
			return true;
		return false;
	}
	
}


