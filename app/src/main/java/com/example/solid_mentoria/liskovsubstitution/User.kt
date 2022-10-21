package com.example.solid_mentoria.liskovsubstitution

class User(
   private val rectangle: Shape
) {

    fun calculateArea(): Int {
        return rectangle.area()
    }
}