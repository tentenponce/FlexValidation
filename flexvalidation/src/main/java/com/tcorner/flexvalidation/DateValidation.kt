package com.tcorner.flexvalidation

import java.util.Calendar

class DateValidation(private val mFromDate: Calendar) : Validation() {

    override fun isValid(o: Any): Boolean {
        val toDate = o as Calendar
        return mFromDate.time.before(toDate.time)
    }
}
