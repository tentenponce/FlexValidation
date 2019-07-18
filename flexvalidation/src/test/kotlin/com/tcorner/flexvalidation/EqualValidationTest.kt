package com.tcorner.flexvalidation

import org.junit.Test

class EqualValidationTest {

    @Test
    fun `should return true if strings are equal`() {
        val first = "test"
        val second = "test"

        val validation = EqualValidation(first)

        assert(validation.isValid(second))
    }

    @Test
    fun `should return false if strings are not equal`() {
        val first = "test"
        val second = "test "

        val validation = EqualValidation(first)

        assert(!validation.isValid(second))
    }
}