import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                  ===CARDÁPIO===
            1 - HAMBÚRGUER   | R$20,00
            2 - PIZZA        | R$35,00
            3 - HOT DOG      | R$15,00
            4 - REFRIGERANTE | R$8,00
        """);
        System.out.print("Escolha a opção desejada: ");
        int escolha = sc.nextInt();
        sc.close();

        switch(escolha){
            case 1:
                System.out.println("Hamburguer - R$20,00");
                break;
            case 2:
                System.out.println("Pizza - R$35,00");
                break;
            case 3:
                System.out.println("Hot Dog - R$15,00");
                break;
            case 4:
                System.out.println("Refrigerante - R$8,00");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}