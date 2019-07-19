package com.tcorner.flexvalidation

import java.util.regex.Pattern

class NumberValidation : Validation() {

    companion object {
        private val NUMBER_VALIDATION: Pattern = Pattern.compile("[0-9]")
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> NUMBER_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
