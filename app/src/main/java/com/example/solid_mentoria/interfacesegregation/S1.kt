package com.example.solid_mentoria.interfacesegregation

import com.example.solid_mentoria.interfacesegregation.component.Component


class S1(
    private val component: Component
) {
    fun metodo1() {
        component.metodo1()
    }
}