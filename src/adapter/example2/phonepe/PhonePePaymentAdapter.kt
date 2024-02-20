package adapter.example2.phonepe

import adapter.example2.Payment

class PhonePePaymentAdapter: Payment {
    private val phonePePayment = PhonePePayment()

    override fun makePayment(amount: Double) {
        phonePePayment.makeUpiPayment(amount)
    }
}