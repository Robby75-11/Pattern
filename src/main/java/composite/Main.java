package composite;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){

        Pagina p1 = new Pagina(1);
        Pagina p2 = new Pagina(2);
        Pagina p3 = new Pagina(3);
        Pagina p4 = new Pagina(4);
        Pagina p5 = new Pagina(5);

        Sezione s1 = new Sezione("Capitolo 1");
        s1.aggiungi(p1);
        s1.aggiungi(p2);

        Libro libro = new Libro("Il mondo Corrotto", Arrays.asList("Rizzoli", "Sinesi", "Johnson", "Albergo"), 39.99) ;

        libro.stampa();
        System.out.println("Totale pagine: " + libro.getNumeroPagine());
    }
}
