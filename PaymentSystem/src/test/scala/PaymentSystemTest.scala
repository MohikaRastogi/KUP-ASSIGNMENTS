
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PaymentSystemTest extends AnyFlatSpec {

  "PaymentSystem" should "add new payment method to the system" in {
    val paymentSystem = new PaymentSystem
    val creditCard = CreditCard("1234567890123456", "12/25")
    paymentSystem.addPaymentMethod(creditCard)
    assert(paymentSystem.listPaymentMethods().contains(creditCard))
  }

  it should "process payment using a specified payment method" in {
    val paymentSystem = new PaymentSystem
    val creditCard = CreditCard("1234567890123456", "12/25")
    val amount = 1000.0
    val result = paymentSystem.processPayment(amount, creditCard)
    assert(result == "Payment processed successfully")
  }

  it should "throw an error when an invalid payment method is used" in {
    val paymentSystem = new PaymentSystem
    val invalidPaymentMethod = BankTransfer("1234", "567")
    val amount = 1000.0
    assertThrows[IllegalArgumentException] {
      paymentSystem.processPayment(amount, invalidPaymentMethod)
    }
  }

  it should "list all payment methods available in the system" in {
    val paymentSystem = new PaymentSystem
    val creditCard = CreditCard("1234567890123456", "12/25")
    val payPal = PayPal("john.doe@example.com", "password")
    val bankTransfer = BankTransfer("1234567890", "987654321")
    paymentSystem.addPaymentMethod(creditCard)
    paymentSystem.addPaymentMethod(payPal)
    paymentSystem.addPaymentMethod(bankTransfer)
    val result = paymentSystem.listPaymentMethods()
    assert(result == List(creditCard, payPal, bankTransfer))
  }

  it should "throw an error when an invalid amount is entered" in {
    val paymentSystem = new PaymentSystem
    val creditCard = CreditCard("1234567890123456", "12/25")
    val invalidAmount = -1000.0
    assertThrows[IllegalArgumentException] {
      paymentSystem.processPayment(invalidAmount, creditCard)
    }
  }

}
