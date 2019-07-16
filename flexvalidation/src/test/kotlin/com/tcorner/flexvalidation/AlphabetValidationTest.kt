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
    fun `should return false if contains non-alphabet characters`() {
        assert(!validation.isValid("abc123"))
        assert(!validation.isValid("abc!@#"))
        assert(!validation.isValid("abc,./"))
    }
}
