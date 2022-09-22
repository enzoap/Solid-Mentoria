package com.example.solid_mentoria.singleresponsability

interface EmployeeInterface {
    fun calculatePay(payPerHour: Int): Int
    fun reportHours(hours: Int): Int
    fun save(hours: Int)
}