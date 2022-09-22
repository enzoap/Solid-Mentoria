package com.example.solid_mentoria.openclosed

class ShowFinancialData(
    private val financialData: FinancialData
) {
    private val red = "\u001B[31m"
    private val reset = "\u001b[0m"

    fun show(platform: PlatformType) {
        if (platform == PlatformType.WEB) {
            println("Dados financeiros online ")
            println("Com base no ano fiscal de 2022")
            println("Vendas: ${changeColor(financialData.sales)}")
            println("Gastos: R$ ${changeColor(financialData.outgoing)},00")
            println("Lucro: R$ ${changeColor(financialData.profit)},00")
            println("Versão Web copyright 2022")
        } else if (platform == PlatformType.PDF){
            println("Dados financeiros online ")
            println("Com base no ano fiscal de 2022")
            println("Vendas: ${financialData.sales}")
            println("Gastos: R$ ${financialData.outgoing},00")
            println("Lucro: R$ ${financialData.profit},00")
            println("Versão Pdf copyright 2022")
        }

    }

    private fun changeColor(value: String): String {
        return if (value.first() == '-') {
            "$red$value"
        } else {
            "$reset$value"
        }
    }
}