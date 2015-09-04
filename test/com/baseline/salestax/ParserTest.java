package com.baseline.salestax;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ParserTest {

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

    @Test
    public void shouldReturnTrueifTheItemIsImported() {
        Parser parser = new Parser("1 imported box of chocolates");

        assertTrue(parser.isImported());
    }

    @Test
    public void shouldReturnTheQuantity() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals(1, parser.extractQuantity());
    }

    @Test
    public void shouldReturnTheItemName() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals("book", parser.extractItemaName());
    }

    @Test
    public void shouldReturnTheItemPrice() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals(12.49, parser.extractPrice(), 0.05);
    }
}