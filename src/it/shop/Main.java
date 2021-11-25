package it.shop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome, desc;
		double prezzo;
		
		System.out.println("Inserisci il nome del prodotto");
		nome = scan.nextLine();
		System.out.println("Inserisci la descrizione del prodotto");
		desc = scan.nextLine();
		System.out.println("Inserisci il prezzo del prodotto");
		prezzo = scan.nextDouble();
		
		Prodotto prod1 = new Prodotto();
		System.out.println("Codice prodotto: " + prod1.getCodice() + ";\nNome: " + prod1.getNome() + ";\nNome esteso: " + prod1.codiceNome());;
		System.out.println("Il prezzo è: " + prod1.prezzoFormattato() + "\nCompreso di IVA invece: " + prod1.stampaPrezzoIva() + "\n" + prod1.getDescrizione());
		System.out.println("");
		
		Prodotto prod2 = new Prodotto("Pallone", "Pallone della Serie A", 30.0);
		System.out.println("Codice prodotto: " + prod2.getCodice() + ";\nNome: " + prod2.getNome() + ";\nNome esteso: " + prod2.codiceNome());;
		System.out.println("Il prezzo è: " + prod2.prezzoFormattato() + "\nCompreso di IVA invece: " + prod2.stampaPrezzoIva() + "\n" + prod2.getDescrizione());
		System.out.println("");
		
		Prodotto prod3 = new Prodotto(nome, desc, prezzo);
		System.out.println("Codice prodotto: " + prod3.getCodice() + ";\nNome: " + prod3.getNome() + ";\nNome esteso: " + prod3.codiceNome());;
		System.out.println("Il prezzo è: " + prod3.prezzoFormattato() + "\nCompreso di IVA invece: " + prod3.stampaPrezzoIva() + "\n" + prod3.getDescrizione());
		
		scan.close();
	}
}
