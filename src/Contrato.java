package src;
import java.util.Date;

public class Contrato {
    private Cliente cliente;
    private String nome;
    private Imovel imovel;
    private String numeroContrato;
    private Date dataInicio;
    private Date dataFim;
    private double valorMensal;

    public Contrato(Cliente cliente, Imovel imovel, String numeroContrato, Date dataInicio, Date dataFim, double valorMensal) {
        this.cliente = cliente;
        this.imovel = imovel;
        this.numeroContrato = numeroContrato;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorMensal = valorMensal;
    }

    public void gerarContrato(Imovel imovel, Cliente cliente) {
        System.out.println("Contrato gerado para " + cliente.getNome() + " e imóvel " + imovel.getEndereco());
    }

    public void rescindirContrato() {
        System.out.println("Contrato " + numeroContrato + " rescindido.");
    }

    public void renovarContrato() {
        System.out.println("Contrato " + numeroContrato + " renovado.");
    }

    // Getters e Setters
    public String getNumeroContrato() {
        return numeroContrato;
    }
}

