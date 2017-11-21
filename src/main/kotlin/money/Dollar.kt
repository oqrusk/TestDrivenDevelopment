package money

class Dollar constructor(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Money = Dollar(amount * multiplier)

}