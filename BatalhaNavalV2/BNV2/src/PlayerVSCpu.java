import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerVSCpu {
    Scanner scanner = new Scanner(System.in);
    BoardPlayer1 boardPlayer1;
    BoardPlayer2 boardPlayer2;

    public void startGame() {
        System.out.println("Player vs CPU");
        System.out.println();
        boardPlayer1.buildBoardPlayer1();
        boardPlayer2.buildBoardPlayer2();
    }
}
