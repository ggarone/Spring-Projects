package com.garone.entities;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class StudentiEsami {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EmbeddedId
	private StudentiEsamiKey id;
	
	@ManyToOne
	@MapsId("studenteId")
	@JoinColumn(name = "studente_id")
	private Studente studente;
	
	@ManyToOne
	@MapsId("esameId")
	@JoinColumn(name = "esame_id")
	private Esame esame;
	private LocalDateTime dataEsame;
	private int voto;

	public StudentiEsamiKey getId() {
		return id;
	}
	public void setId(StudentiEsamiKey id) {
		this.id = id;
	}
	public Studente getStudente() {
		return studente;
	}
	public void setStudente(Studente studente) {
		this.studente = studente;
	}
	public Esame getEsame() {
		return esame;
	}
	public void setEsame(Esame esame) {
		this.esame = esame;
	}
	public LocalDateTime getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(LocalDateTime dataEsame) {
		this.dataEsame = dataEsame;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	
	
	

}
