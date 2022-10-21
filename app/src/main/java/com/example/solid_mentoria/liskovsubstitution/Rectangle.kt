package com.example.solid_mentoria.liskovsubstitution

open class Rectangle(
    open var width: Int,
    open var height: Int
) {

    fun area(): Int {
        return width * height
    }
}