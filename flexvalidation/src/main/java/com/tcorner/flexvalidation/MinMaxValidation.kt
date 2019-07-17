package com.tcorner.flexvalidation

class MinMaxValidation(val min: Int, val max: Int) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.length in min..max
            is List<*> -> return o.size in min..max
            else -> false
        }
    }
}
