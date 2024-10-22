package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criar imobiliária
        System.out.print("Digite o nome da imobiliária: ");
        String nomeImobiliaria = scanner.nextLine();
        System.out.print("Digite o endereço da imobiliária: ");
        String enderecoImobiliaria = scanner.nextLine();
        Imobiliaria imobiliaria = new Imobiliaria(nomeImobiliaria, enderecoImobiliaria);
        
        // Adicionar imóveis
        System.out.print("Quantos imóveis deseja adicionar? ");
        int quantidadeImoveis = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < quantidadeImoveis; i++) {
            System.out.println("\nImóvel " + (i + 1) + ":");
            System.out.print("Digite o tipo de imóvel (Casa/Apartamento): ");
            String tipoImovel = scanner.nextLine();
            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Digite o valor do aluguel: ");
            double valorAluguel = Double.parseDouble(scanner.nextLine());
            
            if (tipoImovel.equalsIgnoreCase("Casa")) {
                System.out.print("Digite o número de quartos: ");
                int numeroDeQuartos = Integer.parseInt(scanner.nextLine());
                System.out.print("Possui garagem? (S/N): ");
                boolean possuiGaragem = scanner.nextLine().equalsIgnoreCase("S");
                Casa casa = new Casa(endereco, valorAluguel, numeroDeQuartos, possuiGaragem, false);
                imobiliaria.adicionarImovel(casa);
            } else if (tipoImovel.equalsIgnoreCase("Apartamento")) {
                System.out.print("Digite o andar: ");
                int andar = Integer.parseInt(scanner.nextLine());
                System.out.print("Possui elevador? (S/N): ");
                boolean possuiElevador = scanner.nextLine().equalsIgnoreCase("S");
                Apartamento apartamento = new Apartamento(endereco, valorAluguel, andar, possuiElevador, false);
                imobiliaria.adicionarImovel(apartamento);
            } else {
                System.out.println("Tipo de imóvel inválido.");
            }
        }

        // Criar cliente
        System.out.print("\nDigite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        
        // Listar imóveis
        System.out.println("\nImóveis disponíveis:");
        for (Imovel imovel : imobiliaria.listarImoveis()) {
            System.out.println("Imóvel disponível: " + imovel.getEndereco());
        }
        
        // Alugar um imóvel
        System.out.print("Digite o endereço do imóvel que deseja alugar: ");
        String enderecoAluguel = scanner.nextLine();
        Imovel imovelAluguel = null;
        for (Imovel imovel : imobiliaria.listarImoveis()) {
            if (imovel.getEndereco().equalsIgnoreCase(enderecoAluguel)) {
                imovelAluguel = imovel;
                break;
            }
        }
        
        if (imovelAluguel != null) {
            Contrato contrato = imobiliaria.alugarImovel(imovelAluguel, cliente);
            cliente.assinarContrato(contrato);
        } else {
            System.out.println("Imóvel não encontrado.");
        }

        scanner.close();
    }
}
