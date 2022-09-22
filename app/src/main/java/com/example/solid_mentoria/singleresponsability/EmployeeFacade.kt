package com.example.solid_mentoria.singleresponsability


class EmployeeFacade(
    private val payCalculator: PayCalculator,
    private val hourReporter: HourReporter,
    private val employeesaver: EmployeeSaver
): EmployeeInterface {
    override fun calculatePay(payPerHour: Int): Int {
        return payCalculator.calculatePay(payPerHour)
    }

    override fun reportHours(hours: Int): Int {
        return hourReporter.reportHours(hours)
    }

    override fun save(hours: Int) {
        employeesaver.save(hours)
    }

}