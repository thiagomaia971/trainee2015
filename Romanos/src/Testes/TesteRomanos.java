package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Conversor;

public class TesteRomanos {

	@Test
	public void insere_I_retorna_1() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "I";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(1, resultado);
	}
	
	@Test
	public void insere_X_retorna_10() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "X";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(10, resultado);
	}
	@Test
	public void insere_II_retorna_2() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "II";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(2, resultado);
	}
	@Test
	public void insere_IV_retorna_4() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "IV";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(4, resultado);
	}
	
	@Test
	public void insere_XXX_retorna_30() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "XXX";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(30, resultado);
	}
	
	@Test(expected = Exception.class)
	public void insere_XXXX_retorna_Exeption() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "XXXX";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		//assertEquals(30, resultado);
	}

	@Test (expected = Exception.class)
	public void insere_VV_retorna_Exeption() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "VV";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		//assertEquals(10, resultado);
	}
	
	@Test
	public void insere_XIX_retorna_19() throws Exception {
		Conversor tradutor = new Conversor();
		String algarismoRomano = "XIX";
		int resultado = tradutor.converteAlgarismoRomanoParaArabico(algarismoRomano);
		assertEquals(19, resultado);
	}
	
}
