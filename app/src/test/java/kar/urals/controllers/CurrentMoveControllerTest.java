package kar.urals.controllers;

import kar.urals.exceptions.InvalidPointException;
import kar.urals.model.Field;
import kar.urals.model.Figure;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CurrentMoveControllerTest {

    @Test
    public void testCurrentMoveWhenNextMoveIsO() throws InvalidPointException {
        final CurrentMoveController moveController = new CurrentMoveController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.O, moveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNextMoveIsX() throws InvalidPointException {
        final CurrentMoveController moveController = new CurrentMoveController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, moveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNoNextMove() throws InvalidPointException {
        final CurrentMoveController moveController = new CurrentMoveController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.O);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(0, 1), Figure.O);
        field.setFigure(new Point(1, 0), Figure.O);
        field.setFigure(new Point(1, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.O);
        field.setFigure(new Point(2, 0), Figure.O);
        field.setFigure(new Point(2, 2), Figure.X);
        field.setFigure(new Point(2, 1), Figure.O);
        assertNull(moveController.currentMove(field));
    }
}