package com.tcorner.flexvalidation

import org.junit.Test

class MinValueValidationTest {

    private val validation = MinValueValidation(10f)

    @Test
    fun `should return true if number is greater`() {
        assert(validation.isValid(11))
        assert(validation.isValid("11"))
        assert(validation.isValid(11.0))
    }

    @Test
    fun `should return true if number is equal`() {
        assert(validation.isValid(10))
        assert(validation.isValid("10"))
        assert(validation.isValid(10.0))
    }

    @Test
    fun `should return false if number is less than`() {
        assert(!validation.isValid(9))
        assert(!validation.isValid("9"))
        assert(!validation.isValid(9.0))
    }

    @Test
    fun `should return false if string cannot be parsed to number`() {
        assert(!validation.isValid("abc123"))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(listOf(10)))
    }
}
