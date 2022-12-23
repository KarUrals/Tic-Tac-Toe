package kar.urals.model;

import kar.urals.exceptions.AlreadyOccupiedException;
import kar.urals.exceptions.InvalidPointException;
import kar.urals.exceptions.XOException;
import org.junit.jupiter.api.Test;
import java.awt.Point;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void testGetSize() {
        final Field<Figure> field = new Field<>(3);

        assertEquals(3, field.getSize());
    }

    @Test
    void testSetFigure() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(expectedFigure, actualFigure);
    }

//    @Test
//    void testSetFigureWhenAlreadyOccupied() throws XOException {
//        final Field<Figure> field = new Field<>();
//        final Point inputPoint = new Point(0, 0);
//        final Figure inputFigure = Figure.X;
//
//        field.setFigure(inputPoint, inputFigure);
//        try {
//            field.setFigure(inputPoint, inputFigure);
//            fail();
//        } catch (final AlreadyOccupiedException e) {}
//    }

    @Test
    void testSetFigureToIncorrectCoordinate() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);
        final Figure inputFigure = Figure.X;

        try {
            field.setFigure(inputPoint, inputFigure);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void testGetFigureWhenFigureIsNotSet() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    void testGetFigureWhenXIsLessThenZero() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(-1, 0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void testGetFigureWhenYIsLessThenZero() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(0, -1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void testGetFigureWhenXIsMoreThenSize() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void testGetFigureWhenYIsMoreThenSize() throws XOException {
        final Field<Figure> field = new Field<>(3);
        final Point inputPoint = new Point(0, field.getSize() + 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }
}