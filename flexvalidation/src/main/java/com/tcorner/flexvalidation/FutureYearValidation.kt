package com.tcorner.flexvalidation

import java.util.Calendar

class FutureYearValidation : Validation() {

    override fun isValid(o: Any): Boolean {
        return when (o) {
            is String -> o.toIntOrNull() != null &&
                Integer.parseInt(o) <= Calendar.getInstance().get(Calendar.YEAR)
            is Int -> o <= Calendar.getInstance().get(Calendar.YEAR)
            else -> false
        }

    }
}
