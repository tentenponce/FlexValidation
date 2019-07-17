package com.tcorner.flexvalidation

class LengthValidation(val min: Int) : Validation() {
    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.length == min
            else -> false
        }
    }
}
