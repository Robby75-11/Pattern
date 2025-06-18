package chainOfResponsability;

public abstract class Ufficiali {
    protected  Ufficiali responsabile;
    protected  int stipendio;
    protected String grado;

    public Ufficiali(int stipendio, String grado) {
        this.stipendio = stipendio;
        this.grado = grado;
    }

    public void setResponsabile(Ufficiali responsabile) {
        this.responsabile = responsabile;
    }
    /**
     * Metodo astratto che ogni sottoclasse concreta (Tenente, Capitano, ecc.)
     * deve implementare. Questo è il punto di ingresso per una richiesta
     * nella catena di responsabilità.
     *
     * @param importoRichiesto L'importo dello stipendio che si desidera verificare.
     */
    public abstract void verificaStipendio(int importoRichiesto);

    /**
     * Questo metodo contiene la logica principale del pattern Chain of Responsibility.
     * Determina se l'ufficiale corrente può gestire la richiesta
     * (cioè se il suo stipendio è uguale o superiore all'importo richiesto)
     * o se deve passare la richiesta al suo responsabile.
     *
     * @param importoRichiesto L'importo dello stipendio da confrontare.
     */
    protected void gestisciRichiesta(int importoRichiesto) {
        // Passo 1: L'ufficiale corrente tenta di gestire la richiesta.
        // Se lo stipendio dell'ufficiale corrente è sufficiente per la richiesta.
        if (this.stipendio >= importoRichiesto) {
            System.out.println(this.grado + " percepisce almeno " + importoRichiesto + " €.");
        }
        // Passo 2: Se l'ufficiale corrente non può gestire la richiesta,
        // verifica se c'è un responsabile a cui passarla.
        else if (this.responsabile != null) {
            System.out.println(this.grado + " non percepisce abbastanza (" + this.stipendio + " €). Passo al superiore...");
            // Passa la richiesta al prossimo anello della catena.
            this.responsabile.verificaStipendio(importoRichiesto);
        }
        // Passo 3: Se l'ufficiale corrente non può gestire la richiesta
        // e non c'è più un responsabile (fine della catena).
        else {
            System.out.println("Nessun ufficiale nella catena percepisce almeno " + importoRichiesto + " €");
        }
    }


}
