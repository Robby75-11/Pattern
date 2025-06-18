package composite;

public class Pagina implements ComponenteLibro{
    private  int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public void stampa() {
        System.out.println("stampando pagina " + numero);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
