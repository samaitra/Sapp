package com.example.sapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform