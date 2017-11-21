package money

class Dollar constructor(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Dollar = Dollar(amount * multiplier)

}