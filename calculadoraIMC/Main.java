import java.util.Scanner;

public class Main{

    public static double calcularIMC(double peso, double altura){
        double imc = (peso/(altura * altura));
        return(imc);
    }

    public static String faixaIMC(double imc){
        String faixa;
        if (imc >= 30) {
            faixa = "Obeso";
        } else if (imc >= 25) {
            faixa = "Acima do peso";
        } else if (imc >= 18.5) {
            faixa = "com Peso Normal";
        } else {
            faixa = "Abaixo do Peso";
        }

        return(faixa);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu peso em Kg: ");
        double peso = sc.nextDouble();
        System.out.print("\nInsira a sua alturaem Metros: ");
        double altura = sc.nextDouble();
        sc.close();

        double imc;
        if (altura == 0 || peso == 0) {
            System.out.println("Nem um dos valores pode ser 0");
        } else if (altura < 0 || peso < 0) {
            System.out.println("Nem um dos valores pode ser menor que 0");
        } else {
            imc = calcularIMC(peso, altura);
            String faixa = faixaIMC(imc);
            System.out.printf("O seu IMC é de: %.2f e você está %s", imc, faixa);
        }
    }
}