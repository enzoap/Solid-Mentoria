package com.example.solid_mentoria.singleresponsability

private const val WORK_HOURS = 8
private const val WORK_DAY = 5
private const val WORK_WEEK = 5

class PayCalculator {

    fun calculatePay(payPerHour: Int): Int {
        return regularHours() * payPerHour
    }

    private fun regularHours(): Int {
        return (WORK_HOURS * WORK_DAY) * WORK_WEEK
    }

}