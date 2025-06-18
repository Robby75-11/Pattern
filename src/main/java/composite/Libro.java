package composite;

import java.util.List;

public class Libro implements ComponenteLibro {
    private  String titolo;
    private List<String> autori;
    private double prezzo;
    private ComponenteLibro contenuto;

    public Libro(String titolo, List<String> autori, double prezzo ) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        contenuto.stampa();
    }

    @Override
    public int getNumeroPagine() {
        return contenuto.getNumeroPagine();
    }
}
