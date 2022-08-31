package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.view.RedirectView


@RestController
class HtmlController {

    @GetMapping("/")
    fun hello() = "This is Demo Service"

    @RequestMapping("/signup")
    fun  signup(): RedirectView{
        val ret = RedirectView("https://ais.co.th")
        return ret
    }

}