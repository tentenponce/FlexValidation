package com.tcorner.flexvalidation

object Validator {

    /**
     * iterate each validation and returns the first validation found
     *
     * @param s           string to validate
     * @param validations array of validations
     * @return first validation that is invalid
     */

    fun validate(s: Any, validations: Array<Validation>): Validation? {
        for (validation in validations) {
            if (!validation.isValid(s)) {
                return validation
            }
        }
        return null
    }
}
