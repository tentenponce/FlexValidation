package com.tcorner.flexvalidation

import org.junit.Test

class MinMaxValidationTest {

    private val validation = MinMaxValidation(1, 10)

    @Test
    fun `should return true if its between`() {
        assert(validation.isValid("12345"))
        assert(validation.isValid(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `should return true if its length is equal to minimum`() {
        assert(validation.isValid("1"))
        assert(validation.isValid(listOf(1)))
    }

    @Test
    fun `should return true if its length is equal to maximum`() {
        assert(validation.isValid("1234567890"))
        assert(validation.isValid(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
    }

    @Test
    fun `should return false if its length is less than the minimum`() {
        assert(!validation.isValid(""))
        assert(!validation.isValid(listOf<String>()))
    }

    @Test
    fun `should return false if its length is greater than the maximum`() {
        assert(!validation.isValid("12345678901"))
        assert(!validation.isValid(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1)))
    }

    @Test
    fun `should return false if data type not supported`() {
        assert(!validation.isValid(1234567890))
    }
}
