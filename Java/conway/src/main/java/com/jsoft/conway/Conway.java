package com.jsoft.conway;

import java.io.File;
import java.util.List;

import com.jsoft.conway.common.Juego;
import com.jsoft.conway.common.Mundo;
import com.jsoft.conway.utils.FileUtils;
import com.jsoft.conway.utils.MundoUtils;

public class Conway {
	
	public static void main(String[] args) {
		
		File file = new File(Conway.class.getClass().getResource("/mundo_entrada.txt").getFile());
		Juego juego = FileUtils.leerJuegoInicial(file);
		List<Mundo> mundos = MundoUtils.crearMundos(juego.getMundo(), juego.getGeneraciones());
		mundos.forEach(System.out::println);
		
	}
}
