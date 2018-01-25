package home.jenkins.small

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/")
    fun getDefault(): String {
        return "version 1"
    }

}