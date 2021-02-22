package com.madrapps.jacoco

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MathTest {

    @Test
    fun testAdd() {
        val math = Arithmetic()
        val actual = math.add(3, 4)
        Assertions.assertEquals(7, actual)
    }
}