package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Imobiliaria {
    private String nome;
    private String endereco;
    private List<Imovel> listaImoveis;

    public Imobiliaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaImoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        listaImoveis.add(imovel);
        System.out.println("Imóvel adicionado: " + imovel.getEndereco());
    }

    public List<Imovel> listarImoveis() {
        return listaImoveis;
    }

    public Contrato alugarImovel(Imovel imovel, Cliente cliente) {
        imovel.alugar(cliente);
        String numeroContrato = "C" + (listaImoveis.indexOf(imovel) + 1); 
        Contrato contrato = new Contrato(cliente, imovel, numeroContrato, new Date(), new Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000), imovel.getValorAluguel());
        contrato.gerarContrato(imovel, cliente);
        return contrato;
    }
}
