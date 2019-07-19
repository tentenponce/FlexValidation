package com.tcorner.flexvalidation

import org.junit.Test

class YearValidationTest {

    private val validation = YearValidation()

    @Test
    fun `should return true if length is 4`() {
        assert(validation.isValid("2000"))
        assert(validation.isValid(2000))
    }

    @Test
    fun `should return false if contains not number`() {
        assert(!validation.isValid("200A"))
    }

    @Test
    fun `should return false if not supported data type`() {
        assert(!validation.isValid(2000f))
        assert(!validation.isValid(2000.0))
        assert(!validation.isValid(2000L))
    }
}
