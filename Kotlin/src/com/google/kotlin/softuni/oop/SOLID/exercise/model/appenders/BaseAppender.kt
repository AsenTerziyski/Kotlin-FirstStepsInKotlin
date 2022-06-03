package com.google.kotlin.softuni.oop.SOLID.exercise.model.appenders

import com.google.kotlin.softuni.oop.SOLID.exercise.api.Appender
import com.google.kotlin.softuni.oop.SOLID.exercise.api.Layout
import com.google.kotlin.softuni.oop.SOLID.exercise.enums.ReportLevel
import java.lang.String

abstract class BaseAppender(var layout: Layout) : Appender {

    var reportLevel: ReportLevel = ReportLevel.INFO
    var messagesAppendedCount: Int = 0

    override fun appendMessage() {

    }

    override fun setReportLevel() {

    }
}