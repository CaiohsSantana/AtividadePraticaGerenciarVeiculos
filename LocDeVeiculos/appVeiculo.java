import java.util.Scanner;
public class appVeiculo {
public static void main(String[] args) {
    GerenciarVeiculos veiculos = new GerenciarVeiculos();
    Scanner teclado = new Scanner(System.in);
    int menu;
     String modelo = " ";
     String marca = " ";
     int fabricacao;
     double valorMercado;
     String placa = " "; 
     String TCombustivel[] = {"álcool", "gasolina", "flex", "GNV", "diesel"} ;
    
    do {
        System.out.println("\n1-novo veiculo");
        System.out.println("2-remover veiculo");
        System.out.println("3-buscar por placa");
        System.out.println("4-listar veiculo");
        System.out.println("5-valor do imposto");
        System.out.println("6-listar veiculo por combustivel");
        System.out.println("7-sair");
        menu = Integer.parseInt(teclado.nextLine());

        switch (menu) {
        case 1:
            System.out.println("Informe o modelo:");
            modelo = teclado.nextLine();
            System.out.println("Informe a marca");
            marca = teclado.nextLine();
            System.out.println("Informe o Ano de Fabricacao");
            fabricacao = Integer.parseInt(teclado.nextLine());
            System.out.println("Informe o Valor de Mercado");
            valorMercado = Integer.parseInt(teclado.nextLine());
            System.out.println("Informe a placa");
            placa = teclado.nextLine();
            System.out.println("Informe o Combustivel");
            TCombustivel = teclado.nextLine();
            veiculos.novoVeiculo(modelo,  marca, fabricacao, valorMercado, placa, TCombustivel);
            break;

        case 2:
            System.out.println(veiculos.exibirTodos());
            System.out.println("Digite a placa do veiculo que será apagado?");
            placa = teclado.nextLine();
            veiculos.apagarVeiculo(placa);
            break;

        case 3:
            System.out.println(veiculos.exibirTodos());
            System.out.println("Digite a plca do veiculo que deseja localizar?");
            placa = teclado.nextLine();
            break;

        case 4:
            System.out.println(veiculos.exibirTodos());
            break;
        
        case 5:
        System.out.println(veiculos.exibirTodos());
        System.out.println("Digite a placa do veiculo para verificar o valor do imposto?");
        placa = teclado.nextLine();
        veiculos.calcularImposto(placa);
        break;
        
        case 6:
        System.out.println(veiculos.exibirTodos());
        //Fazer a listagem relacionando o combustivel
        break;
        
        case 7:
            break;

        default:
            System.out.println("Opção inválida.\n");
            break;
        }

    } while (menu != 7);

    teclado.close();


}
}