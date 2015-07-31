package br.ivia.romano.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ivia.romano.dominio.ConversorRomano;

public class Dado_Uma_String_De_Algarismos_Romanos {

	@Test
	public void String_Com_Algarismo_I_Retorna_1() throws Exception {
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("I");
		assertEquals(1, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_V_Retorna_5() throws Exception{
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("V");
		assertEquals(5, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_X_Retorna_10() throws Exception{
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("X");
		assertEquals(10, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_IV_Retorna_4() throws Exception{
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("IV");
		assertEquals(4, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_IX_Retorna_9() throws Exception{
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("IX");
		assertEquals(9, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_CIII_Retorna_103() throws Exception{
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("CIII");
		assertEquals(103, resultado);
	
	}
	
	@Test
	public void String_Com_Algarismo_XIX_retorna_19() throws Exception {
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("XIX");
		assertEquals(19, resultado);
	}
	
	@Test
	public void String_Com_Algarismo_XLI_retorna_41() throws Exception {
		ConversorRomano cr = new ConversorRomano();
		int resultado = cr.converter("XLI");
		assertEquals(41, resultado);
	}
	
	@Test (expected = Exception.class)
	public void String_Com_Algarismo_XXXX_retorna_Exeception() throws Exception  {
		ConversorRomano cr = new ConversorRomano();
		cr.converter("XXXX");
	}
	
	@Test (expected = Exception.class)
	public void String_Com_Algarismo_VV_retorna_Exeception() throws Exception  {
		ConversorRomano cr = new ConversorRomano();
		cr.converter("VV");
	}
	
	@Test (expected = Exception.class)
	public void String_Nulla_retorna_Exeception() throws Exception  {
		ConversorRomano cr = new ConversorRomano();
		cr.converter(null);
	}
	
	@Test (expected = Exception.class)
	public void String_Vazia_retorna_Exeception() throws Exception  {
		ConversorRomano cr = new ConversorRomano();
		cr.converter("");
	}
}
