package adapter.example2.payu

import adapter.example2.Payment

class PayUPaymentAdapter: Payment {
    private val payUPayment = PayUPayment()

    override fun makePayment(amount: Double) {
        payUPayment.makePayUPayment(amount)
    }
}