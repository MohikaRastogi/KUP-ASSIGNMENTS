package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.Map

class BankingApplicationTest extends AnyFunSuite
{
  // global instance of BankingApplicationClass
  val bankingObject = new BankingApplication()


  test("Create account should add the new account number to accounts Map")
  {
    val openingBalance = 2000.0
    val result: Map[Long, Double] = bankingObject.createAccount(openingBalance)
    assert(bankingObject.accounts.head._1 == result.head._1)

  }
  test("list all accounts method should list the same number of accounts as are in list")
  {
    assert(bankingObject.accounts.size == bankingObject.listAllAccounts().size)
  }

  test("fetch balance should fetch the balance of corresponding account number")
  {
    val addAccount = bankingObject.createAccount(2000.0)
    // extracting the key (random number) generated for new account
    val getAccountNumber = addAccount.head._1
    val result = bankingObject.fetchAccountBalance(getAccountNumber)
    // result should return the opening balance passed = 2000
    assert(result == 2000.0)
  }

  test("fetchAccountBalance should throw an exception for a non-existent account number") {
    val app = new BankingApplication
    intercept[NoSuchElementException]
      {
        app.fetchAccountBalance(5678L) // try to fetch a non existing account balance
      }
  }

  test("updateBalance should update the account balance based on the list of transactions") {

    val getAccountNumber = bankingObject.createAccount(5000.0).head._1

    val transactions = List(
      Transactions(1L, getAccountNumber, "credit", 500.0),
      Transactions(2L, getAccountNumber, "debit", 200.0)
    )

    bankingObject.updateBalance(transactions)
    assert(bankingObject.accounts(getAccountNumber) == 2300.0)
  }

  test("deleteAccount should remove account from the accounts map") {
    val accountNumber = 123456789L
    val initialBalance = 1000.0
    bankingObject.accounts += (accountNumber -> initialBalance)

    // accounts should contain new accountnumber
    assert(bankingObject.accounts.contains(accountNumber))
    val result = bankingObject.deleteAccount(accountNumber)

    assert(result == true)
    //after deleting it should remove that accounts entry
    assert(!bankingObject.accounts.contains(accountNumber))
  }
}


