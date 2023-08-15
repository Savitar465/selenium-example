package com.usecc.selenium

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Main {
    fun main(args: Array<String>) {
        println("Hello World!")
        val we: WebDriver = ChromeDriver()
        we.get("https://kotlinlang.org/docs/basic-syntax.html")
        val wel = we.findElement(By.xpath("//a[.//div[@data-test='jetbrains-logo']]"))
        wel.click()

    }
}