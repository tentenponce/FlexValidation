package com.tcorner.flexvalidation

class MinMaxValidation(private val min: Int, private val max: Int) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.length in min..max
            is List<*> -> return o.size in min..max
            else -> false
        }
    }
}
