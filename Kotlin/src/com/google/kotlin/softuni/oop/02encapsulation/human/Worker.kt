package com.google.kotlin.softuni.oop.`02encapsulation`.human

class Worker(name: String, age: Int, company: String, salary: Double) : Person(name, age) {
    var company: String = company
        set(value) {
            if (company.isBlank()) {
                throw IllegalArgumentException("eere")
            }
            field = value
        }

    var salary: Double = salary
        set(value) {
            if (salary in 0.0..0.9999999999){
                throw IllegalArgumentException(ExceptionMessages.INVALID_SALARY_ZERO)
            }
            if (salary <=100) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_SALARY)
            }
            field = value
        }

    override fun work() {
        println("$name from company $company and age $age started working. His salary is $salary")
    }

    fun getWorkerSalary(): Double {
        return this.salary
    }

    override fun toString(): String {
        return "Worker $name from $company' has salary: $salary!"
    }


}