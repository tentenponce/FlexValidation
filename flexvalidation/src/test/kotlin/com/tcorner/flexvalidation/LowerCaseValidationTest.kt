package com.tcorner.flexvalidation

import org.junit.Test

class LowerCaseValidationTest {

    private val validation = LowerCaseValidation()

    @Test
    fun `should return true if all characters are in lowercase`() {
        assert(validation.isValid("abcdefg"))
    }

    @Test
    fun `should return true if there's atleast 1 lowercase character`() {
        assert(validation.isValid("aBCDEFG"))
    }

    @Test
    fun `should return false if there's no lowercase characters`() {
        assert(!validation.isValid("ABCDEFG"))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(12345678))
    }
}
