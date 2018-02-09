package com.jsoft.figuras;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;


import org.junit.Test;

import com.jsoft.figuras.util.Shapes;

/**
 * Unit test for simple App.
 */
public class FigurasTest {

	@Test
	public void pruebaAlturasquare() {
		String actual = Shapes.square();
		assertThat(3, is(getAlturaFigura(actual)));
	}
	
	@Test
	public void pruebaAlturatriangle() {
		String actual = Shapes.triangle();
		assertThat(3, is(getAlturaFigura(actual)));
	}
	
	@Test
	public void pruebaAlturadiamond() {
		String actual = Shapes.diamond();
		assertThat(5, is(getAlturaFigura(actual)));
	}
	
	@Test
	public void pruebaAnchoLineaUnosquareGenerico() {
		assertThat(3, is(getLineasquare(1).length()));
	}
	
	@Test
	public void pruebaAnchoLineaDossquareGenerico() {
		assertThat(3, is(getLineasquare(2).length()));
	}
	
	@Test
	public void pruebaAnchoLineaTressquareGenerico() {
		assertThat(3, is(getLineasquare(3).length()));
	}
	
	@Test
	public void pruebaContenidoLineaUnosquareGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineasquare(1)))));
	}
	
	@Test
	public void pruebaContenidoLineaDossquareGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineasquare(2)))));
	}
	
	@Test
	public void pruebaContenidoLineaTressquareGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineasquare(3)))));
	}
	
	/**** Test triangle ****/
	
	@Test
	public void pruebaAnchoLineaUnotriangleGenerico() {
		assertThat(3, is(getLineatriangle(1).length()));
	}
	
	@Test
	public void pruebaAnchoLineaDostriangleGenerico() {
		assertThat(4, is(getLineatriangle(2).length()));
	}
	
	@Test
	public void pruebaAnchoLineaTrestriangleGenerico() {
		assertThat(5, is(getLineatriangle(3).length()));
	}
	
	@Test
	public void pruebaContenidoLineaUnotriangleGenerico() {
		assertThat(1, is(equalTo(numeroCaracteresLinea(getLineatriangle(1)))));
	}
	
	@Test
	public void pruebaContenidoLineaDostriangleGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineatriangle(2)))));
	}
	
	@Test
	public void pruebaContenidoLineaTrestriangleGenerico() {
		assertThat(5, is(equalTo(numeroCaracteresLinea(getLineatriangle(3)))));
	}
	
	/**** Test diamond ****/
	
	@Test
	public void pruebaAnchoLineaUnodiamondGenerico() {
		assertThat(3, is(getLineadiamond(1).length()));
	}
	
	@Test
	public void pruebaAnchoLineaDosdiamondGenerico() {
		assertThat(4, is(getLineadiamond(2).length()));
	}
	
	@Test
	public void pruebaAnchoLineaTresdiamondGenerico() {
		assertThat(5, is(getLineadiamond(3).length()));
	}
	
	@Test
	public void pruebaAnchoLineaCuatrodiamondGenerico() {
		assertThat(4, is(getLineadiamond(4).length()));
	}
	
	@Test
	public void pruebaAnchoLineaCincodiamondGenerico() {
		assertThat(3, is(getLineadiamond(5).length()));
	}
	
	@Test
	public void pruebaContenidoLineaUnodiamondGenerico() {
		assertThat(1, is(equalTo(numeroCaracteresLinea(getLineadiamond(1)))));
	}
	
	@Test
	public void pruebaContenidoLineaDosdiamondGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineadiamond(2)))));
	}
	
	@Test
	public void pruebaContenidoLineaTresdiamondGenerico() {
		assertThat(5, is(equalTo(numeroCaracteresLinea(getLineadiamond(3)))));
	}
	
	@Test
	public void pruebaContenidoLineaCuatrodiamondGenerico() {
		assertThat(3, is(equalTo(numeroCaracteresLinea(getLineadiamond(4)))));
	}
	
	@Test
	public void pruebaContenidoLineaCincodiamondGenerico() {
		assertThat(1, is(equalTo(numeroCaracteresLinea(getLineadiamond(5)))));
	}
	
	
	
	private int getAlturaFigura(String figura) {
		return figura.split(System.lineSeparator()).length;
	}
	
	private String getLineasquare(int linea) {
		return getLineaFigura(linea, Shapes.square());
	}
	
	private String getLineatriangle(int linea) {
		return getLineaFigura(linea, Shapes.triangle());
	}
	
	private String getLineadiamond(int linea) {
		return getLineaFigura(linea, Shapes.diamond());
	}
	
	private String getLineaFigura(int linea, String figura) {
		String[] lineas = figura.split(System.lineSeparator()); 
		return lineas[linea - 1];
	}
	
	private int numeroCaracteresLinea(String line) {
		int result = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '*') result++;
		}
		return result;
	}
	
}
