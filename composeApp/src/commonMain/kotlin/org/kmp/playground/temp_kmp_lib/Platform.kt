package org.kmp.playground.temp_kmp_lib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform