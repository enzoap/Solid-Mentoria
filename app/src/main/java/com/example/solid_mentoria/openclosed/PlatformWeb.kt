package com.example.solid_mentoria.openclosed

class PlatformWeb(
    private val financialData: FinancialData
): Platform {

    private val red = "\u001B[31m"
    private val reset = "\u001b[0m"

    override fun show() {
        println("Dados financeiros online ")
        println("Com base no ano fiscal de 2022")
        println("Vendas: ${changeColor(financialData.sales)}")
        println("Gastos: R$ ${changeColor(financialData.outgoing)},00")
        println("Lucro: R$ ${changeColor(financialData.profit)},00")
        println("Versão Web copyright 2022")
    }

    private fun changeColor(value: String): String {
        return if (value.first() == '-') {
            "$red$value"
        } else {
            "$reset$value"
        }
    }
}