package money

class Franc constructor(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Money = Franc(amount * multiplier)

}