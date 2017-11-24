package money

open class Money(amount: Int, currency: String?) : Expression {

    internal var amount: Int = amount
    internal var currency = currency

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression = Sum(this, addend)

    override fun reduce(to: String): Money = this

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && currency.equals(money.currency)
    }

    fun currency(): String? = currency

}