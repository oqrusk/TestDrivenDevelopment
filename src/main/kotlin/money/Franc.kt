package money

class Franc constructor(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money = Franc(amount * multiplier)

}