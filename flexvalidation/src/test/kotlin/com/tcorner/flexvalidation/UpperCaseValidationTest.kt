package com.tcorner.flexvalidation

import org.junit.Test

class UpperCaseValidationTest {

    private val validation = UpperCaseValidation()

    @Test
    fun `should return true if all caps`() {
        assert(validation.isValid("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
    }

    @Test
    fun `should return true if it contains atleast 1 caps`() {
        assert(validation.isValid("abcdefghijklmnopqrstuvwxyZ"))
    }

    @Test
    fun `should return false if it no caps`() {
        assert(!validation.isValid("abcdefghijklmnopqrstuvwxyz"))
    }

    @Test
    fun `should return false if unsupported data type`() {
        assert(!validation.isValid(123))
    }
}
