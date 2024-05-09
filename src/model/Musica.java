package model;

public class Musica extends Audio {

	private String album, cantor, genero, feat;

	public Musica() {
		super();
	}

	public Musica(String album, String cantor, String genero, String feat) {
		super();
		this.album = album;
		this.cantor = cantor;
		this.genero = genero;
		this.feat = feat;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFeat() {
		return feat;
	}

	public void setFeat(String feat) {
		this.feat = feat;
	}

	@Override
	public double getClassificacao() {
		if (this.getTotalCurtidas() > 2000) {
			return 10;
		} else {
			return 7;
		}

	}

	@Override
	public String toString() {
		return "Albúm da música: " + album + ", cantor: " + cantor + ", gênero: " + genero + ", feats: " + feat;
	}

}
