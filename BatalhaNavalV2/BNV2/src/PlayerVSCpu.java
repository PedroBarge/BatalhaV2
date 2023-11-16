import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerVSCpu {
    Scanner scanner = new Scanner(System.in);
    BoardPlayer1 boardPlayer1 = new BoardPlayer1();
    BoardPlayer2 boardPlayer2 = new BoardPlayer2();

    public void startGame() {
        System.out.println("Player vs CPU");
        System.out.println();
        boardPlayer1.buildAreaPlayer1();
        boardPlayer2.buildAreaPlayer2();
    }
}
