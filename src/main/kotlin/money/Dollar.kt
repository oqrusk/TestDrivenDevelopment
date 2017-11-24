package money

class Dollar constructor(amount: Int) : Money(amount, "USD") {
    override fun times(multiplier: Int): Money = Dollar(amount * multiplier)
}