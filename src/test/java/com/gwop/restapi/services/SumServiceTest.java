package com.gwop.restapi.services;

import org.assertj.core.api.IntegerAssert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumServiceTest {
    @Test
    void testIfTheClassSumTwoNumbers() {
        SumService sumService = new SumService(1, 2);
        int result = sumService.sumNumbers();
        assertSame(3, result);
        assertNotNull(result);
        assertNotEquals(0, result);
    }
}