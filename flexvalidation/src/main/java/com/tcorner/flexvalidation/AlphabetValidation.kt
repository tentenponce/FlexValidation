package com.tcorner.flexvalidation

/**
 * Allows alphabet characters only.
 *
 * "abc" is true
 * "abc123" is false
 */
class AlphabetValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return (o as? String)?.matches("^[A-z\\s]+$".toRegex()) ?: false
    }
}
