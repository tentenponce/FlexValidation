package com.tcorner.flexvalidation

/**
 * check if first object (constructor parameter) is equal
 * to second object (isValid function parameter).
 */
class EqualValidation(private val equalTo: Any) : Validation() {

    override fun isValid(o: Any): Boolean {
        return o == equalTo
    }
}
