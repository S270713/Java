import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Player player1, Player player2) {
        int secretNumber;

        do {
            secretNumber = ((int) (101 * Math.random()));
            System.out.println("Загаданное число: " + secretNumber);

            System.out.println("Просим первого игрока ввести число: ");
            player1.setNumber(input.nextInt());

            if (player1.getNumber() == secretNumber) {
                System.out.println("Первый игрок " + player1.getName() + " выиграл");
                break;
            } else if (secretNumber > player1.getNumber()) {
                System.out.println("Загаданное число, " + player1.getName() + ", больше вашего варианта.");
            } else {
                System.out.println("Загаданное число, " + player1.getName() + ", меньше вашего варианта.");
            }

            System.out.println("Просим второго игрока ввести число: ");
            player2.setNumber(input.nextInt());

            if (player2.getNumber() == secretNumber) {
                System.out.println("Второй игрок " + player2.getName() + " выиграл");
                break;
            } else if (secretNumber > player2.getNumber()) {
                System.out.println("Загаданное число, " + player2.getName() + ", больше вашего варианта.");
            } else {
                System.out.println("Загаданное число, " + player2.getName() + ", меньше вашего варианта.");
            }
            System.out.println();
        } while(true);
    }
}