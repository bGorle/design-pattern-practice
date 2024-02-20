package adapter.example2

import adapter.example2.citruspay.CitrusPaymentAdapter
import adapter.example2.payu.PayUPaymentAdapter
import adapter.example2.phonepe.PhonePePaymentAdapter

object PaymentFactory {

    fun paymentAdapter(paymentType: Int): Payment {
        return when (paymentType) {
            0 -> CitrusPaymentAdapter()
            1 -> PayUPaymentAdapter()
            2 -> PhonePePaymentAdapter()
            else -> throw IllegalArgumentException()
        }
    }
}
