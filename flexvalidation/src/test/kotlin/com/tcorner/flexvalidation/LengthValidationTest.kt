package com.tcorner.flexvalidation

import org.junit.Test

class LengthValidationTest {

    private val validation = LengthValidation(10)

    @Test
    fun `should return true if string length is equal to the defined length`() {
        assert(validation.isValid("1234567890"))
    }

    @Test
    fun `should return true if list size is equal to the defined length`() {
        assert(validation.isValid(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
    }

    @Test
    fun `should return false if string length is not equal to the defined length`() {
        assert(!validation.isValid("12345678901"))
    }

    @Test
    fun `should return false if list size is not equal to the defined length`() {
        assert(!validation.isValid(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1)))
    }

    @Test
    fun `should return false data type not supported`() {
        assert(!validation.isValid(1234567890))
    }
}
