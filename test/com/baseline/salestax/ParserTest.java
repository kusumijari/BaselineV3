package com.baseline.salestax;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
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

        assertFalse(parser.isBasic());
    }

    @Test
    public void shouldReturnTrueIfTheItemIsAChocolate() {
        Parser parser = new Parser("1 chocolate bar");

        assertFalse(parser.isBasic());
    }

    @Test
    public void shouldReturnTrueIfTheItemContainsChocolates() {
        Parser parser = new Parser("1 bar of chocolates");

        assertFalse(parser.isBasic());
    }

    @Test
    public void shouldReturnTrueIfTheItemContainsPills() {
        Parser parser = new Parser("1 packet of pills");

        assertFalse(parser.isBasic());
    }


}