package com.madrapps.jacoco

class Arithmetic {

    fun add(a: Int, b: Int): Int {
        if (a < b) {
            // Do nothing
        }
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        if (a > b) {
            return a - b
        } else {
            return a - b
        }
    }

    fun multiply(a: Int, b: Int): Int {
        // Some comment here
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        if (a > b) {
            return a / b
        } else {
            return a / b
        }
    }

    fun modulo(a: Int, b: Int): Int {
        // Some comment for non-covered method
        return a % b
    }

    fun area(a: Int, b: Int): Int {
        return a * b
    }

    fun volume(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }
}
