import java.util.Random;

public class BoardCPU extends MakeBoard{

    public void buildBoardCpu() {
        makeNewBoard();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int line = rand.nextInt(board.length);
            int column = rand.nextInt(board[0].length);

            while (board[line][column] == " O ") {
                line = rand.nextInt(board.length);
                column = rand.nextInt(board[0].length);
            }

            board[line][column] = " O ";
        }
        buildBoard();
    }
}
