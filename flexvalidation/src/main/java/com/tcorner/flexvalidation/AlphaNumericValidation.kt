package com.tcorner.flexvalidation

import java.util.regex.Pattern

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

    companion object {
        private val ALPHANUMERIC_VALIDATION: Pattern = Pattern.compile("^[a-zA-Z0-9_\\s]*\$")
    }

    override fun isValid(o: Any): Boolean {
        return when(o) {
            is String -> o.matches(ALPHANUMERIC_VALIDATION.toRegex())
            else -> false
        }
    }
}
