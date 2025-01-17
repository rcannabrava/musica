package controller;

import model.Favoritas;
import model.Musica;
import model.Podcast;

public class Aplicativo {
	public static void main(String[] args) {

		Musica minhaMusica = new Musica();
		
		minhaMusica.setTitulo("Despacito");
		minhaMusica.setCantor("Luis Fonsi");
		minhaMusica.setFeat("Daddy Yankee");
		minhaMusica.setGenero("Pop");
		minhaMusica.setAlbum("Single");
		
		for(int i = 0; i >= 100; i++) {
			minhaMusica.reproduz();
		}
		
		for(int i = 0; i >= 50; i++) {
			minhaMusica.curte();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("Podpah");
		meuPodcast.setApresentador("Igão e Mítico");
		
		for(int i = 0; i >= 1000; i++) {
			meuPodcast.reproduz();
		}
		
		for(int i = 0; i >= 500; i++) {
			meuPodcast.curte();
		}
		
		Favoritas favoritas = new Favoritas();
		favoritas.inclui(meuPodcast);
		favoritas.inclui(minhaMusica);
	}
}
