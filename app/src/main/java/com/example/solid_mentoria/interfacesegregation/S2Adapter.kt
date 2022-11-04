package com.example.solid_mentoria.interfacesegregation

import com.example.solid_mentoria.interfacesegregation.component.Component

class S2Adapter(
    private val component: Component
) {
    fun metodo2() {
        component.metodo2()
    }
}