package com.example.solid_mentoria.singleresponsability

class EmployeeSaver(private val name: String) {

    private val listWorks = mutableMapOf<String, Int>()

    fun save(hours: Int) {
        listWorks[name] = hours
    }
}