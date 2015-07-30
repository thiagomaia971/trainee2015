package Entidades;

import java.util.HashMap;
import java.util.Map;

public class Conversor {

	Map<Character, Integer> conjunto;

	public Conversor() {
		conjunto = new HashMap<Character, Integer>();

		conjunto.put('I', 1);
		conjunto.put('X', 10);
		conjunto.put('V', 5);
		conjunto.put('L', 50);
	}

	public int converteAlgarismoRomanoParaArabico(String algarismoRomano)
			throws Exception {
		int resultado = 0;
		Character caractere;

		if (TudoIgual(algarismoRomano) && algarismoRomano.length() > 1) {
			if (Invalidos(algarismoRomano.charAt(0))) {
				throw new Exception("algarimos inavidos!");
			}

			if (algarismoRomano.length() < 4) {
				return conjunto.get(algarismoRomano.charAt(0))
						* algarismoRomano.length();
			} else {
				throw new Exception(
						"Não pode colocar mais que 3 algarimos iguais!");
			}

		}
		if (algarismoRomano.length() == 1) {
			resultado += conjunto.get(algarismoRomano.charAt(0));
		} else {
			for (int j = 0; j < algarismoRomano.length() - 1; j++) {
				caractere = algarismoRomano.charAt(j);
				if (conjunto.get(caractere) < conjunto.get(algarismoRomano
						.charAt(j + 1))) {

					resultado += conjunto.get(algarismoRomano.charAt(j + 1))
							- conjunto.get(caractere);
				}
				if (conjunto.get(caractere) == conjunto.get(algarismoRomano
						.charAt(j + 1))) {
					resultado += conjunto.get(caractere);
				}

			}
		}

		return resultado;
	}

	private boolean TudoIgual(String algarismoRomano) {
		for (int i = 0; i < algarismoRomano.length() - 1; i++) {
			if (algarismoRomano.charAt(i) != algarismoRomano.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	private boolean Invalidos(char letra) {

		if (letra == 'V' || letra == 'L' || letra == 'D') {
			return true;
		}
		return false;
	}
}
