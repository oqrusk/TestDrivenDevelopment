package money

class Franc constructor(amount: Int, currency: String?) : Money(amount, currency) {
    override fun times(multiplier: Int): Money = Money(amount * multiplier, currency)
}