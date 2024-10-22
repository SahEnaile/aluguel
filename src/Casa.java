package src;

public class Casa extends Imovel {
    private int numeroDeQuartos;
    private boolean possuiGaragem;
    private boolean comercial;

    public Casa(String endereco, double valorAluguel, int numeroDeQuartos, boolean possuiGaragem, boolean comercial) {
        super(endereco, valorAluguel);
        this.numeroDeQuartos = numeroDeQuartos;
        this.possuiGaragem = possuiGaragem;
        this.comercial = comercial;
    }

    // Getters e Setters
    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }

    public boolean isComercial() {
        return comercial;
    }
}
