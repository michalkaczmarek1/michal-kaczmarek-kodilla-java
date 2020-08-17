package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for square")
    class TestsSquare {

        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("square", 4);

            //When
            shapeCollector.addFigure(square);

            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());

        }

        @Test
        void testRemoveSquareNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("square", 4);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            assertFalse(result);

        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("square", 4);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);


            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());

        }

        @Test
        void testGetSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("square", 4);
            shapeCollector.addFigure(square);

            //When
            Shape result = shapeCollector.getFigure(0);


            //Then
            assertEquals(square, result);

        }

    }

    @Nested
    @DisplayName("Tests for circle")
    class TestsCircle {

        @Test
        void testAddCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 10);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());

        }

        @Test
        void testRemoveCircleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 10);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            assertFalse(result);

        }

        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 10);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);


            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());

        }

        @Test
        void testGetCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 10);
            shapeCollector.addFigure(circle);

            //When
            Shape result = shapeCollector.getFigure(0);


            //Then
            assertEquals(circle, result);

        }

    }

    @Nested
    @DisplayName("Tests for triangle")
    class TestsTriangle {

        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("triangle", 5, 8);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());

        }

        @Test
        void testRemoveTriangleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("triangle", 5, 8);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            assertFalse(result);

        }

        @Test
        void testRemoveTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("triangle", 5, 8);
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);


            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());

        }

        @Test
        void testGetTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("triangle", 5, 8);
            shapeCollector.addFigure(triangle);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            assertEquals(triangle, result);

        }

    }

    @Nested
    @DisplayName("Tests general")
    class TestsGeneral {

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("square", 4);
            Shape circle = new Circle("circle", 10);
            Shape triangle = new Triangle("triangle", 5, 8);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            String stringFigures = "squarecircletriangle";

            //When
            String result = shapeCollector.showFigures();

            //Then
            assertEquals(stringFigures, result);

        }

    }

}
