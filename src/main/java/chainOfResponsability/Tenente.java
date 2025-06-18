package chainOfResponsability;

public class Tenente extends Ufficiali {
    /**
     * Costruttore per il Tenente.
     * Inizializza il grado e lo stipendio specifici del Tenente.
     */
    public Tenente() {
        super(1000, "Tenente");
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