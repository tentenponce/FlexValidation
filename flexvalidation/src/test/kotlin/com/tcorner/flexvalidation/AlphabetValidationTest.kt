package com.tcorner.flexvalidation

import org.junit.Test

class AlphabetValidationTest {

    private val validation = AlphabetValidation()

    @Test
    fun `should return true if contains alphabet only`() {
        assert(validation.isValid("abcdefghijklmnopqrstuvwxyz"))
        assert(validation.isValid("aeiou"))
        assert(validation.isValid("bcdfghjklmnpqrstvwxyz"))
    }

    @Test
    fun `should return true if contains alphabet and numeric characters`() {
        assert(validation.isValid("abc123"))
    }

    @Test
    fun `should return true if contains alphabet and special characters`() {
        assert(validation.isValid("abc!@#$"))
    }

    @Test
    fun `should return false if numeric only`() {
        assert(!validation.isValid("123456"))
    }

    @Test
    fun `should return false if special characters only`() {
        assert(!validation.isValid("!@#$%*%#"))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(1234567890))
    }
}
