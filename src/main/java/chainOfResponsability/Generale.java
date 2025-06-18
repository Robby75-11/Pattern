package chainOfResponsability;

public class Generale extends Ufficiali {
    /**
     * Costruttore per il Generale.
     * Inizializza il grado e lo stipendio specifici del Generale.
     */
    public Generale() {
       super(5000,"Generale");
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