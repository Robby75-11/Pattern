package chainOfResponsability;

public class Colonnello extends Ufficiali {
    /**
     * Costruttore per il Colonnello.
     * Inizializza il grado e lo stipendio specifici del Colonnello.
     */
    public Colonnello() {

       super( 4000,  "Colonnello"); // Stipendio del Colonnello
    }

    /**
     * Implementazione del metodo astratto verificaStipendio.
     * Delega la gestione della richiesta al metodo comune gestisciRichiesta
     * definito nella classe base Ufficiale.
     *
     * @param importoRichiesto L'importo dello stipendio da verificare.
     */
    @Override
    public void verificaStipendio(int importoRichiesto) {
        gestisciRichiesta(importoRichiesto);
    }
}