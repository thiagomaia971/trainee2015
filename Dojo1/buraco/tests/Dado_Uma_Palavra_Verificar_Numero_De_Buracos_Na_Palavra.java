package br.ivia.buraco.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ivia.buraco.dominio.VerificadorDeBuraco;

public class Dado_Uma_Palavra_Verificar_Numero_De_Buracos_Na_Palavra {

	@Test
	public void Palavra_Com_Letra_C_Sem_Buraco_Rotorna_0() {
		String palavra = "C";
		VerificadorDeBuraco vdb = new VerificadorDeBuraco();
		int cont = vdb.quantidadeDeBuracos(palavra);
		
		assertEquals(0, cont);
	}
	
	@Test
	public void Palavra_Com_Letra_A_Retorna_1() {
		String palavra = "A";
		VerificadorDeBuraco vdb = new VerificadorDeBuraco();
		int cont = vdb.quantidadeDeBuracos(palavra);
		
		assertEquals(1, cont);
	}
	
	@Test
	public void Palavra_Com_Letra_B_Retorna_2() {
		String palavra = "B";
		VerificadorDeBuraco vdb = new VerificadorDeBuraco();
		int cont = vdb.quantidadeDeBuracos(palavra);
		
		assertEquals(2, cont);
	}
	
	@Test
	public void Palavra_Com_Letra_A_e_B_Retorna_3() {
		String palavra = "AB";
		VerificadorDeBuraco vdb = new VerificadorDeBuraco();
		int cont = vdb.quantidadeDeBuracos(palavra);
		
		assertEquals(3, cont);
	}
	
	@Test
	public void Palavra_Com_2_Letras_B_Retorna_4() {
		String palavra = "BB";
		VerificadorDeBuraco vdb = new VerificadorDeBuraco();
		int cont = vdb.quantidadeDeBuracos(palavra);
		
		assertEquals(4, cont);
	}

}
