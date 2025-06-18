package chainOfResponsability;

public class Maggiore extends  Ufficiali{

    public  Maggiore() {
        super(3000, "Maggiore");
    }

    public Maggiore(int stipendio, String grado) {
        super(stipendio, grado);
    }

    @Override
    public void verificaStipendio(int importoRichiesto) {

    }
}
