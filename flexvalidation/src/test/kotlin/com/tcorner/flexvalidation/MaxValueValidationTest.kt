package com.tcorner.flexvalidation

import org.junit.Test

class MaxValueValidationTest {

    private val validation = MaxValueValidation(10f)

    @Test
    fun `should return true if less than the given maximum`() {
        assert(validation.isValid(9))
        assert(validation.isValid(9.0))
        assert(validation.isValid("9"))
    }

    @Test
    fun `should return true if equal the given maximum`() {
        assert(validation.isValid(10))
        assert(validation.isValid(10.0))
        assert(validation.isValid("10"))
    }

    @Test
    fun `should return false if greater than the given maximum`() {
        assert(!validation.isValid(11))
        assert(!validation.isValid(11.0))
        assert(!validation.isValid("11"))
    }

    @Test
    fun `should return false if invalid number`() {
        assert(!validation.isValid("abc"))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(listOf("A")))
    }
}
