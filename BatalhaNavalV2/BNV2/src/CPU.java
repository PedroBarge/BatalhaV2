import java.util.Random;

public class CPU extends Player {
    public CPU(String name, boolean isCPU) {
        super(name, isCPU);
    }

    @Override
    public void checkPlayer() {
        if (isCPU) {
            System.out.println("CPU");
            MakeBoard makeBoard = new MakeBoard();
            makeBoard.makeNewBoardPlayer1();
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                int line = rand.nextInt(makeBoard.boardPlayer1.length);
                int column = rand.nextInt(makeBoard.boardPlayer1[0].length);

                while (makeBoard.boardPlayer1[line][column] == " O ") {
                    line = rand.nextInt(makeBoard.boardPlayer1.length);
                    column = rand.nextInt(makeBoard.boardPlayer1[0].length);
                }
                makeBoard.boardPlayer1[line][column] = " O ";
            }
            makeBoard.buildBoardPlayer1();
        }

    }
}