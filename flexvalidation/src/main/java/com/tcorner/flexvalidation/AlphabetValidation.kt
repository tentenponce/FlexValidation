package com.tcorner.flexvalidation

class AlphabetValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return (o as? String)?.matches("^[A-z\\s]+$".toRegex()) ?: false
    }
}
