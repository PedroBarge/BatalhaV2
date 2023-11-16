import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    //------------------------------------------------------------------//

    public static void main(String[] args) throws InterruptedException {
        PlayerVSCpu playerVSCpu = new PlayerVSCpu();
        int choiceMenu = 1;
        while (choiceMenu != 0) {
            try {
                cleanConsole();
                System.out.println("Menu");
                System.out.println("1- CPU vs Player \n2- Player vs Player \n0- Close");
                System.out.print("-> ");
                choiceMenu = scanner.nextInt();

                switch (choiceMenu) {
                    case 1:
                        cleanConsole();
                        Player cpu = new Player("Player",true);
                        Player player = new Player("Player1");
                        cpu.checkPlayer();
                        playerVSCpu.startGame();
                        scanner.nextLine();
                        break;
                    case 2:
                        Player player1 = new Player("Player1");
                        Player player2 = new Player("Player1");
                        player1.checkPlayer();
                        player2.checkPlayer();
                        cleanConsole();
                        break;
                    case 0:
                        cleanConsole();
                        System.out.println("Closing...");
                        break;
                    default:
                        System.out.println("Invalide option. Try again.");
                        Thread.sleep(2000);
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("An error occurred...\nGoing back to main menu...");
                Thread.sleep(2000);
            }
        }

    }
    public static void cleanConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}