package adapter.example2

import kotlin.random.Random

fun main() {
    val makePayment = MakePayment()
    makePayment.payment = PaymentFactory.paymentAdapter(Random.nextInt(0, 3))
    makePayment.makePayment(100.0)
}