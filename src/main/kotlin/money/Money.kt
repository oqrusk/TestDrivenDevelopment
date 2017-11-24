package money

open class Money(amount: Int, currency: String?) : Expression {
    private var amount: Int = amount
    private var currency = currency

    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression = Money(amount + addend.amount, currency)

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")

    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && currency.equals(money.currency)
    }

    fun currency(): String? = currency

}