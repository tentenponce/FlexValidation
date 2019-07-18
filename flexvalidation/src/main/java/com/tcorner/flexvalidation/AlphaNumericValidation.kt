package com.tcorner.flexvalidation

/**
 * Allows alphabet AND numeric only.
 */
class AlphaNumericValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return (o as? String)?.matches("^[a-zA-Z0-9_\\s]*$".toRegex()) ?: false
    }
}
