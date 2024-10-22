package src;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void solicitarImovel(Imovel imovel) {
        System.out.println(nome + " solicitou o imóvel: " + imovel.getEndereco());
    }

    public void assinarContrato(Contrato contrato) {
        System.out.println(nome + " assinou o contrato: " + contrato.getNumeroContrato());
    }

    public void devolverImovel(Imovel imovel) {
        System.out.println(nome + " devolveu o imóvel: " + imovel.getEndereco());
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

