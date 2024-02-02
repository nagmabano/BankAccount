package com.learning.bankaccount

class BankAccount(var accountHolder:String, var balance: Double) {
    // private key makes variables inaccessible from outside of the given class we are in
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount:Double) {

    }

    fun withdraw(amount: Double) {

    }

    fun displayTransactionHistory() {

    }
}