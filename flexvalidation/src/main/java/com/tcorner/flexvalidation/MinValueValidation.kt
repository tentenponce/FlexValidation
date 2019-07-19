package com.tcorner.flexvalidation

/**
 * returns true if the number is equal or greater than
 * the given minimum number
 *
 * given min is 10
 * 10 is true
 * 11 is true
 * 9 is false
 */
class MinValueValidation(val min: Float) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> try {
                o.toFloat() >= min
            } catch (e: NumberFormatException) {
                false
            }
            is Double -> o >= min
            is Int -> o >= min
            else -> false
        }
    }
}
