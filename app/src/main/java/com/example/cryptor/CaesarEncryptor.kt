package com.example.cryptor

class CaesarEncryptor {
    private val shift = 3
    fun encrypt(source: String): String {
        return String(source.map { symbol -> ((symbol.toInt() - 'a'.toInt() + shift).rem(26) + 'a'.toInt()).toChar() }
            .toCharArray())
    }
}