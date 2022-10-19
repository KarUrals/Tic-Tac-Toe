package kar.urals.view;

import kar.urals.controller.Game;

public class AdvConsoleView extends ConsoleView{
    public AdvConsoleView(Game game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
        System.out.println("***");
    }
}
