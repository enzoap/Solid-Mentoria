package com.example.solid_mentoria.liskovsubstitution

class User(
   private val rectangle: Rectangle
) {

    fun calculateArea(): Int {
        return rectangle.area()
    }
}