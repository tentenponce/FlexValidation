package com.tcorner.flexvalidation

/**
 * Allows alphabet OR numeric only.
 *
 * Example:
 *
 * "abc123" is true
 * "abc" is true
 * "123" is true
 * "abc123!@#$" is false
 */
class AlphaNumericValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return (o as? String)?.matches("^[a-zA-Z0-9_\\s]*$".toRegex()) ?: false
    }
}
