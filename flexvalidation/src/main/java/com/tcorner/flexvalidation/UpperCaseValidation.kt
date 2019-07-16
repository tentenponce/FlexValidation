package com.tcorner.flexvalidation

import java.util.regex.Pattern

class UpperCaseValidation : Validation() {

    companion object {
        val UPPER_CASE_VALIDATION: Pattern = Pattern.compile("[A-Z ]")
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> UPPER_CASE_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
