package com.tcorner.flexvalidation

class RequiredValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.isNotEmpty()
            is Double -> o > 0
            is Int -> o > 0
            is List<*> -> o.size > 0
            else -> true
        }
    }
}
