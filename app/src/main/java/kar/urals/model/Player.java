package kar.urals.model;

public class Player {
    private final String name;
    private final String figure;

    public Player(final String name, String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getPlayerName() {
        return name;
    }

    public String getPlayerFigure() {
        return figure;
    }
}
