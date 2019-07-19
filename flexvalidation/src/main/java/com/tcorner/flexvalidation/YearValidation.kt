package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * validates if number is a valid year, validates only
 * by its length and characters
 *
 * 2000 is true
 * 200 is false
 * 200A is false
 */
class YearValidation : Validation() {

    companion object {
        private val YEAR_VALIDATION: Pattern = Pattern.compile("^\\d{1,10}\$")
        private const val YEAR_LENGTH = 4
    }

    @Suppress("MagicNumber")
    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.matches(YEAR_VALIDATION.toRegex()) && o.length == YEAR_LENGTH
            is Int -> o.toString().matches(YEAR_VALIDATION.toRegex()) && o.toString().length == YEAR_LENGTH
            else -> false
        }
    }
}
