package com.garone.entities;

import java.io.Serializable;

import javax.persistence.Column;

public class StudentiEsamiKey implements Serializable {
	@Column(name = "studente_id")
	int studenteId;
	
	@Column(name = "esame_id")
	int esameId;

}
