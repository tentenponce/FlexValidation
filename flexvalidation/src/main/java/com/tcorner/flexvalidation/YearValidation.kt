package com.tcorner.flexvalidation

class YearValidation : Validation() {

    @Suppress("MagicNumber")
    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.matches("^\\d{1,10}$".toRegex()) && o.length == 4
            is Int -> o.toString().matches("^\\d{1,10}$".toRegex()) && o.toString().length == 4
            else -> false
        }
    }
}
