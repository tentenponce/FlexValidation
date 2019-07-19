package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * Returns true if string contains atleast 1 special character
 */
class SpecialCharacterValidation : Validation() {

    companion object {
        private val SPECIAL_CHAR_VALIDATION: Pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE)
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> SPECIAL_CHAR_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
