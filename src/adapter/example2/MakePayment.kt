package adapter.example2

class MakePayment {
    lateinit var payment: Payment

    fun makePayment(amount: Double) {
        payment.makePayment(amount)
    }
}