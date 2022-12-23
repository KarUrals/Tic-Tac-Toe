package kar.urals.controllers;

import kar.urals.exceptions.AlreadyOccupiedException;
import kar.urals.exceptions.InvalidPointException;
import kar.urals.model.Field;
import kar.urals.model.Figure;

import java.awt.Point;

public class MoveController {

    public void applyField(final Field<Figure> field,
                           final Point point,
                           final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);
    }
}
