package com.google.kotlin.commons.classes

fun main(args: Array<String>) {
    val bankAccount1 = BankAccount("John", 2000.0)
    val bankAccount2 = BankAccount("Ivan", 5000.0)
    val bankAccount3 = BankAccount("Peter", 7000.0)

    println(bankAccount1.number)
    println(bankAccount2.number)
    println(bankAccount3.number)

    println(bankAccount1.toString())
    println(bankAccount2.toString())
    println(bankAccount3.toString())
}

class BankAccount(owner:String, sum:Double) {
    var owner = owner
    var sum = sum
    var number = getTheBankAccountNumber()

    companion object {
        var counter = 0
        fun getTheBankAccountNumber():Int {return ++counter}
    }

    override fun toString(): String {
        return "BankAccount: owner='$owner', sum=${sum}BGN, BankAccountId -> UBBSOFBG${number}BGN"
    }

}