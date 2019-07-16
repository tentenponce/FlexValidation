package com.tcorner.flexvalidation

class EqualValidation(private val equalTo: Any) : Validation() {

    override fun isValid(o: Any): Boolean {
        return o == equalTo
    }
}
