import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        if (idade >= 18) {
            System.out.println("\nVocê é maior de idade");
        } else {
            System.out.println("\nVocê é menor de idade");
        }
    }
}