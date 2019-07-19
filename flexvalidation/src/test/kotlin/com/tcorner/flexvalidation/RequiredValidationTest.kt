package com.tcorner.flexvalidation

import org.junit.Test

class RequiredValidationTest {

    private val validation = RequiredValidation()

    @Test
    fun `should return true if string is not empty`() {
        assert(validation.isValid("abc"))
    }

    @Test
    fun `should return false if string is empty`() {
        assert(!validation.isValid(""))
    }

    @Test
    fun `should return true if integer is greater than 0`() {
        assert(validation.isValid(1))
    }

    @Test
    fun `should return true if integer is less than 0`() {
        assert(validation.isValid(-1))
    }

    @Test
    fun `should return false if integer is 0`() {
        assert(!validation.isValid(0))
    }

    @Test
    fun `should return true if double is greater than 0`() {
        assert(validation.isValid(1.0))
    }

    @Test
    fun `should return true if double is less than 0`() {
        assert(validation.isValid(-1.0))
    }

    @Test
    fun `should return false if double is 0`() {
        assert(!validation.isValid(0.0))
    }

    @Test
    fun `should return true if list is not empty`() {
        assert(validation.isValid(listOf(1)))
    }

    @Test
    fun `should return false if list is empty`() {
        assert(!validation.isValid(listOf<String>()))
    }

    @Test
    fun `should return true if data type not supported`() {
        assert(validation.isValid(Any()))
    }
}
