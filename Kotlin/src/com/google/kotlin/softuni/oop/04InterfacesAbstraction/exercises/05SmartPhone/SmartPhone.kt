package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.exercises.`05SmartPhone`

import java.util.regex.Pattern

class SmartPhone(numbers:List<String>, urls: List<String>) : Browsable, Callable {

    private var numbers: List<String> = numbers
        set(value) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("Empty phonebook!")
            }
            field = value
        }
    private var urls: List<String> = urls
        set(value) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("Empty browser!")
            }
            field = value
        }

    override fun browse(): String {
        val pattern = Pattern.compile("^[\\D]+$")
        val sb = StringBuilder()
        for (url in urls) {
            if (this.isValid(url, pattern)) {
                sb
                    .append(String.format("Browsing: %s!", url))
                    .append(System.lineSeparator())
            } else {
                sb
                    .append("Invalid URL!")
                    .append(System.lineSeparator())
            }
        }
        return sb.toString().trim()
    }

    override fun call(): String {
        val pattern = Pattern.compile("^[0-9]+$")
        val sb = StringBuilder()

        for (number in numbers) {
            if (this.isValid(number, pattern)) {
                sb.append("Calling...%s".format(number)).append(System.lineSeparator())
            } else {
                sb.append("Invalid number!").append(System.lineSeparator())
            }
        }

        return sb.toString().trim()
    }

    private fun isValid(numberOrURL: String, pattern: Pattern): Boolean {
        val matcher = pattern.matcher(numberOrURL)
        return matcher.find()
    }
}