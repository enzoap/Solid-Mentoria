package com.example.solid_mentoria.liskovsubstitution

import org.junit.Assert.*
import org.junit.Test

class UserTest {

    @Test
    fun `calculateArea should return 50 when width is 10 and height is 5`() {
        // Given
        val rectangle = Rectangle(width = 10, height = 5)
        val user = User(rectangle)

        val expected = 50

        // When
        val actual = user.calculateArea()

        // Then
        assertEquals(expected, actual)

    }

    @Test
    fun `calculateArea should return 100 when side is 10`() {
        // Given
        val square = Square(10)
        val user = User(square)
        val expected = 100

        // When
        val actual = user.calculateArea()

        // Then
        assertEquals(expected, actual)
    }
}