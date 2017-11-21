package money

class Franc constructor(amount: Int) {

    private var amount: Int = amount

    fun times(multiplier: Int): Franc = Franc(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        val dollar = other as? Franc ?: return false
        return amount == dollar.amount
    }
}