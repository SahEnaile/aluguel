package src;
import java.util.Date;

public class ContratoAluguel extends Contrato {
    public ContratoAluguel(Cliente cliente, Imovel imovel, String numeroContrato, Date dataInicio, Date dataFim, double valorMensal) {
        super(cliente, imovel, numeroContrato, dataInicio, dataFim, valorMensal);
    }

    public void renovarAluguel() {
        System.out.println("Aluguel renovado.");
    }

    public void calcularMulta() {
        System.out.println("Multa calculada.");
    }
}
