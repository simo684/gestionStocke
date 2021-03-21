package com.projet.stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String tel;
	private String mail;
	private float soldeInit;
	private float solde;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public float getSoldeInit() {
		return soldeInit;
	}
	public void setSoldeInit(float soldeInit) {
		this.soldeInit = soldeInit;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fournisseur(long id, String nom, String tel, String mail, float soldeInit, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
		this.soldeInit = soldeInit;
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Fournisseur [id=" + id + ", nom=" + nom + ", tel=" + tel + ", mail=" + mail + ", soldeInit=" + soldeInit
				+ ", solde=" + solde + "]";
	}
	
	
}
