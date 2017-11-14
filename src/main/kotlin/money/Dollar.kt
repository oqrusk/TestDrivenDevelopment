package money

class Dollar constructor(amount: Int) {

    var amount:Int = amount

    fun times(multiplier: Int) : Dollar? = Dollar(amount * multiplier)

}