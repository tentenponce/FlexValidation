package com.tcorner.flexvalidation

import java.util.regex.Pattern

class SpecialCharacterValidation : Validation() {

    companion object {
        val SPECIAL_CHAR_VALIDATION: Pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE)
    }

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> SPECIAL_CHAR_VALIDATION.matcher(o).find()
            else -> false
        }
    }
}
