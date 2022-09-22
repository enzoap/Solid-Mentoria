package com.example.solid_mentoria.singleresponsability

private const val WORK_HOURS = 8
private const val WORK_DAY = 4
private const val WORK_WEEK = 5

class HourReporter {

    fun reportHours(hours: Int): Int {
        return regularHours() + hours
    }

    private fun regularHours(): Int {
        return (WORK_HOURS * WORK_DAY) * WORK_WEEK
    }

}