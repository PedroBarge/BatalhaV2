public class MakeBoard {
    String[][] boardPlayer1 = new String[5][5];
    String[][] boardPlayer2 = new String[5][5];

    //----------------------
    public void makeNewBoardPlayer1() {
        for (int i = 0; i < boardPlayer1.length; i++) {
            for (int j = 0; j < boardPlayer1.length; j++) {
                boardPlayer1[i][j] = " ~ ";
            }
        }
    }

    public void buildBoardPlayer1() {
        System.out.println(" 0  1  2  3  4 ");
        System.out.println("---------------");
        for (int i = 0; i < boardPlayer1.length; i++) {
            for (int j = 0; j < boardPlayer1.length; j++) {
                System.out.print(boardPlayer1[i][j]);
            }
            System.out.println(" |" + i);
            System.out.println();
        }
    }

    //----------------------
    public void makeNewBoardPlayer2() {
        for (int i = 0; i < boardPlayer2.length; i++) {
            for (int j = 0; j < boardPlayer2.length; j++) {
                boardPlayer2[i][j] = " ~ ";
            }
        }
    }

    public void buildBoardPlayer2() {
        System.out.println(" 0  1  2  3  4 ");
        System.out.println("---------------");
        for (int i = 0; i < boardPlayer2.length; i++) {
            for (int j = 0; j < boardPlayer2.length; j++) {
                System.out.print(boardPlayer2[i][j]);
            }
            System.out.println(" |" + i);
            System.out.println();
        }
    }
}
