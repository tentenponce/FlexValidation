package com.ubx.validation

import com.tcorner.flexvalidation.Validation

class LengthValidation(val mMin: Int) : Validation() {

    override fun isValid(o: Any): Boolean {
        return if (o is String) {

            o.length == mMin
        } else false
    }
}
