import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Passo 1: Declaração de variáveis + entrada de dados
        Scanner input = new Scanner(System.in);
        double quantoganhaporhora;
        System.out.println("Quanto você ganha por hora?? ");
        quantoganhaporhora = input.nextDouble();
        double horastrabalhadas;
        System.out.println("No total, quantas horas você trabalha por mês?? ");
        horastrabalhadas = input.nextDouble();
        double salario;
        // Passo 2: Calculo do salário
        salario = quantoganhaporhora * horastrabalhadas;
        // Passo 3: Resultado
        System.out.println("O seu salário mensal é de: " + salario);

    }
}
