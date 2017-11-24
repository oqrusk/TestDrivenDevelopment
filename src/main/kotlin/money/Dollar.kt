package money

class Dollar constructor(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money = Dollar(amount * multiplier)

}