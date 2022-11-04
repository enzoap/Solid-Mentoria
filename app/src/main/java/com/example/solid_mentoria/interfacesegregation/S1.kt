package com.example.solid_mentoria.interfacesegregation

class S1(
    private val s1Adapter: S1Adapter
) {
    fun metodo1() {
        s1Adapter.metodo1()
    }
}