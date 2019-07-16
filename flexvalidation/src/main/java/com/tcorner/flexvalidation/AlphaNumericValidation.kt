package com.tcorner.flexvalidation

class AlphaNumericValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return (o as? String)?.matches("^[a-zA-Z0-9_\\s]*$".toRegex()) ?: false
    }
}
