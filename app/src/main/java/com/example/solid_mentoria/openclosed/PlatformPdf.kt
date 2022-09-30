package com.example.solid_mentoria.openclosed

class PlatformPdf(
    private val financialData: FinancialData
): Platform {

    override fun show() {
        println("Dados financeiros online ")
        println("Com base no ano fiscal de 2022")
        println("Vendas: ${financialData.sales}")
        println("Gastos: R$ ${financialData.outgoing},00")
        println("Lucro: R$ ${financialData.profit},00")
        println("Versão Pdf copyright 2022")
    }
}