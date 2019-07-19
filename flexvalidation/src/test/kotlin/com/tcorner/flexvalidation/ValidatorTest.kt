package com.tcorner.flexvalidation

import org.junit.Test

class ValidatorTest {

    @Test
    fun `should return first validation that will fail`() {
        assert(Validator.validate(
            "password",
            arrayOf(
                AlphabetValidation(),
                NumberValidation()
            )) is NumberValidation)
    }

    @Test
    fun `should return null if validation succeeds`() {
        assert(Validator.validate(
            "password123",
            arrayOf(
                AlphabetValidation(),
                NumberValidation()
            )) == null)
    }
}
