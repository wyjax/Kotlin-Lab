package com.wyjax.kotlinbasic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/api/good")
    fun get(): String {
        return "goodman"
    }
}
