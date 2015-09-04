package com.baseline.salestax;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldConfirmThatAnItemHasAQuantity() {
        Parser parser = new Parser("1 book");

        assertTrue(parser.isValid());
    }

    @Test
    public void shouldReturnTrueIfTheItemIsABook() {
        Parser parser = new Parser("1 book");

        assertTrue(parser.isBook());
    }

    @Test
    public void shouldReturnTrueIfTheItemIsAChocolate() {
        Parser parser = new Parser("1 chocolate bar");

        assertTrue(parser.isFood());
    }

    @Test
    public void shouldReturnTrueIfTheItemContainsChocolates() {
        Parser parser = new Parser("1 bar of chocolates");

        assertTrue(parser.isFood());
    }
}