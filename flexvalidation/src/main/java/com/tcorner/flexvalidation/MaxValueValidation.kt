package com.tcorner.flexvalidation

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
