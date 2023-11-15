package megaSena;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializa o vetor para armazenar os números escolhidos pelo usuário
        int[] numerosEscolhidos = new int[7];

        // Solicita ao usuário que escolha 7 números de 0 a 100
        for (int i = 0; i < 7; i++) {
            boolean inputValido = false;
            do {
                try {
                    System.out.printf("Digite o %dº número (entre 0 e 100): ", i + 1);
                    numerosEscolhidos[i] = scanner.nextInt();
                    if (numerosEscolhidos[i] < 0 || numerosEscolhidos[i] > 100) {
                        System.out.println("Por favor, escolha um número entre 0 e 100.");
                        continue;
                    }
                    inputValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número inteiro.");
                    scanner.next(); // Limpa o buffer de entrada
                }
            } while (!inputValido);
        }

        // Gera os 7 números vencedores aleatórios
        int[] numerosSorteados = sortearNumeros();

        // Exibe os números sorteados
        System.out.print("\nNúmeros sorteados: ");
        for (int numero : numerosSorteados) {
            System.out.print(numero + " ");
        }

        // Compara os números escolhidos pelo usuário com os números sorteados
        int numerosCorretos = contarNumerosCorretos(numerosEscolhidos, numerosSorteados);

        // Determina o prêmio com base nos acertos
        determinarPremio(numerosCorretos);

        scanner.close();
    }

    private static int[] sortearNumeros() {
        Random random = new Random();
        int[] numerosSorteados = new int[7];
        for (int i = 0; i < 7; i++) {
            numerosSorteados[i] = random.nextInt(101); // Gera números aleatórios de 0 a 100
        }
        return numerosSorteados;
    }

    private static int contarNumerosCorretos(int[] numerosEscolhidos, int[] numerosSorteados) {
        int count = 0;
        for (int numeroEscolhido : numerosEscolhidos) {
            for (int numeroSorteado : numerosSorteados) {
                if (numeroEscolhido == numeroSorteado) {
                    count++;
                    break; // Não é necessário verificar o mesmo número mais de uma vez
                }
            }
        }
        return count;
    }

    private static void determinarPremio(int numerosCorretos) {
        System.out.println("\nNúmeros corretos: " + numerosCorretos);
        switch (numerosCorretos) {
            case 5:
                System.out.println("Parabéns! Você ganhou 10 mil reais!");
                break;
            case 6:
                System.out.println("Parabéns! Você ganhou 50 mil reais!");
                break;
            case 7:
                System.out.println("Parabéns! Você ganhou 200 mil reais!");
                break;
            default:
                System.out.println("Não foi dessa vez. Tente novamente!");
        }
    }
}
