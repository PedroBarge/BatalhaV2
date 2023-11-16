import java.util.Scanner;

public class PlaceBoats extends MakeBoard {
    Scanner scanner = new Scanner(System.in);

    public void placeBoatsPlayer2() {
        makeNewBoardPlayer2();
        System.out.println("Place your boats");
        System.out.println("You can place 5 boats on total");
        buildBoardPlayer2();
        int maxBoats = 5;
        while (maxBoats > 0) {
            System.out.print("Line: ");
            int boatLine = scanner.nextInt();
            System.out.print("Column: ");
            int boatColumn = scanner.nextInt();
            boardPlayer2[boatLine][boatColumn] = " O ";
            maxBoats--;
        }
        buildBoardPlayer2();
    }

    public void placeBoatsPlayer1() {
        makeNewBoardPlayer1();
        System.out.println("Place your boats");
        System.out.println("You can place 5 boats on total");
        buildBoardPlayer1();
        int maxBoats = 5;
        while (maxBoats > 0) {
            System.out.print("Line: ");
            int boatLine = scanner.nextInt();
            System.out.print("Column: ");
            int boatColumn = scanner.nextInt();
            boardPlayer1[boatLine][boatColumn] = " O ";
            maxBoats--;
        }
        buildBoardPlayer1();
    }

}
