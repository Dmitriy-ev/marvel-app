package com.wiki.marvel_app.util

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

class Constants {

    companion object {
        const val BASE_URL = "https://gateway.marvel.com"
        val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
        const val API_KEY = "3d51be48455680edcba3b530c5913db6"
        const val PRIVATE_KEY = "dfefe2e21128ed6f19826a1a79012a9ea332a336"
        fun hash(): String {
            val input = "$timeStamp$PRIVATE_KEY$API_KEY"
            val md = MessageDigest.getInstance("MD5")
            return BigInteger(1, md.digest(input.toByteArray())).toString(16)
        }
    }
}