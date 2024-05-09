package model;

public class Audio {

	private String titulo;
	private int totalReproducoes, totalCurtidas;
	private double classificacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void curte() {
		this.totalCurtidas++;
	}

	public void reproduz() {
		this.totalReproducoes++;
	}

	@Override
	public String toString() {
		return "Título=" + titulo + ", Total de Reproduções: " + totalReproducoes + ", Total de Curtidas: " + totalCurtidas
				+ ", Classificacao: " + classificacao;
	}
}
