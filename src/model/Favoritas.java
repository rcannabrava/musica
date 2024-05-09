package model;

public class Favoritas {

	public void inclui(Audio audio) {
		if(audio.getClassificacao() >= 8) {
			System.out.println(audio.getTitulo() + " a favorita da galera");
		} else {
			System.out.println(audio.getTitulo() + " muito boa!");
		}
	}
	
}
