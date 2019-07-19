package com.tcorner.flexvalidation

import org.junit.Test

class SpecialCharacterValidationTest {

    private val validation = SpecialCharacterValidation()

    @Test
    fun `should return true if special characters only`() {
        assert(validation.isValid("!@#$%^&*()"))
    }

    @Test
    fun `should return true if it contains special characters and alphabet`() {
        assert(validation.isValid("!@#$%^&*()abc"))
    }

    @Test
    fun `should return true if it contains special characters and numeric`() {
        assert(validation.isValid("!@#$%^&*()123"))
    }

    @Test
    fun `should return true if it contains special characters and both alphabet and numeric`() {
        assert(validation.isValid("!@#$%^&*()123abc"))
    }

    @Test
    fun `should return false if numeric only`() {
        assert(!validation.isValid("1234567890"))
    }

    @Test
    fun `should return false if alphabet only`() {
        assert(!validation.isValid("abcdefghijklmnopqrstuvwxyz"))
    }

    @Test
    fun `should return false if alphabet and numeric only`() {
        assert(!validation.isValid("abcdefghijklmnopqrstuvwxyz1234567890"))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(listOf("abcdefghijklmnopqrstuvwxyz1234567890")))

    }
}
