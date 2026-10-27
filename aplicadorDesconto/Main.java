import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            === Calculadora de Descontos ===
            Até R$100,00   -    Sem Desconto
            Até R$500,00   -    10% OFF
            Acima de R$500,00 - 15% OFF
            """);
        System.out.print("Insira o valor da sua compra: ");
        double valor = sc.nextDouble();
        double valorDesconto;
        sc.close();

        if (valor > 500) {
            valorDesconto = valor * 0.15;
            System.out.printf("%nA sua compra é elegivel para um desconto de 15%% %n | Valor da compra: R$%.2f%n | Valor Desconto: R$%.2f%n | Novo valor a pagar: R$%.2f%n",valor, valorDesconto, (valor - valorDesconto));
        } else if (valor > 100) {
            valorDesconto = valor * 0.10;
            System.out.printf("%nA sua compra é elegivel para um desconto de 10%% %n | Valor da compra: R$%.2f%n | Valor Desconto: R$%.2f%n | Novo valor a pagar: R$%.2f%n",valor, valorDesconto, (valor - valorDesconto));
        } else if (valor < 0) {
            System.out.println("\nValor Inválido");
        } else {
            System.out.println("\nO valor da compra não é elegivel para descontos");
        }
    }
}