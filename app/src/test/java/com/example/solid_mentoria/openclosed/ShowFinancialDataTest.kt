package com.example.solid_mentoria.openclosed

import org.junit.Test


class ShowFinancialDataTest {
    private val financialData = FinancialData(
        profit = "1000",
        sales = "2000",
        outgoing = "1000"
    )

    @Test
    fun `show should print the financial data on the site`() {
        val showFinancialData = ShowFinancialData(financialData)
        showFinancialData.show(PlatformType.WEB)
    }

    @Test
    fun `show should print the financial data on the site with color red`() {
        val showFinancialData = ShowFinancialData(
            financialData.copy(profit = "-1000", sales = "1000", outgoing = "2000")
        )
        showFinancialData.show(PlatformType.WEB)
    }

}