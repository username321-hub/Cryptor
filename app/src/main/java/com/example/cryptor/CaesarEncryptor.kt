package com.example.cryptor

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast

class CaesarEncryptor {
    private val shift = 3
    private var method = 0
    fun encrypt(source: String): String {
        Log.d(TAG, source)
        source.toCharArray().forEach {
            if (1072 <= it.toInt())
                if (1103 >= it.toInt())
                    method = 1
            if (97 <= it.toInt())
                if (122 >= it.toInt())
                    method = 2
        }
        if (method == 0) {
            return source
            method = 0
        }
        if (method == 1) {
            method = 0
            return String(source.map { symbol -> ((symbol.toInt() - 'а'.toInt() + shift).rem(33) + 'а'.toInt()).toChar() }
                    .toCharArray())
        }
        if (method == 2) {
            method = 0
            return String(source.map { symbol -> ((symbol.toInt() - 'a'.toInt() + shift).rem(26) + 'a'.toInt()).toChar() }
                    .toCharArray())
        } else
            return "return"

    }
}