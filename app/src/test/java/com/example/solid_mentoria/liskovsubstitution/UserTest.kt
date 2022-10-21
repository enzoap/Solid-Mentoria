package com.example.solid_mentoria.liskovsubstitution

import junit.framework.TestCase.assertEquals
import org.junit.Test

class UserTest {
    @Test
    fun `calculateArea should return 50 when width is 10 and height is 5`() {
        // Given
        val rectangle = Rectangle(width = 10, height = 5)
        val square = Square(side = 10)
        val user = User(rectangle)
//        val user = User(square)

        val expected = 50

        // When
        val actual = user.calculateArea()

        // Then
        assertEquals(expected, actual)
    }
}