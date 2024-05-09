package model;

public class Podcast extends Audio {

	private String apresentador, descrição, convidado;

	public String getApresentador() {
		return apresentador;
	}

	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getConvidado() {
		return convidado;
	}

	public void setConvidado(String convidado) {
		this.convidado = convidado;
	}

	@Override
	public double getClassificacao() {
		if (this.getTotalCurtidas() > 500) {
			return 10;
		} else {
			return 8;
		}
	}

	@Override
	public String toString() {
		return "Apresentador: " + apresentador + ", Descrição: " + descrição + ",Convidado: " + convidado
				+ super.toString();
	}

}
