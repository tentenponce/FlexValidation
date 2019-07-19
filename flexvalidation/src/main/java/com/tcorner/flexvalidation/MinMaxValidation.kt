package com.tcorner.flexvalidation

/**
 * validates given string or list, gets its length
 * and check if its between the given min and max
 *
 * given min is 1, max is 10
 * 123456789 is true
 * "" is false
 * 12345678901 is false
 */
class MinMaxValidation(val min: Int, val max: Int) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.length in min..max
            is List<*> -> return o.size in min..max
            else -> false
        }
    }
}
