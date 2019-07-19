package com.tcorner.flexvalidation

import org.junit.Test

class NumberValidationTest {

    private val validation = NumberValidation()

    @Test
    fun `should return true if numbers only`() {
        assert(validation.isValid("1234567890"))
    }

    @Test
    fun `should return true if it contains alphabet`() {
        assert(validation.isValid("1234567890a"))
    }

    @Test
    fun `should return true if it contains special characters`() {
        assert(validation.isValid("1234567890!"))
    }

    @Test
    fun `should return false if alphabet only`() {
        assert(!validation.isValid("abcdef"))
    }

    @Test
    fun `should return false if special characters only`() {
        assert(!validation.isValid("!@#$%^&*("))
    }

    @Test
    fun `should return false if not supported data type`() {
        assert(!validation.isValid(1234))
        assert(!validation.isValid(listOf("1", "2")))
    }
}
