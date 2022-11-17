//package kar.urals.controller;
//
//import kar.urals.helpers.CoordinateHelper;
//import kar.urals.model.Board;
//import kar.urals.model.Player;
//
//public class GameController {
//
//    private final String gameName;
//    private final Board board;
//    private final Player[] players;
//
//    public GameController(final String gameName, final Board board, final Player[] players) {
//        this.board = board;
//        if (gameName == null || gameName.isEmpty()) {
//            this.gameName = "XO";
//        } else {
//            this.gameName = gameName;
//        }
//        this.players = players;
//    }
//
//    public Board getBoard() {
//        return this.board;
//    }
//    public String getGameName() {
//        return this.gameName;
//    }
//    public Player[] getPlayers() {
//        return players;
//    }
//
//    public Player currentPlayer() {
//        return null;
//    }
//
//    public boolean move(int x, int y) {
//
//        assert x >= 0;
//        assert y >= 0;
//
//        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
//            return false;
//        }
//        // TODO logic fo move
//        return true;
//    }
//
//
//}
