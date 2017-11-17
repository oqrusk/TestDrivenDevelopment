package money

class Dollar constructor(amount: Int) {

    private var amount: Int = amount

    fun times(multiplier: Int) : Dollar = Dollar(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        val dollar = other as? Dollar ?: return false
        return amount == dollar.amount
    }
}