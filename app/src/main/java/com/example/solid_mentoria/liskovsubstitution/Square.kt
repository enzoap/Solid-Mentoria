package com.example.solid_mentoria.liskovsubstitution

class Square(val side: Int) : Shape {
    override fun area(): Int {
        return side * side
    }
}