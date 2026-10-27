import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("\nInsira o segundo numero: ");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.println("Ambos os numeros são iguais");
        } else if (num1 > num2) {
            System.out.println("O numero 1 é maior que o numero 2");
        } else {
            System.out.println("O numero 2 é maior que o numero 1");
        }
    }
}