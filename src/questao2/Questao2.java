package questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        var fibonacci = new CalculaFibonacci();
        var scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("Por favor, digite a opção desejada!");
            System.out.println("0 - Sair \n1 - Verificar Número");
            opcao = scanner.nextInt();

            while (opcao != 0 && opcao != 1) {
                System.out.println("\nA opção digitada é inválida, por favor digite outra opção!");
                System.out.println("0 - Sair \n1 - Verificar Número");
                opcao = scanner.nextInt();
            }

            if (opcao == 0)
                break;


            System.out.println("\nDigite um número inteiro para ver se ele pertence a sequência de Fibonacci!");
            System.out.println("O número informado deve ser inteiro e maior ou igual a zero: ");
            int numero = scanner.nextInt();

            while (numero < 0) {
                System.out.println("\nO número digitado é inválido, por favor digite outro número: ");
                numero = scanner.nextInt();
            }

            if (fibonacci.verificaFibonnaci(numero))
                System.out.println("\nO número informado pertence a sequência de Fibonacci!");
            else
                System.out.println("\nO número informado não pertence a sequência de Fibonacci!");


        } while (true);

        System.out.println("\nPrograma finalizado!");
    }
}
