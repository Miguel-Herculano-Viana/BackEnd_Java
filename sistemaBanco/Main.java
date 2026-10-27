import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        double saldo ;
        System.out.print("insira o Saldo Inicial: ");
        saldo = sc.nextDouble();
        while (running) {
            System.out.println("""
                == Sistema Bancário ==
                1. Consultar Saldo
                2. Depositar
                3. Sacar
                4. Sair
            """);
            System.out.print("Selecione a operação desejada: ");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("== Consulta de Saldo ==\nSaldo Disponivel: R$%.2f\n", saldo);
                    break;
                case 2:
                    double deposito;
                    System.out.println("== Deposito de Valor ==");
                    System.out.print("Selecione o Saldo a Depositar: ");
                    deposito = sc.nextDouble();
                    if (deposito < 0) {
                        System.out.println("Operação Inválida: O valor Inserido é Menor que Zero");
                        break;
                    } else if (deposito == 0) {
                        System.out.println("Operação Inválida: O Valor Inserido tem que ser Diferente de Zero");
                        break;
                    } else {
                        saldo = saldo + deposito;
                        System.out.printf("Deposito de R$%.2f Realizado\nNovo Saldo: R$%.2f\n",deposito , saldo);
                        break;
                    }
                case 3:
                    double saque;
                    System.out.println("== Saque ==");
                    System.out.print("Selecione o Valor do Saque: ");
                    saque = sc.nextDouble();
                    if (saque == 0) {
                        System.out.println("Operação Inválida: O Valor Inserido tem que ser Diferente de Zero");
                        break;
                    } else if (saque < 0) {
                        System.out.println("Operação Inválida: O valor Inserido é Menor que Zero");
                        break;
                    } else {
                        saldo = saldo - saque;
                        System.out.printf("Saque realizado no valor de R$%.2f Realizado com Sucesso, novo saldo em conta: R$%.2f\n", saque, saldo);
                        break;
                    }
                case 4:
                    System.out.println("Encerrando...");
                    running = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida, Tente Novamente");
                    break;
            }
        }
    }
}