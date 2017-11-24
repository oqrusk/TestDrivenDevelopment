package money

abstract class Money(amount: Int, currency: String?) {
    internal var amount: Int = amount
    protected var currency = currency

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
        fun franc(amount: Int): Franc = Franc(amount)

    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && javaClass.equals(money.javaClass)
    }

    fun currency(): String? = currency
}