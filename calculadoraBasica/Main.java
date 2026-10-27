import java.util.Scanner;

public class Main {

    public static double calcularAdicao(double num1, double num2){
        return(num1 + num2);
    }
    public static double calcularSubtracao(double num1, double num2){
        return(num1 - num2);
    }
    public static double calcularMultiplicacao(double num1, double num2){
        return(num1 * num2);
    }
    public static double calcularDivisao(double num1, double num2){
            return(num1 / num2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("insira o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("\ninsira o segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.println("""
            == Operações suportadas ==
            1 - Adição
            2 - Subtração
            3 - Multiplicação
            4 - Divisão
            """);
        System.out.print("Insira a operação desejada: ");
        int escolha = sc.nextInt();
        sc.close();

        switch(escolha){
        case 1:
            double resultA = calcularAdicao(num1, num2);
            System.out.println("O resultado da Adição de " + num1 + " e " + num2 + " é igual a: " + resultA);
            break;
        case 2:
            double resultS = calcularSubtracao(num1, num2);
            System.out.println("O resultado da Subtração de " + num1 + " e " + num2 + " é igual a: " + resultS);
            break;
        case 3:
            double resultM = calcularMultiplicacao(num1, num2);
            System.out.println("O resultado da Multiplicação de " + num1 + " e " + num2 + " é igual a: " + resultM);
            break;
        case 4:
            if(num2 == 0){
                System.out.println("A divisão por 0 não é possível");
            } else {
                double resultD = calcularDivisao(num1, num2);
                System.out.println("O resultado da Divisão de " + num1 + " e " + num2 + " é igual a: " + resultD);
            }
            break;
        default:
            System.out.println("Operação selecionada inválida");
            break;
        }
    }
}
