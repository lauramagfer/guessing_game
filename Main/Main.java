
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int rightNumber = 0;
        int userNumber;
        String status = " ";
        int attempts = 5;
        int difficultyLevel;
        int initialScore = 0;
        int penaltyError = 0; 

        System.out.println("\n=========JOGO DE ADIVINHAÇÃO=========");

        System.out.println("Escolha um nível de dificuldade: ");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        difficultyLevel = sc.nextInt();

        switch (difficultyLevel) {
            case 1:
                rightNumber = random.nextInt(10) + 1;
                initialScore = 100;
                penaltyError = 10;
                break;
            case 2:
                rightNumber = random.nextInt(50) + 1;
                initialScore = 200;
                penaltyError = 20;
                break;
            case 3:
                rightNumber = random.nextInt(100) + 1;
                initialScore = 300;
                penaltyError = 30;
                break;
            default:
                System.out.println("DIFICULDADE INVÁLIDA!");
                sc.close();
                return;
        }

        System.out.println("\nNível de dificuldade: " + difficultyLevel);

        int finalScore = initialScore;

        System.out.println("\nPontuação inicial: " + initialScore);

        System.out.println("\nTentativas: " + attempts);
       
        do {
            
            System.out.println("\nDigite um número: ");
            userNumber = sc.nextInt();

            if (userNumber > rightNumber){
                status = "Acima do valor!";
                finalScore -= penaltyError;
                System.out.println(status);
                System.out.printf("Você perdeu %d pontos. Pontuação atual: %d ",penaltyError, finalScore);
            } else if (userNumber < rightNumber) {
                status = "Abaixo do valor!";
                finalScore -= penaltyError;
                System.out.println("\n" + status);
                System.out.printf("Você perdeu %d pontos. Pontuação atual: %d ",penaltyError, finalScore);
            } else if (userNumber == rightNumber){
                status = "Parabéns! Você acertou!";
                System.out.println("\n" + status);
            }

            attempts -= 1;
            System.out.println("\nTentativas restantes: " + attempts);

        } while(status != "Parabéns! Você acertou!" && attempts > 0);

        System.out.println("Pontuação final: " + finalScore);

        sc.close();

        System.out.println("Número gerado pelo sistema: " + rightNumber);
    }
}