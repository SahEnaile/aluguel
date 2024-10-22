package src;

public abstract class Imovel {
    private String endereco;
    private double valorAluguel;
    private boolean disponivel;

    public Imovel(String endereco, double valorAluguel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.disponivel = true;
    }

    public void tornarDisponivel() {
        this.disponivel = true;
    }

    public void alugar(Cliente cliente) {
        if (disponivel) {
            System.out.println("Imóvel alugado para: " + cliente.getNome());
            this.disponivel = false;
        } else {
            System.out.println("Imóvel não disponível.");
        }
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
