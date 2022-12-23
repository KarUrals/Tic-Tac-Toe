package kar.urals.controllers;

import kar.urals.exceptions.InvalidPointException;
import kar.urals.model.Field;
import kar.urals.model.Figure;

import java.awt.*;

public class CurrentMoveController {
    public Figure currentMove(final Field<Figure> field) {
        int countFigures = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigures += countFiguresInTheRow(field, x);
        }
        if (countFigures == field.getSize() * field.getSize()) {
            return null;
        }

        if (countFigures % 2 == 0) {
            return Figure.X;
        }

        return Figure.O;
    }

    private int countFiguresInTheRow(final Field<Figure> field, final  int row) {
        int countFigures = 0;
        for (int x = 0; x < field.getSize(); x++) {
            try {
                if (field.getFigure(new Point(x, row)) != null) {
                    countFigures++;
                }
            } catch (final InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigures;
    }
}
