public class MakeBoard {
    String[][] board = new String[5][5];

    public void makeNewBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " ~ ";
            }
        }
    }
    public void buildBoard() {
        System.out.println(" 0  1  2  3  4 ");
        System.out.println("---------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" |" + i);
            System.out.println();
        }
    }
}
