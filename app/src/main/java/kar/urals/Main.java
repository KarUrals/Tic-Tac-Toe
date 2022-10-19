package kar.urals;

import kar.urals.controller.Game;
import kar.urals.model.Board;
import kar.urals.view.AdvConsoleView;
import kar.urals.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(consoleView);
        startGame(advConsoleView);


    }

    public static void startGame(final ConsoleView consoleView) {
        consoleView.showGameName();
    }
}
