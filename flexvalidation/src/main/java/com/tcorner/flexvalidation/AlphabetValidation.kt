package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * Returns true if string contains atleast 1 alphabet.
 *
 * Example:
 *
 * "abc" is true
 * "abc123" is true
 * "abc!@#" is true
 * "123" is false
 * "!@#$" is false
 */
class AlphabetValidation : Validation() {

    companion object {
        private val ALPHABET_VALIDATION: Pattern = Pattern.compile("[A-Za-z]")
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> ALPHABET_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
