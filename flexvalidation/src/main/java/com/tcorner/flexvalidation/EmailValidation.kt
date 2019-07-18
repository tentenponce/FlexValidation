package com.tcorner.flexvalidation

import java.util.regex.Pattern

/**
 * returns true if email is valid, false otherwise.
 */
class EmailValidation : Validation() {

    companion object {
        private val EMAIL_PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
    }

    override fun isValid(o: Any): Boolean {
        return if (o is String) {
            EMAIL_PATTERN.matcher(o).find()
        } else false
    }
}
