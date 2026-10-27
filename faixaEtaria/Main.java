import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.close();

        System.out.println("A idade informada foi: " + idade);
        if (idade >= 0) {
            if (idade < 12){
                System.out.println("Você é criança");
            }else if (idade < 18){
                System.out.println("Você é adolescente");
            }else if (idade < 60){
                System.out.println("Você é adulto");
            } else {
                System.out.println("Você é idoso");
            }
        } else {
            System.out.println("O numero inserido é negativo");
        }
    }
}
