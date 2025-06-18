package chainOfResponsability;

public class ApplicazioneMilitare {

    public static void main(String[] args) {
        // 1. Creazione degli ufficiali:
        // Creiamo istanze di ogni grado militare.
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        // 2. Costruzione della catena di responsabilità:
        // Colleghiamo gli ufficiali in ordine gerarchico (dal grado più basso al più alto).
        // Ogni ufficiale "conosce" il suo responsabile (il superiore).
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);
        // Il Generale non ha un superiore in questa catena, quindi il suo responsabile rimane null.

        // 3. Esempi di richieste di verifica stipendio:
        // Iniziamo sempre la richiesta dal primo anello della catena (il Tenente),
        // indipendentemente da chi pensiamo possa gestirla.
        // Sarà la catena stessa a inoltrare la richiesta al gestore appropriato.

        System.out.println("--- Richiesta 1: Verificare chi percepisce almeno 1500 euro ---");
        // Il Tenente (1000) non gestisce, passa al Capitano (2000)
        tenente.verificaStipendio(1500);

        System.out.println("\n--- Richiesta 2: Verificare chi percepisce almeno 4500 euro ---");
        // Il Tenente (1000) -> Capitano (2000) -> Maggiore (3000) -> Colonnello (4000) -> Generale (5000)
        tenente.verificaStipendio(4500);

        System.out.println("\n--- Richiesta 3: Verificare chi percepisce almeno 500 euro ---");
        // Il Tenente (1000) può gestire direttamente
        tenente.verificaStipendio(500);

        System.out.println("\n--- Richiesta 4: Verificare chi percepisce almeno 3000 euro ---");
        // Il Tenente (1000) -> Capitano (2000) -> Maggiore (3000)
        tenente.verificaStipendio(3000);

        System.out.println("\n--- Richiesta 5: Verificare chi percepisce almeno 6000 euro ---");
        // Nessun ufficiale nella catena percepisce abbastanza.
        tenente.verificaStipendio(6000);
    }
}