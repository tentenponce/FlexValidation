package com.tcorner.flexvalidation

/**
 * returns true if object's length is equal to the
 * defined length.
 *
 * given `length` is 10
 *
 * "1234567890" is true
 * listOf(1,2,3,4,5,6,7,8,9,0) is true
 */
class LengthValidation(val length: Int) : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.length == length
            is List<*> -> o.size == length
            else -> false
        }
    }
}
