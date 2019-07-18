package com.tcorner.flexvalidation

import org.junit.Test

class EmailValidationTest {

    private val validation = EmailValidation()

    @Test
    fun `should return true if email is valid`() {
        assert(validation.isValid("test@yahoo.co"))
        assert(validation.isValid("test@yahoo.com"))
        assert(validation.isValid("test@gmail.com"))
        assert(validation.isValid("test@ubx.ph"))
        assert(validation.isValid("test@gmail.co"))
        assert(validation.isValid("test@outlook.ph"))
        assert(validation.isValid("test@outlook.com"))
    }

    @Test
    fun `should return false if email is invalid`() {
        assert(!validation.isValid("test@yahoo.c"))
        assert(!validation.isValid("test@yahoocom"))
        assert(!validation.isValid("test@gmail"))
        assert(!validation.isValid("test@ubx"))
    }
}
