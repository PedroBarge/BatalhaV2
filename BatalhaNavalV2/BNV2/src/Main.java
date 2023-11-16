import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //------------------------------------------------------------------//

    public static void main(String[] args) {
        Player playerCpu = new Player("CPU",true);
        BoardPlayer1 boardPlayer1 = new BoardPlayer1();
        playerCpu.checkPlayer();
        boardPlayer1.buildAreaPlayer1();
    }
}