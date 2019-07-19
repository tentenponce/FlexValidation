package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * returns true if string has atleast 1 lowercase character.
 */
class LowerCaseValidation : Validation() {

    companion object {
        val LOWER_CASE_VALIDATION: Pattern = Pattern.compile("[a-z ]")
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> LOWER_CASE_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
