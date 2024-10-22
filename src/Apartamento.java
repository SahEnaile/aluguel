package src;

public class Apartamento extends Imovel {
    private int andar;
    private boolean possuiElevador;
    private boolean comercial;

    public Apartamento(String endereco, double valorAluguel, int andar, boolean possuiElevador, boolean comercial) {
        super(endereco, valorAluguel);
        this.andar = andar;
        this.possuiElevador = possuiElevador;
        this.comercial = comercial;
    }

    // Getters e Setters
    public int getAndar() {
        return andar;
    }

    public boolean isPossuiElevador() {
        return possuiElevador;
    }

    public boolean isComercial() {
        return comercial;
    }
}
