package com.tcorner.flexvalidation

import org.junit.Test

class AlphaNumericValidationTest {

    private val validation = AlphaNumericValidation()

    @Test
    fun `should return true if contains alphabet and numeric`() {
        assert(validation.isValid("abc123"))
    }

    @Test
    fun `should return true if it contains alphabet only`() {
        assert(validation.isValid("abc"))
    }

    @Test
    fun `should return true if it contains numeric only`() {
        assert(validation.isValid("123"))
    }

    @Test
    fun `should return false if it contains special characters`() {
        assert(!validation.isValid("abc123!@#$%"))
    }
}
