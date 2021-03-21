package com.projet.stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String designation;
	private float ppa;
	private float ppv;
	private int stockInit;
	private int stock;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPpa() {
		return ppa;
	}
	public void setPpa(float ppa) {
		this.ppa = ppa;
	}
	public float getPpv() {
		return ppv;
	}
	public void setPpv(float ppv) {
		this.ppv = ppv;
	}
	public int getStockInit() {
		return stockInit;
	}
	public void setStockInit(int stockInit) {
		this.stockInit = stockInit;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Article(long id, String designation, float ppa, float ppv, int stockInit, int stock) {
		super();
		this.id = id;
		this.designation = designation;
		this.ppa = ppa;
		this.ppv = ppv;
		this.stockInit = stockInit;
		this.stock = stock;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", designation=" + designation + ", ppa=" + ppa + ", ppv=" + ppv + ", stockInit="
				+ stockInit + ", stock=" + stock + "]";
	}
	
	
	
	

}
