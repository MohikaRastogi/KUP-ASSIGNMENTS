/*
* This file contains the driver code for the payment system class
* and creates instances of payment methods to be added to the payment system.
* It also processes payments using the payment system and lists the available payment methods.
* Author: Mohika
*  */

package com.knoldus

import scala.io.StdIn

object DriverMain extends App {
  // Creating an instance of the payment system
  private val paymentSystem = new PaymentSystem

  // Creating instances of payment methods to be added to the payment system
  println("Enter credit card number and expiry date as string  eg:- 1234567890123456 and date: 12/25")
  private val cardNumber = StdIn.readLine()
  private val expiryDate = StdIn.readLine()

  println("Enter email and password for paypal")
  private val email = StdIn.readLine()
  private val password = StdIn.readLine()

  println("Enter account number and routing number")
  private val accountNumber = StdIn.readLine()
  private val routingNUmber = StdIn.readLine()
  private val creditCard = CreditCard(cardNumber, expiryDate)
  private val payPal = PayPal(email, password)
  private val bankTransfer = BankTransfer(accountNumber, routingNUmber)

  // Adding payment methods to the payment system
  paymentSystem.addPaymentMethod(creditCard)
  paymentSystem.addPaymentMethod(payPal)
  paymentSystem.addPaymentMethod(bankTransfer)

  // Processing payment using different payment methods
  println("Enter the amount to be processed")
  val amount = StdIn.readDouble()

  try {
    paymentSystem.processPayment(amount, creditCard)
    paymentSystem.processPayment(amount, payPal)
    paymentSystem.processPayment(amount, bankTransfer)

    // Listing all the available payment methods in the payment system
    println(paymentSystem.listPaymentMethods())
  }
  catch {
    case wrongDetails: IllegalArgumentException => println(s"Error: ${wrongDetails.getMessage}")
    case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")
  }
}
