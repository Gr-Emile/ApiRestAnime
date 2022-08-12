package com.aula.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Column(length = 50, unique = true)
	private String nome;
	private int numeroTemporadas;
	private int duracaoDoEp;
	@Column(length = 50)
	private String streamDisponivel;
	@Column(length = 50)
	private String legendaDisponivel;
	
	public Animes() {
	}
	
	public Animes(String nome, int numeroTemporadas, int duracaoDoEp, String streamDisponivel,
			String legendaDisponivel) {
		super();
		this.nome = nome;
		this.numeroTemporadas = numeroTemporadas;
		this.duracaoDoEp = duracaoDoEp;
		this.streamDisponivel = streamDisponivel;
		this.legendaDisponivel = legendaDisponivel;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	public int getDuracaoDoEp() {
		return duracaoDoEp;
	}
	
	public void setDuracaoDoEp(int duracaoDoEp) {
		this.duracaoDoEp = duracaoDoEp;
	}
	
	public String getStreamDisponivel() {
		return streamDisponivel;
	}
	
	public void setStreamDisponivel(String streamDisponivel) {
		this.streamDisponivel = streamDisponivel;
	}
	
	public String getLegendaDisponivel() {
		return legendaDisponivel;
	}
	
	public void setLegendaDisponivel(String legendaDisponivel) {
		this.legendaDisponivel = legendaDisponivel;
	}

	@Override
	public String toString() {
		return "Animes \n[id=" + id + ", nome=" + nome + ", numeroTemporadas=" + numeroTemporadas + ", duracaoDoEp="
				+ duracaoDoEp + ", streamDisponivel=" + streamDisponivel + ", legendaDisponivel=" + legendaDisponivel
				+ "]\n\n";
	}
}
