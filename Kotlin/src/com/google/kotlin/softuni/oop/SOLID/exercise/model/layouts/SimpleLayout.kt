package com.google.kotlin.softuni.oop.SOLID.exercise.model.layouts


//имената на папките в котлин да не започват с digit!
import com.google.kotlin.softuni.oop.SOLID.exercise.api.Layout


class SimpleLayout: Layout {
    override fun getLayout(): String {
        return "%s - %s - %s"
    }

}