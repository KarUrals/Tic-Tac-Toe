package kar.urals;

public class Main {

    public static void main(String[] args) {
        final Board board = new Board();
//        System.out.println(Board.class);
//        System.out.println(Board.GAME_NAME);
        Board.printGameName();
        board.printBoard();
    }
}
