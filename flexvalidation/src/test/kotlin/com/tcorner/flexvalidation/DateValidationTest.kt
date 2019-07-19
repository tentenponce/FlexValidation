package com.tcorner.flexvalidation

import org.junit.Test
import java.util.Calendar

class DateValidationTest {

    @Test
    fun `should return true if first date is before second date`() {
        val firstDate = Calendar.getInstance()

        firstDate.set(Calendar.MONTH, 0)
        firstDate.set(Calendar.DAY_OF_MONTH, 1)

        val secondDate = Calendar.getInstance()

        secondDate.set(Calendar.MONTH, 0)
        secondDate.set(Calendar.DAY_OF_MONTH, 2)

        val validation = DateValidation(firstDate)

        assert(validation.isValid(secondDate))
    }

    @Test
    fun `should return false if first date is equal second date`() {
        val firstDate = Calendar.getInstance()

        firstDate.set(Calendar.MONTH, 0)
        firstDate.set(Calendar.DAY_OF_MONTH, 1)
        firstDate.set(Calendar.HOUR_OF_DAY, 0)
        firstDate.set(Calendar.MINUTE, 0)
        firstDate.set(Calendar.SECOND, 0)
        firstDate.set(Calendar.MILLISECOND, 0)

        val secondDate = Calendar.getInstance()

        secondDate.set(Calendar.MONTH, 0)
        secondDate.set(Calendar.DAY_OF_MONTH, 1)
        secondDate.set(Calendar.HOUR_OF_DAY, 0)
        secondDate.set(Calendar.MINUTE, 0)
        secondDate.set(Calendar.SECOND, 0)
        secondDate.set(Calendar.MILLISECOND, 0)

        val validation = DateValidation(firstDate)

        assert(!validation.isValid(secondDate))
    }

    @Test
    fun `should return false if first date is greater than second date`() {
        val firstDate = Calendar.getInstance()

        firstDate.set(Calendar.MONTH, 0)
        firstDate.set(Calendar.DAY_OF_MONTH, 2)

        val secondDate = Calendar.getInstance()

        secondDate.set(Calendar.MONTH, 0)
        secondDate.set(Calendar.DAY_OF_MONTH, 1)

        val validation = DateValidation(firstDate)

        assert(!validation.isValid(secondDate))
    }
}
