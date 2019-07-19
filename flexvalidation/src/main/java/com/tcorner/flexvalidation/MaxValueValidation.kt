package com.tcorner.flexvalidation

/**
 * Returns true if number is equal or less than the given
 * maximum.
 *
 * given max is 10
 * 7 is true
 * 10 is true
 * 11 is false
 */
class MaxValueValidation(val max: Float) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> try {
                o.toFloat() <= max
            } catch (e: NumberFormatException) {
                false
            }
            is Double -> o <= max
            is Int -> o <= max
            else -> false
        }
    }
}
