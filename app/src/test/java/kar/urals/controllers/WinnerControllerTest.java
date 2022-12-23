package kar.urals.controllers;

import kar.urals.exceptions.InvalidPointException;
import kar.urals.model.Field;
import kar.urals.model.Figure;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class WinnerControllerTest {

    @Test
    public void testGetWinnerWhenWinnerRow() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field<Figure> field = new Field<>(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerWhenNoWinnerRow() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field<Figure> field = new Field<>(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerWhenWinnerColumn() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field<Figure> field = new Field<>(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerWhenNoWinnerColumn() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field<Figure> field = new Field<>(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerWhenWinnerMainDiag() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();
        final Field<Figure> field = new Field<>(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.X);
        assertEquals(Figure.X, winnerController.getWinner(field));
    }

    @Test
    public void testGetWinnerWhenNoWinnerMainDiag() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();
        final Field<Figure> field = new Field<>(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.O);
        assertNull(winnerController.getWinner(field));
    }

    @Test
    public void testGetWinnerWhenWinnerSecondDiag() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();
        final Field<Figure> field = new Field<>(3);
        field.setFigure(new Point(2, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(0, 2), Figure.X);
        assertEquals(Figure.X, winnerController.getWinner(field));
    }

    @Test
    public void testGetWinnerWhenNoWinnerSecondDiag() throws InvalidPointException {
        final WinnerController winnerController = new WinnerController();
        final Field<Figure> field = new Field<>(3);
        field.setFigure(new Point(2, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(0, 2), Figure.O);
        assertNull(winnerController.getWinner(field));
    }
}