package com.knoldus

import scala.util.Random
import scala.collection.mutable.Map

class BankingApplication() {
  val accounts = Map.empty[Long, Double]

  def createAccount(openingBalance: Double): Map[Long, Double] = {
    val randomAccountNumber = Random.nextLong()
    //if accounts has same account number generated then regenerate the account number
    //account number should be unique
    if (accounts.contains(randomAccountNumber)) {
      createAccount(openingBalance)
      //else create new account and update accounts Map
    } else
      accounts += (randomAccountNumber -> openingBalance)

  }

  def listAllAccounts(): Map[Long, Double] =
    accounts

  def fetchAccountBalance(accountNumber: Long): Double = {
    if (accounts.contains(accountNumber))
      accounts(accountNumber)
    else
      throw new NoSuchElementException(s"Account number $accountNumber not found.")
  }


  def updateBalance(transactions: List[Transactions]): Map[Long, Double] = {
    transactions.foreach {
      transaction =>
        val amountToDebitOrCredit = transaction.amount
        val finalBalance = transaction.transactionType match {
          case "credit" => accounts(transaction.accountNumber) + amountToDebitOrCredit
          case "debit" => accounts(transaction.accountNumber) - amountToDebitOrCredit
          case _ => accounts(transaction.accountNumber)
        }

        accounts += (transaction.accountNumber -> finalBalance)
    }
    accounts
  }

  def deleteAccount(accountNumber: Long): Boolean = {
    if (accounts.contains(accountNumber)) {
      accounts -= accountNumber
      true
    }
    else
      false
  }

}
