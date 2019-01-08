package com.devin.kotlinblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBlogApplication

fun main(args: Array<String>) {
    runApplication<KotlinBlogApplication>(*args)
}

