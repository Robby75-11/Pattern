package composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ComponenteLibro{

    private String titolo;
    private List<ComponenteLibro> componenti = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }
    @Override
    public void stampa() {
        System.out.println("Stampando sezione: " + titolo);
        for (ComponenteLibro c : componenti) {
            c.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
         return componenti.stream().mapToInt(ComponenteLibro::getNumeroPagine).sum() ;
    }
    // ✅ Metodo aggiungi per comporre la sezione
    public void aggiungi(ComponenteLibro componente) {
        componenti.add(componente);
    }
}
