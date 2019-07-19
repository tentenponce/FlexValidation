package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * Returns true if string contains atleast 1 upper case
 */
class UpperCaseValidation : Validation() {

    companion object {
        private val UPPER_CASE_VALIDATION: Pattern = Pattern.compile("[A-Z ]")
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> UPPER_CASE_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
