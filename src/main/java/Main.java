import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcao = -1;
        int contador = 1;

        while (opcao != 0) {
            try {
                System.out.println("""
                        Bem vindo ao Petshop!\s
                        1 - Banho
                        2 - Hotelzinho
                        3 - Tosa
                        0 - Fechar loja""");
                opcao = sc.nextInt();
                if (opcao == 1){
                    String codigo = "S" + contador;
                    System.out.println("Digite a data:");
                    String data = sc.next();
                    System.out.println("""
                       Tamanho do animal:
                       1 - PEQUENO
                       2 - MEDIO
                       3 - GRANDE""");
                    int opcaoAnimal = sc.nextInt();
                    TamanhoAnimal tamanhoAnimal;
                    if (opcaoAnimal == 1) {
                        tamanhoAnimal = TamanhoAnimal.PEQUENO;
                    } else if (opcaoAnimal == 2) {
                        tamanhoAnimal = TamanhoAnimal.MEDIO;
                    } else {
                        tamanhoAnimal = TamanhoAnimal.GRANDE;
                    }
                    System.out.println("""
                       Tamanho do pelo:
                       1 - CURTO
                       2 - MEDIO
                       3 - LONGO""");
                    int opcaoPelo = sc.nextInt();
                    TamanhoPelo tamanhoPelo;
                    if (opcaoPelo == 1) {
                        tamanhoPelo = TamanhoPelo.CURTO;
                    } else if (opcaoPelo == 2) {
                        tamanhoPelo = TamanhoPelo.MEDIO;
                    } else {
                        tamanhoPelo = TamanhoPelo.LONGO;
                    }
                    Banho banho = new Banho(codigo, data, tamanhoAnimal, tamanhoPelo);
                    inventario.adicionarServico(banho);
                    contador ++;
                } else if (opcao == 2) {
                    String codigo = "S" + contador;
                    System.out.println("Digite a data:");
                    String data = sc.next();
                    System.out.println("""
                       Tamanho do animal:
                       1 - PEQUENO
                       2 - MEDIO
                       3 - GRANDE""");
                    int opcaoAnimal = sc.nextInt();
                    TamanhoAnimal tamanhoAnimal;
                    if (opcaoAnimal == 1) {
                        tamanhoAnimal = TamanhoAnimal.PEQUENO;
                    } else if (opcaoAnimal == 2) {
                        tamanhoAnimal = TamanhoAnimal.MEDIO;
                    } else {
                        tamanhoAnimal = TamanhoAnimal.GRANDE;
                    }
                    System.out.println("Digite a quantidade de horas: ");
                    int quantHoras = sc.nextInt();
                    Hotelzinho hotelzinho = new Hotelzinho(codigo, data, tamanhoAnimal, quantHoras);
                    inventario.adicionarServico(hotelzinho);
                    contador ++;
                } else if (opcao == 3) {
                    String codigo = "S" + contador;
                    System.out.println("Digite a data:");
                    String data = sc.next();
                    System.out.println("""
                       Tamanho do animal:
                       1 - PEQUENO
                       2 - MEDIO
                       3 - GRANDE""");
                    int opcaoAnimal = sc.nextInt();
                    TamanhoAnimal tamanhoAnimal;
                    if (opcaoAnimal == 1) {
                        tamanhoAnimal = TamanhoAnimal.PEQUENO;
                    } else if (opcaoAnimal == 2) {
                        tamanhoAnimal = TamanhoAnimal.MEDIO;
                    } else {
                        tamanhoAnimal = TamanhoAnimal.GRANDE;
                    }
                    Tosa tosa = new Tosa(codigo, data, tamanhoAnimal);
                    inventario.adicionarServico(tosa);
                    contador ++;
                } else if (opcao == 0) {
                    inventario.emitirRelatorio();
                }

            }catch (InputMismatchException e){
                System.out.println("Opção inválida!");
                sc.nextLine();
            }
        }
    }
}
