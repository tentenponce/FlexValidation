package com.tcorner.flexvalidation

import java.util.Calendar

/**
 * Compare first date (constructor parameter) should be less than
 * the second date (isValid function parameter).
 *
 * Example:
 *
 * given format is yyyy-MM-dd
 * given first date is "2019-01-01"
 * given second date is "2019-01-02"
 *
 * The result will be true because first date is behind second date
 */
class DateValidation(val firstDate: Calendar) : Validation() {

    override fun isValid(o: Any): Boolean {
        val secondDate = o as Calendar
        return firstDate.time.before(secondDate.time)
    }
}
