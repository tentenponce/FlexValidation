package com.tcorner.flexvalidation

import java.util.regex.Pattern

class NumberValidation : Validation() {

    companion object {
        val NUMBER_VALIDATION: Pattern = Pattern.compile("[0-9 ]")
    }

    override fun isValid(o: Any): Boolean {
        return if (o is String) {
            NUMBER_VALIDATION.matcher(o).find()
        } else false
    }
}
