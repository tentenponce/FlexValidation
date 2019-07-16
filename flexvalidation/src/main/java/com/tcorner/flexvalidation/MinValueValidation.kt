package com.tcorner.flexvalidation

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
