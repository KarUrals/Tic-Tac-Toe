package kar.urals;

import kar.urals.model.Field;
import kar.urals.model.Figure;
import kar.urals.model.Game;
import kar.urals.model.Player;
import kar.urals.view.ConsoleView;

import java.util.Scanner;

public class XOCLI {
    public static void main(String[] args) {
        final String name1 = playerNameInput(1);
        final String name2 = playerNameInput(2);

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game<Figure> gameXO = new Game<>(players, new Field<>(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while (consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }
    }

    static String playerNameInput(final int count) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter Player %s name: ", count);
        String name = sc.nextLine();
        return name;
    }
}
