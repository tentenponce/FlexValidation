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
}
