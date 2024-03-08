package questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        int opcao = 1;
        var scanner = new Scanner(System.in);
        var alteraString = new AlteraString();

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("Por favor, digite a opção desejada!");
            System.out.println("0 - Sair \n1 - Inverter String");
            opcao = scanner.nextInt();

            while (opcao != 0 && opcao != 1) {
                System.out.println("\nA opção digitada é inválida, por favor digite outra opção!");
                System.out.println("0 - Sair \n1 - Verificar Número");
                opcao = scanner.nextInt();
            }

            if (opcao == 0)
                break;

            scanner.nextLine();

            System.out.println("\nDigite uma string para inverter seus caracteres:");
            String palavra = scanner.nextLine();

            String palavraInvertida = alteraString.inverteString(palavra);

            System.out.println("\nString invertida: " +palavraInvertida);
        } while (true);

        System.out.println("\nPrograma finalizado!");
    }
}
