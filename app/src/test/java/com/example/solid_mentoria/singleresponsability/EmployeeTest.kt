package com.example.solid_mentoria.singleresponsability

import org.junit.Test
import org.junit.Assert.*

internal class EmployeeTest {
    private val name = "Teste"

    private val employee: EmployeeInterface = EmployeeFacade(
        payCalculator = PayCalculator(),
        hourReporter = HourReporter(),
        employeesaver = EmployeeSaver(name)
    )

    @Test
    fun `calculatePay should return the payment`() {
        // Given
        val expected = 2000

        // When
        val actual = employee.calculatePay(10)

        // Then
        assertEquals(expected, actual)

    }

    @Test
    fun `reportHours should return the hours plus additional hours`() {
        // Given
        val expected = 162

        // When
        val actual = employee.reportHours(2)

        // Then
        assertEquals(expected, actual)
    }
}