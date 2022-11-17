//package kar.urals.view;
//
//import kar.urals.controller.GameController;
//import kar.urals.model.Player;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ConsoleView {
//
////    protected final GameController gameController;
////
////    private static final Scanner IN = new Scanner(System.in);
////
////    public ConsoleView(final GameController gameController) {
////        assert gameController != null;
////        this.gameController = gameController;
////    }
////    public void showGameName() {
////        System.out.println(gameController.getGameName());
////    }
////    public void showPlayersName() {
////        System.out.println(gameController.getPlayers());
////    }
////    public void start() {
////        System.out.println("Please input coordinates:");
////        int x = getCoordinate("X");
////        int y = getCoordinate("Y");
////    }
////    public void showPlayers(){
////        for (Player player : gameController.getPlayers()) {
////            System.out.println(player.getPlayerName());
////        }
////    }
////
////    public void showBoard() {
////        for (int i = 0; i < 3; i++) {
////            showBoardLine(i);
////            showLine(12);
////        }
////    }
////    private void showBoardLine(final int row) {
////        for (int i = 0; i < 3; i++) {
////            System.out.print(gameController.getBoard().getFigure(row,i));
////        }
////        System.out.println();
////    }
////    private void showLine(final int size) {
////        for (int i = 0; i < size; i++) {
////            System.out.print("~");
////        }
////        System.out.println();
////    }
////    private int getCoordinate(final String coordinateName) {
////        int counter = 0;
////        do {
////            System.out.print(String.format("Input the coordinate %s: ", coordinateName));
////            try {
////                final Scanner in = new Scanner(System.in);
////                return in.nextInt();
////            } catch (final InputMismatchException e) {
////                System.out.println("Coordinate is incorrect");
////                counter++;
////            }
////        } while (counter < 3);
////        return -1;
////    }
//}
