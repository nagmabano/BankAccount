package com.learning.bankaccount

fun main() {

//    val jennyBankAccout = BankAccount("Jenny Doe", 1342.20)
//    jennyBankAccout.deposit(200.0)
//    jennyBankAccout.withdraw(1200.0)
//    jennyBankAccout.deposit(100.0)
//    jennyBankAccout.withdraw(50.0)
//    jennyBankAccout.displayTransactionHistory()
//
//    println("${jennyBankAccout.accountHolder} has balance of $${jennyBankAccout.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah",0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder} has balance of $${sarahBankAccount.acctBalance()}")


}