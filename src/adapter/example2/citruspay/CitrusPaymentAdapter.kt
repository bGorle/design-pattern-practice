package adapter.example2.citruspay

import adapter.example2.Payment

class CitrusPaymentAdapter: Payment {
    private val citrusPayment = CitrusPayment()

    override fun makePayment(amount: Double) {
        citrusPayment.makeCitrusPay(amount)
    }
}