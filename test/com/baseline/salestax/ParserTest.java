package com.baseline.salestax;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldConfirmThatAnItemHasAQuantity() {
        Parser parser = new Parser("1 book");

        assertTrue(parser.isValid());
    }

}