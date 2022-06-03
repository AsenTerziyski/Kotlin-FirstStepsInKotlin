package com.google.kotlin.softuni.oop.SOLID.exercise.model.layouts

import com.google.kotlin.softuni.oop.SOLID.exercise.api.Layout

class XmlLayout : Layout {
    override fun getLayout(): String {
        val sb = StringBuilder()
        return sb
            .append("<log>")
            .append(System.lineSeparator())
            .append("<date>%s</date>")
            .append(System.lineSeparator())
            .append("<level>%s</level>")
            .append(System.lineSeparator())
            .append("<message>%s</message>")
            .append(System.lineSeparator())
            .append("</log>").toString().trim()
    }
}