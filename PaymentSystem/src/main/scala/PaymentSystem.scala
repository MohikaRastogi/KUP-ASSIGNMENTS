/*
* This code has implementation
* of the Paymen System
* @author Mohika
 */
package com.knoldus


/**
 * This trait defines the PaymentMethod interface
 * and provides constants and method signatures.
 */
trait PaymentMethod {
  // Constants for length of card/account numbers and expiry date/routing numbers
  val CARD_NUMBER_LENGTH = 16
  val EXPIRY_DATE_LENGTH = 5
  val ACCOUNT_NUMBER_LENGTH = 10
  val ROUTING_NUMBER_LENGTH = 9

  // Abstract method for processing payment with the implementing payment method
  def processPayment(amount: Double): String
}

/**
 * This class represents a Credit Card payment method.
 * It implements the PaymentMethod trait and provides
 * the implementation of the processPayment method.
 */
case class CreditCard(cardNumber: String, expiryDate: String) extends PaymentMethod {
  override def processPayment(amount: Double): String = {
    if (cardNumber.length != CARD_NUMBER_LENGTH || expiryDate.length != EXPIRY_DATE_LENGTH) {
      throw new IllegalArgumentException("Invalid credit card details")
    } else {
      // Process payment using credit card
      s"Payment of $amount processed using Credit Card $cardNumber"
    }
  }
}

/**
 * This class represents a PayPal payment method.
 * It implements the PaymentMethod trait and provides
 * the implementation of the processPayment method.
 */
case class PayPal(email: String, password: String) extends PaymentMethod {
  override def processPayment(amount: Double): String = {
    if (email.isEmpty || password.isEmpty) {
      throw new IllegalArgumentException("Invalid PayPal details")
    } else {
      // Process payment using PayPal
      s"Payment of $amount processed using PayPal with email $email"
    }
  }
}

/**
 * This class represents a Bank Transfer payment method.
 * It implements the PaymentMethod trait and provides
 * the implementation of the processPayment method.
 */
case class BankTransfer(accountNumber: String, routingNumber: String) extends PaymentMethod {
  override def processPayment(amount: Double): String = {
    if (accountNumber.length != ACCOUNT_NUMBER_LENGTH || routingNumber.length != ROUTING_NUMBER_LENGTH) {
      throw new IllegalArgumentException("Invalid bank transfer details")
    } else {
      // Process payment using bank transfer
      s"Payment of $amount processed using Bank Transfer with account number $accountNumber and routing number $routingNumber"
    }
  }
}

/**
 * This class represents the Payment System and provides methods
 * for adding payment methods, processing payments, and listing
 * payment methods.
 */
class PaymentSystem {
  // List of payment methods available
  private var paymentMethods: List[PaymentMethod] = List.empty

  /**
   * This method adds a new payment method to the system.
   *
   * @param paymentMethod the payment method to add
   */
  def addPaymentMethod(paymentMethod: PaymentMethod): Unit = {
    paymentMethods = paymentMethods :+ paymentMethod
    println(s"New payment method added: $paymentMethod")
  }

  /**
   * This method processes a payment using a specified payment method.
   * If the payment fails, an error message is printed.
   *
   * @param amount        the amount to be paid
   * @param paymentMethod the payment method to use
   */
  def processPayment(amount: Double, paymentMethod: PaymentMethod): String = {
    if (amount <= 0)
      throw new IllegalArgumentException("enter valid amount")
    else {
      val payment = paymentMethod.processPayment(amount)
      s"Payment processed successfully"
    }
  }

  /**
   * This method lists all payment methods available in the system.
   */
  def listPaymentMethods(): List[PaymentMethod] = {
    paymentMethods
  }
}



