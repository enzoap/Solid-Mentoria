package com.example.solid_mentoria.singleresponsability

private const val WORK_HOURS = 8
private const val WORK_DAY = 5
private const val WORK_WEEK = 5
class Employee(
    private val name: String
) {

   private val listWorks = mutableMapOf<String, Int>()

    fun calculatePay(payPerHour: Int): Int {
        return regularHours() * payPerHour
    }

    fun reportHours(hours: Int): Int {
        return regularHours() + hours
    }

    fun save(hours: Int) {
        listWorks[name] = hours
    }

    private fun regularHours(): Int {
        return (WORK_HOURS * WORK_DAY) * WORK_WEEK
    }
}