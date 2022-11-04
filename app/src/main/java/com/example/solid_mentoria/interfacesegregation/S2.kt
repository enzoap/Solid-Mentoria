package com.example.solid_mentoria.interfacesegregation

class S2(
    private val s2Adapter: S2Adapter
) {
    fun metodo2() {
        s2Adapter.metodo2()
    }
}