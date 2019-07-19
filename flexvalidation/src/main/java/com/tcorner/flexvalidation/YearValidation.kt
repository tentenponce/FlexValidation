package com.tcorner.flexvalidation

/**
 * validates if number is a valid year, validates only
 * by its length and characters
 *
 * 2000 is true
 * 200 is false
 * 200A is false
 */
class YearValidation : Validation() {

    @Suppress("MagicNumber")
    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.matches("^\\d{1,10}$".toRegex()) && o.length == 4
            is Int -> o.toString().matches("^\\d{1,10}$".toRegex()) && o.toString().length == 4
            else -> false
        }
    }
}
