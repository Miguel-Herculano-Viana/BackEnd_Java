import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String nome = sc.nextLine();
        sc.close();
        System.out.println("\nO seu nome é: " + nome);
    }
}