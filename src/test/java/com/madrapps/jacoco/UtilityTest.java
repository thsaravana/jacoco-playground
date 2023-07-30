package com.madrapps.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilityTest {

    @Test
    public void testAdd() {
        final Utility utils = new Utility();
        int actual = utils.add(2, 3);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSquare() {
        final Utility utils = new Utility();
        int actual = utils.square(3);
        Assertions.assertEquals(9, actual);
    }
}

