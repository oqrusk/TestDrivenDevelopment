package money

class Franc constructor(amount: Int) : Money(amount, "CHF") {

    override fun times(multiplier: Int): Money = Franc(amount * multiplier)

}