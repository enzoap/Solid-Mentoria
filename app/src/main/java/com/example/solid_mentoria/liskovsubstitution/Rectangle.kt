package com.example.solid_mentoria.liskovsubstitution

class Rectangle(
    val width: Int,
    val height: Int
): Shape {

    override fun area(): Int {
        return width * height
    }
}