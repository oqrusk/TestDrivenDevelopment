package money

open class Money(amount: Int, currency: String?) {
    internal var amount: Int = amount
    internal var currency = currency

    open fun times(multiplier: Int): Money? = null

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")

    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && javaClass.equals(money.javaClass)
    }

    fun currency(): String? = currency

    override fun toString(): String = "Money(amount=$amount, currency=$currency)"

}