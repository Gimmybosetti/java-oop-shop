package it.shop;

import java.util.Random;

public class Prodotto {
	
	//attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	//costruttori
	public Prodotto() {
		this.codice = generaCodice();
		this.nome = "Prodotto-generico";
		this.descrizione = "Non c'è ancora una descrizione";
		this.prezzo = 0.0;
		this.iva = 0.22;
	}
	
	public Prodotto(String nome, String descrizione, double prezzo) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = 0.22;
	}
	
	
	//getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(isNullOrEmptyString(nome)) {
			System.out.println("Il nome non deve essere vuoto!");
		}else {
			this.nome = nome;
		}
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		if(isNullOrEmptyString(descrizione)) {
			System.out.println("La descrizione non deve essere vuota!");
		}else {
			this.descrizione = descrizione;
		}
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(isValidPrezzo(prezzo)) {
			System.out.println("Il prezzo deve essere maggiore di 0!");
		}else {
			this.prezzo = prezzo;
		}
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		if(isValidIva(iva)) {
			System.out.println("L'iva deve essere il 22 o il 4 per cento!");
		}else {
			this.iva = iva;
		}
	}
	public int getCodice() {
		return codice;
	}
	
	
	//metodi
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(1000);
	}
	
	public double stampaPrezzo() {
		return prezzo;
	}
	
	public String stampaPrezzoIva() {
		double prezzoConIva = prezzo + (prezzo*iva);
		return String.format("%.2f", prezzoConIva);
	}
	
	public String prezzoFormattato() {
		return String.format("%.2f", prezzo);
	}
	
	public String codiceNome() {
		return this.codice+this.nome;
	}
	
	private boolean isNullOrEmptyString (String s) {
		return s == null || s.length() == 0;
	}
	
	private boolean isValidPrezzo (double prezzo) {
		return prezzo > 0.0;
	}
	
	private boolean isValidIva (double iva) {
		return iva == 0.22 || iva == 0.04;
	}
}













