package com.projet.stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "forme")
public class Forme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Forme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Forme(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + "]";
	}

}
